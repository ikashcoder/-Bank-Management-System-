package ASimulatorSystem;

import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;

public class Balance{

    String card =null;
    String Pin =null;
    String amountString=null;
    long total_Deposite = 0;
    long total_Withdraw = 0;

    public Balance(String card,String pin,String amount){

        this.card =card;
        this.Pin =pin;
        this.amountString =amount;
    
    }

    public void withdraw(){
        
        try{

            Date date =new Date();

            Conn dbConn =new Conn();
            //get the total Deposite amount
            String queryString1 = "select sum(amount) from bank where type ='Deposite' and cardno='"+card+"';";
            ResultSet rs1 = dbConn.dbstatement.executeQuery(queryString1);
            if(rs1.next())
            {
                total_Deposite = rs1.getLong("sum(amount)");
            }
            //get the total withdraw amount
            String queryString2 = "select sum(amount) from bank where type ='Withdraw' and cardno='"+card+"';";
            ResultSet rs2 = dbConn.dbstatement.executeQuery(queryString2);
            if(rs2.next())
            {
                total_Withdraw = rs2.getLong("sum(amount)");
            }
            //Check calculation that balance is sufficient for withdrawl or not
            long balance = total_Deposite - total_Withdraw;

            //convert string into long 
            long withdraw_amount = Long.parseLong(amountString);

            if(balance >= withdraw_amount){

                String queryString3 ="insert into bank values('"+card+"','"+Pin+"','"+date+"','Withdraw','"+amountString+"')";
                dbConn.dbstatement.executeUpdate(queryString3);

                long rem_balance = balance -withdraw_amount;

                JOptionPane.showMessageDialog(null,"rs "+amountString+" has been Withdraw \n Balance :"+rem_balance);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Insufficient Balance !");
                }

            }
            catch(Exception e){
                System.out.println(e);
            }

    }
}