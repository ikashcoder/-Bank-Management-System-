package ASimulatorSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener{

    //Globaly declare it because of Access for actionPerformed function .
    JButton signinButton ,clearButton ,signupButton ;
    JTextField cardTextField  ;
    JPasswordField pinTextField ;
    Login(){

        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");

        ImageIcon logo =new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));

        
        // adding Image
        Image logo2 =logo.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon logo3 =new ImageIcon(logo2);
        JLabel logoLabel = new JLabel(logo3);
        add(logoLabel);
        logoLabel.setBounds(70,10,100,100);

        // Adding lable 
        JLabel title =new JLabel("Welcome To ATM");
        title.setBounds(200,40,400,40);
        add(title);
        title.setFont(new Font("Osward",Font.BOLD,38));

        //card lable 
        JLabel cardno =new JLabel("Card No :");
        cardno.setBounds(120,150,150,30);
        add(cardno);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));

        // card textfield
        cardTextField =new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        //pin lable 
        JLabel pin =new JLabel("PIN :");
        pin.setBounds(120,220,150,30);
        add(pin);
        pin.setFont(new Font("Raleway",Font.BOLD,28));

        // pin passfield
        pinTextField =new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        //sign in button 
        signinButton = new JButton("SIGN IN");
        signinButton.setBounds(300,300,100,30);
        signinButton.setBackground(Color.BLACK);
        signinButton.setForeground(Color.white);
        signinButton.addActionListener(this);
        add(signinButton);

        // clear button 
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(430,300,100,30);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.white);
        clearButton.addActionListener(this);
        add(clearButton);

        //SIGN UP BUTTON
        signupButton = new JButton("SIGN UP");
        signupButton.setBounds(300,350,230,30);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.white);
        signupButton.addActionListener(this);
        add(signupButton);



        //frame functions 
        setSize(800,500);
        setVisible(true);
        setLocation(350,180);
        getContentPane().setBackground(Color.WHITE);


    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clearButton) {
            cardTextField.setText("");
            pinTextField.setText("");

            
        }else if(ae.getSource() == signinButton) {
            String cardNumber =cardTextField.getText();
            String pinNum =pinTextField.getText();

            String queryString="Select * from login where cardnumber ='"+cardNumber+"' and Pin ='"+pinNum+"'";

            try{
                Conn dbconn =new Conn();
                ResultSet rs = dbconn.dbstatement.executeQuery(queryString);
                if(rs.next()){
                    setVisible(true);
                    new Transactions(cardNumber,pinNum).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect card number or pin !");
                }

            }catch(Exception e){

                System.out.println(e);
            }
            
        }else if(ae.getSource() ==signupButton){
            //We have setVisible false for disapper the screen 
            setVisible(false);
            //Create the object of SignUpOne class and set visibility true because it is by default false .
            new SignUpOne().setVisible(true);

        }
    }
    public static void main(String args[]){
        new Login();
    }
}


