package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener {

    JButton depositeButt,fcashButt,pinchangeButt,withdrawButt,stateButt,balanceButt,exitButt;
    String PIN;
    String CardNo;

    public Transactions(String Card ,String pinNum){
        //setting pin
        this.CardNo= Card;
        this.PIN =pinNum;
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

        //Creating label for choosing transaction title
        JLabel titlLabel =new JLabel("Please Select your Transaction");
        titlLabel.setBounds(175,240,700,35);
        titlLabel.setForeground(Color.WHITE);
        titlLabel.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(titlLabel);


        //creating buttons 
        depositeButt =new JButton("Deposite");
        depositeButt.setFont(new Font("System",Font.BOLD,14));
        depositeButt.setBounds(115,365,150,30);
        depositeButt.addActionListener(this);
        ATMimage.add(depositeButt);

        fcashButt =new JButton("Fast Cash");
        fcashButt.setFont(new Font("System",Font.BOLD,14));
        fcashButt.setBounds(115,400,150,30);
        fcashButt.addActionListener(this);
        ATMimage.add(fcashButt);

        pinchangeButt =new JButton("Pin Change");
        pinchangeButt.setFont(new Font("System",Font.BOLD,14));
        pinchangeButt.setBounds(115,435,150,30);
        pinchangeButt.addActionListener(this);
        ATMimage.add(pinchangeButt);

        //second button row
        withdrawButt =new JButton("Cash Withdrawl");
        withdrawButt.setFont(new Font("System",Font.BOLD,14));
        withdrawButt.setBounds(305,365,150,30);
        withdrawButt.addActionListener(this);
        ATMimage.add(withdrawButt);

        stateButt =new JButton("Mini Statement");
        stateButt.setFont(new Font("System",Font.BOLD,14));
        stateButt.setBounds(305,400,150,30);
        stateButt.addActionListener(this);
        ATMimage.add(stateButt);

        balanceButt =new JButton("Balance Enquiry");
        balanceButt.setFont(new Font("System",Font.BOLD,14));
        balanceButt.setBounds(305,435,150,30);
        balanceButt.addActionListener(this);
        ATMimage.add(balanceButt);
     
        exitButt =new JButton("EXIT");
        exitButt.setFont(new Font("System",Font.BOLD,14));
        exitButt.setBounds(305,470,150,30);
        exitButt.addActionListener(this);
        ATMimage.add(exitButt);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==depositeButt){
            setVisible(false);
            new Deposite(CardNo,PIN).setVisible(true);
            
        }else if(ae.getSource()==fcashButt){
            setVisible(false);
            new FastCash(CardNo, PIN);

        }else if(ae.getSource()==pinchangeButt){
            setVisible(false);
            new ChangePin(CardNo, PIN);
            
        }else if(ae.getSource()==withdrawButt){
            setVisible(false);
            new Withdrawl(CardNo, PIN);
        }else if(ae.getSource()==stateButt){
            new MiniSatement(CardNo, PIN);
        }else if(ae.getSource()==balanceButt){
            setVisible(false);
            new BalanceEnquiry(CardNo, PIN);
            
        }else if(ae.getSource()==exitButt){
            System.exit(0);

        }

    }
    public static void main (String args[]){
        new Transactions("","");
    }
    
}

