package ASimulatorSystem;


import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;



public class MiniSatement extends JFrame{
    
    String Card=null;
    String pin =null;
    long balance=0;
    long total_Deposite = 0;
    long total_Withdraw = 0;

    public MiniSatement(String card,String pin){

        this.Card =card;
        this.pin= pin;

        //creating frame 
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

        //Bank name label
        JLabel bankName =new JLabel("Indian Bank");
        bankName.setBounds(160,20,100,20);
        add(bankName);

        //Card Number label
        JLabel cardLabel =new JLabel("Card Number :" +Card.substring(0,4)+"XXXXXXXX"+ Card.substring(12));
        cardLabel.setBounds(20,80,300,20);
        add(cardLabel);

        //create label for showing all details 
        JLabel miniLabel =new JLabel();
        miniLabel.setBounds(20,140,400,200);
        add(miniLabel);

        //creating label for showing balance
        JLabel showBalance =new JLabel();
        showBalance.setBounds(20,400,300,20);
        add(showBalance);

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

           showBalance.setText("Your current account balance is Rs. : "+String.valueOf(balance));

       } catch (Exception e) {
           System.out.println(e);
       }

        try{
            Conn dbconn =new Conn();

            String queryString ="SELECT * FROM bank ORDER BY date DESC LIMIT 5;";
            ResultSet rs= dbconn.dbstatement.executeQuery(queryString);
            while (rs.next()) {
                miniLabel.setText(miniLabel.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
            }

        }catch(Exception e){
            System.out.println(e);
        }



    }
    public static void main(String args[]){
        new MiniSatement("" ,"");
    }
}
