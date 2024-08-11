package ASimulatorSystem;

import java.sql.*;

public class Conn {

    Connection dbconnection;
    Statement dbstatement;
    public Conn(){
        try {
            //Register the Driver 
            // not required
            // Class.forName(com.mysql.cj.jdbc.Driver);

            //Create connection
            dbconnection = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","password");

            //Create statement 
            dbstatement = dbconnection.createStatement();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
