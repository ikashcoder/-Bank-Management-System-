package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener{

    JButton BackButt;
    String pin=null;
    String Card=null;
    long balance=0;
    long total_Deposite = 0;
    long total_Withdraw = 0;

    public BalanceEnquiry(String card,String pin){
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

        //Getting Balance from database
        try {
             Conn dbConn =new Conn();
            //get the total Deposite amount
            String queryString1 = "select sum(amount) from bank where type ='Deposite' and cardno='"+Card+"';";
            ResultSet rs1 = dbConn.dbstatement.executeQuery(queryString1);
            if(rs1.next())
            {
                total_Deposite = rs1.getLong("sum(amount)");
            }
            //get the total withdraw amount
            String queryString2 = "select sum(amount) from bank where type ='Withdraw' and cardno='"+Card+"';";
            ResultSet rs2 = dbConn.dbstatement.executeQuery(queryString2);
            if(rs2.next())
            {
                total_Withdraw = rs2.getLong("sum(amount)");
            }
            //Check calculation that balance is sufficient for withdrawl or not
            balance = total_Deposite - total_Withdraw;

        } catch (Exception e) {
            System.out.println(e);
        }

        //Creating label for choosing Transaction title
        JLabel titlLabel =new JLabel("Your current Account balance is Rs "+balance);
        titlLabel.setBounds(115,240,400,25);
        titlLabel.setForeground(Color.WHITE);
        titlLabel.setFont(new Font("System",Font.BOLD,14));
        ATMimage.add(titlLabel);

      
    
        BackButt =new JButton("BACK");
        BackButt.setFont(new Font("System",Font.BOLD,14));
        BackButt.setBounds(305,470,150,30);
        BackButt.addActionListener(this);
        ATMimage.add(BackButt);

    }
    public void actionPerformed(ActionEvent ae){

        setVisible(false);
        new Transactions(Card,pin).setVisible(true);
    }
    public static void main(String[] args) {
        new BalanceEnquiry("","");
    }
}