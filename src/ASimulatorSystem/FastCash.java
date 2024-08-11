package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FastCash extends JFrame implements ActionListener {

    JButton hunButt,fivhunButt,thouButt,twothouButt,fivthouButt,tenthouButt,backButt;
    String PIN;
    String CardNo;

    public FastCash(String Card ,String pinNum){
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
        JLabel titlLabel =new JLabel("SELECT  WITHDRAW  AMOUNT");
        titlLabel.setBounds(175,240,700,35);
        titlLabel.setForeground(Color.WHITE);
        titlLabel.setFont(new Font("System",Font.BOLD,16));
        ATMimage.add(titlLabel);


        //creating buttons 
        hunButt =new JButton("Rs. 100");
        hunButt.setFont(new Font("System",Font.BOLD,14));
        hunButt.setBounds(115,365,150,30);
        hunButt.addActionListener(this);
        ATMimage.add(hunButt);

        fivhunButt =new JButton("Rs. 500");
        fivhunButt.setFont(new Font("System",Font.BOLD,14));
        fivhunButt.setBounds(115,400,150,30);
        fivhunButt.addActionListener(this);
        ATMimage.add(fivhunButt);

        thouButt =new JButton("Rs. 1000");
        thouButt.setFont(new Font("System",Font.BOLD,14));
        thouButt.setBounds(115,435,150,30);
        thouButt.addActionListener(this);
        ATMimage.add(thouButt);

        //second button row
        twothouButt =new JButton("Rs. 2000");
        twothouButt.setFont(new Font("System",Font.BOLD,14));
        twothouButt.setBounds(305,365,150,30);
        twothouButt.addActionListener(this);
        ATMimage.add(twothouButt);

        fivthouButt =new JButton("Rs. 5000");
        fivthouButt.setFont(new Font("System",Font.BOLD,14));
        fivthouButt.setBounds(305,400,150,30);
        fivthouButt.addActionListener(this);
        ATMimage.add(fivthouButt);

        tenthouButt =new JButton("Rs. 10000");
        tenthouButt.setFont(new Font("System",Font.BOLD,14));
        tenthouButt.setBounds(305,435,150,30);
        tenthouButt.addActionListener(this);
        ATMimage.add(tenthouButt);
     
        backButt =new JButton("BACK");
        backButt.setFont(new Font("System",Font.BOLD,14));
        backButt.setBounds(305,470,150,30);
        backButt.addActionListener(this);
        ATMimage.add(backButt);

    }

    public void actionPerformed(ActionEvent ae){

        String Amount =null;

        if(ae.getSource()==hunButt){
            Amount= "100";
            new Balance(CardNo, PIN, Amount).withdraw();
            new Transactions(CardNo, PIN);
           
        }else if(ae.getSource()==fivhunButt){
            Amount= "500";
            new Balance(CardNo, PIN, Amount).withdraw();
            new Transactions(CardNo, PIN);

        }else if(ae.getSource()==thouButt){
            Amount= "1000";
            new Balance(CardNo, PIN, Amount).withdraw();
            new Transactions(CardNo, PIN);

        }else if(ae.getSource()==twothouButt){
            Amount= "2000";
            new Balance(CardNo, PIN, Amount).withdraw();
            new Transactions(CardNo, PIN);

        }else if(ae.getSource()==fivthouButt){
            Amount= "5000";
            new Balance(CardNo, PIN, Amount).withdraw();
            new Transactions(CardNo, PIN);

        }else if(ae.getSource()==tenthouButt){
            Amount= "10000";
            new Balance(CardNo, PIN, Amount).withdraw();
            new Transactions(CardNo, PIN);

        }else if(ae.getSource()==backButt){
            new Transactions(CardNo, PIN);

        }

    }
    public static void main (String args[]){
        new FastCash("","");
    }
    
}

