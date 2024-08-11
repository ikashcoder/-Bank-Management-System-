package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Withdrawl extends JFrame implements ActionListener{

    JButton WithdrawButt ,BackButt;
    JTextField amountField;
    String pin=null;
    String Card=null;
    long total_Deposite = 0;
    long total_Withdraw = 0;
    public Withdrawl(String card,String pin){
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
        JLabel titlLabel =new JLabel("Enter the Amount You want to Withdraw");
        titlLabel.setBounds(130,240,400,35);
        titlLabel.setForeground(Color.WHITE);
        titlLabel.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(titlLabel);

        //text field that accept the value for Deposite 
        amountField =new JTextField();
        amountField.setBounds(125,290,320,25);
        amountField.setForeground(Color.BLACK);
        amountField.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(amountField);

        //Button for Withdrawl
        WithdrawButt =new JButton("Withdraw");
        WithdrawButt.setFont(new Font("System",Font.BOLD,14));
        WithdrawButt.setBounds(305,435,150,30);
        WithdrawButt.addActionListener(this);
        ATMimage.add(WithdrawButt);
     
        BackButt =new JButton("Back");
        BackButt.setFont(new Font("System",Font.BOLD,14));
        BackButt.setBounds(305,470,150,30);
        BackButt.addActionListener(this);
        ATMimage.add(BackButt);

    }
    public void actionPerformed(ActionEvent ae){

        String amountString =null;
        if(ae.getSource()==WithdrawButt){
            amountString =amountField.getText();

            if (amountString.equals("")){
                JOptionPane.showMessageDialog(null, "Amount field is Empty!");
            }
            else{
                new Balance(Card, pin, amountString).withdraw();
                setVisible(false);
                new Transactions(Card, pin);

            }
        }else if(ae.getSource()==BackButt){
            setVisible(false);
            new Transactions(Card,pin).setVisible(true);
        }

    }
    public static void main(String[] args) {
        new Withdrawl("","");
    }
}