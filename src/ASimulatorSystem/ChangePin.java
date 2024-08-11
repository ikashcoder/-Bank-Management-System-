package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangePin extends JFrame implements ActionListener{

    JButton ChangePinButt ,BackButt;
    JPasswordField firstpin ,repin ;
    String pin=null;
    String Card=null;

    public ChangePin(String card,String pin){
        //pin initialising
        this.pin =pin;
        this.Card =card;
        //creating frame 
        setLayout(null);
        setSize(800,800);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);


        //setting the background image 
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon ATMicon = new ImageIcon(i2);
        JLabel ATMimage =new JLabel(ATMicon);
        ATMimage.setBounds(0,0,800,800); 
        add(ATMimage);

        //Creating label for choosing Transaction title
        JLabel titlLabel =new JLabel("CHANGE  YOUR  PIN");
        titlLabel.setBounds(190,240,400,25);
        titlLabel.setForeground(Color.WHITE);
        titlLabel.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(titlLabel);

        //Lable for new pin
        JLabel newPinLabel =new JLabel("New Pin:");
        newPinLabel.setBounds(115,280,150,25);
        newPinLabel.setForeground(Color.WHITE);
        newPinLabel.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(newPinLabel);

         //text field that accept the value for ChangePin 
         firstpin =new JPasswordField();
         firstpin.setBounds(285,280,170,25);
         firstpin.setForeground(Color.BLACK); 
         firstpin.setFont(new Font("System",Font.BOLD,16));
         ATMimage.add(firstpin);

        //label for Re enter pin
        JLabel rePinLabel =new JLabel("Re-Enter New Pin:");
        rePinLabel.setBounds(115,320,150,25);
        rePinLabel.setForeground(Color.WHITE);
        rePinLabel.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(rePinLabel);

        //text field that accept the value for ChangePin 
        repin =new JPasswordField();
        repin.setBounds(285,320,170,25);
        repin.setForeground(Color.BLACK);
        repin.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(repin);

        //Button for Change Pin
        ChangePinButt =new JButton("CHANGE");
        ChangePinButt.setFont(new Font("System",Font.BOLD,14));
        ChangePinButt.setBounds(305,435,150,30);
        ChangePinButt.addActionListener(this);
        ATMimage.add(ChangePinButt);
     
        BackButt =new JButton("BACK");
        BackButt.setFont(new Font("System",Font.BOLD,14));
        BackButt.setBounds(305,470,150,30);
        BackButt.addActionListener(this);
        ATMimage.add(BackButt);

    }
    public void actionPerformed(ActionEvent ae){

        String pin1 =null;
        String pin2=null;

        if(ae.getSource()==ChangePinButt){
            pin1 = firstpin.getText();
            pin2 = repin.getText();


            if (pin1.equals("") || pin2.equals("")){
                JOptionPane.showMessageDialog(null, "Change Password field is Empty !");
            }
            else if(pin1.equals(pin2)){
                try{
                Conn dbConn =new Conn();
                String queryString ="UPDATE login SET Pin = '"+pin1+"' WHERE cardnumber ='"+Card+"' ;";

                String queryString1 ="UPDATE signupthree SET Pin = '"+pin1+"' WHERE cardnumber ='"+Card+"' ;";

                String queryString2 ="UPDATE bank SET Pin = '"+pin1+"' WHERE Cardno ='"+Card+"' ;";
                
                dbConn.dbstatement.executeUpdate(queryString);
                dbConn.dbstatement.executeUpdate(queryString1);
                dbConn.dbstatement.executeUpdate(queryString2);

                JOptionPane.showMessageDialog(null,"PIN Has been changed !");

                setVisible(false);
                new Transactions(Card,pin1).setVisible(true);

                }
                catch(Exception e){
                    System.out.println(e);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Please Enter Same Password"); 
            }
        }else if(ae.getSource()==BackButt){
            setVisible(false);
            new Transactions(Card,pin).setVisible(true);
        }

    }
    public static void main(String[] args) {
        new ChangePin("","");
    }
}