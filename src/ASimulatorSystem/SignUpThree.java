package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignUpThree extends JFrame implements ActionListener{

    String formNumber =null;
   
    JRadioButton SavingAccButton,FixedAccButton,CurrentAccButton,RecurringAccButton;
    JCheckBox AtmCheck,InternetBCheck, MobileBCheck,EmailCheck, ChequeBookCheck, statementCheck, declaresCheck;
    JButton submitButton,cancleButton;

    public SignUpThree(String number){
        //Initialize the number 
        this.formNumber =number;
        //Setting the frame 
        setSize(700,820);
        setVisible(true);
        setLocation(350,0);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("SIGN UP FORM");

        //Account Details Label 
        JLabel AccountDetails =new JLabel("Page 3 : Account Details");
        AccountDetails.setBounds(220,40,400,40);
        AccountDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(AccountDetails);

        //Account type label
        JLabel AccountTypeLabel =new JLabel("Account type");
        AccountTypeLabel.setBounds(100,140,200,30);
        AccountTypeLabel.setFont(new Font("Raleway",Font.BOLD,22));
        add(AccountTypeLabel);
        //which type of account create radio buttons 
        SavingAccButton =new JRadioButton("Saving Account");
        SavingAccButton.setBounds(100,180,250,20);
        SavingAccButton.setBackground(Color.WHITE);
        SavingAccButton.setFont(new Font("Raleway",Font.BOLD,14));
        add(SavingAccButton);

        FixedAccButton =new JRadioButton("Fixed Deposite Account");
        FixedAccButton.setBounds(350,180,250,20);
        FixedAccButton.setBackground(Color.WHITE);
        FixedAccButton.setFont(new Font("Raleway",Font.BOLD,14));
        add(FixedAccButton);

        CurrentAccButton =new JRadioButton("Current Account");
        CurrentAccButton.setBounds(100,220,250,20);
        CurrentAccButton.setBackground(Color.WHITE);
        CurrentAccButton.setFont(new Font("Raleway",Font.BOLD,14));
        add(CurrentAccButton);

        RecurringAccButton =new JRadioButton("Recurring Deposite Account");
        RecurringAccButton.setBounds(350,220,250,20);
        RecurringAccButton.setBackground(Color.WHITE);
        RecurringAccButton.setFont(new Font("Raleway",Font.BOLD,14));
        add(RecurringAccButton);

        ButtonGroup AccButtonG =new ButtonGroup();
        AccButtonG.add(SavingAccButton);
        AccButtonG.add(FixedAccButton);
        AccButtonG.add(CurrentAccButton);
        AccButtonG.add(RecurringAccButton);

        // Card Number Label
        JLabel cardLabel =new JLabel("Card Number");
        cardLabel.setBounds(100,270,200,30);
        cardLabel.setFont(new Font("Raleway",Font.BOLD,22));
        add(cardLabel);

        JLabel NumberLabel =new JLabel("XXXX-XXXX-XXXX-"+formNumber);
        NumberLabel.setBounds(330,270,400,30);
        NumberLabel.setFont(new Font("Raleway",Font.BOLD,22));
        add(NumberLabel);

        JLabel CDiscriptionLabel =new JLabel("Your 16 Digit Card Number");
        CDiscriptionLabel.setBounds(100,300,300,20);
        CDiscriptionLabel.setFont(new Font("Raleway",Font.BOLD,12));
        add(CDiscriptionLabel);
        
        //PIN label
        JLabel PINLabel =new JLabel("PIN");
        PINLabel.setBounds(100,340,200,30);
        PINLabel.setFont(new Font("Raleway",Font.BOLD,22));
        add(PINLabel);

        JLabel pinNumberLabel =new JLabel("XXXX");
        pinNumberLabel.setBounds(330,340,100,30);
        pinNumberLabel.setFont(new Font("Raleway",Font.BOLD,22));
        add(pinNumberLabel);

        JLabel PDiscriptionLabel =new JLabel("Your 4 Digit Password");
        PDiscriptionLabel.setBounds(100,370,300,20);
        PDiscriptionLabel.setFont(new Font("Raleway",Font.BOLD,12));
        add(PDiscriptionLabel);

        // Services label 
        JLabel ServiceLabel =new JLabel("Services Required");
        ServiceLabel.setBounds(100,420,200,30);
        ServiceLabel.setFont(new Font("Raleway",Font.BOLD,22));
        add(ServiceLabel);

        //Create check box for services 
        AtmCheck =new JCheckBox("ATM CARD");
        AtmCheck.setBounds(100,470,150,20);
        AtmCheck.setFont(new Font("Raleway",Font.BOLD,14));
        AtmCheck.setBackground(Color.WHITE);
        add(AtmCheck);

        InternetBCheck =new JCheckBox("Internet Banking");
        InternetBCheck.setBounds(350,470,150,20);
        InternetBCheck.setFont(new Font("Raleway",Font.BOLD,14));
        InternetBCheck.setBackground(Color.WHITE);
        add(InternetBCheck);

        MobileBCheck =new JCheckBox("Mobile Banking");
        MobileBCheck.setBounds(100,520,150,20);
        MobileBCheck.setFont(new Font("Raleway",Font.BOLD,14));
        MobileBCheck.setBackground(Color.WHITE);
        add(MobileBCheck);

        EmailCheck =new JCheckBox("Email and SMS Alerts");
        EmailCheck.setBounds(350,520,300,20);
        EmailCheck.setFont(new Font("Raleway",Font.BOLD,14));
        EmailCheck.setBackground(Color.WHITE);
        add(EmailCheck);

        ChequeBookCheck =new JCheckBox("Cheque Book");
        ChequeBookCheck.setBounds(100,570,150,20);
        ChequeBookCheck.setFont(new Font("Raleway",Font.BOLD,14));
        ChequeBookCheck.setBackground(Color.WHITE);
        add(ChequeBookCheck);

        statementCheck =new JCheckBox("E-Statements");
        statementCheck.setBounds(350,570,150,20);
        statementCheck.setFont(new Font("Raleway",Font.BOLD,14));
        statementCheck.setBackground(Color.WHITE);
        add(statementCheck);

        //Declaration Checkbox 
        declaresCheck =new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        declaresCheck.setBounds(100,620,600,20);
        declaresCheck.setFont(new Font("Raleway",Font.BOLD,12));
        declaresCheck.setBackground(Color.WHITE);
        add(declaresCheck);

        //make submit button 
        submitButton =new JButton("Submit");
        submitButton.setBounds(170,670,100,30);
        submitButton.setFont(new Font("Raleway",Font.BOLD,14));
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.addActionListener(this);
        add(submitButton);


        //make cancle button 
        cancleButton =new JButton("Cancle");
        cancleButton.setBounds(370,670,100,30);
        cancleButton.setFont(new Font("Raleway",Font.BOLD,14));
        cancleButton.setBackground(Color.BLACK);
        cancleButton.setForeground(Color.WHITE);
        cancleButton.addActionListener(this);
        add(cancleButton);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submitButton)
        {
            String accountType = null;
            if(SavingAccButton.isSelected()){
                accountType = "Saving Account";
            }else if(FixedAccButton.isSelected()){
                accountType = "Fixed Deposite Account";
            }else if(CurrentAccButton.isSelected()){
                accountType = "Current Account";
            }else if(RecurringAccButton.isSelected()){
                accountType = "Recurring Deposite Account";
            }

            //Generating random number for card and password
            Random random =new Random();
            String CardLong =""+ Math.abs((random.nextLong() % 90000000L)+5040936000000000L);
            String Pin =""+ Math.abs((random.nextLong() % 9000L)+1000L);
            //Adding Checked facilities
            String Facilities ="";

            if(AtmCheck.isSelected()){
                Facilities = Facilities +"ATM Card";
            }else if(InternetBCheck.isSelected()){
                Facilities = Facilities +"Internet Banking";
            }else if(MobileBCheck.isSelected()){
                Facilities = Facilities +"Mobile Banking";
            }else if(EmailCheck.isSelected()){
                Facilities = Facilities +"Email and SMS Alerts";
            }else if(ChequeBookCheck.isSelected()){
                Facilities = Facilities +"Cheque Book";
            }else if(statementCheck.isSelected()){
                Facilities = Facilities +"E-Statements";
            }
            String declares = null;
            if(declaresCheck.isSelected()){
                declares ="Selected";
            }
            try{
                if(accountType.equals("") || declares.equals("")){
                    JOptionPane.showMessageDialog(null, "Form is incomplete !");

                }else{

                    Conn dbconn =new Conn();

                    String queryString ="insert into signupthree values('"+formNumber+"','"+accountType+"','"+CardLong+"','"+Pin+"','"+Facilities+"')";

                    String queryString2 ="insert into login values('"+formNumber+"','"+CardLong+"','"+Pin+"')";

                    dbconn.dbstatement.executeUpdate(queryString);
                    dbconn.dbstatement.executeUpdate(queryString2);

                    JOptionPane.showMessageDialog(null,"Card Number:"+CardLong+"\n PIN:"+Pin);
                    
                    setVisible(false);
                    new Deposite(CardLong,Pin).setVisible(true);

                }

            }catch(Exception e){
                System.out.println(e);
            }
            


        }else if(ae.getSource()== cancleButton){
            setVisible(false);
            new Login().setVisible(true);
        }

    }
    public static void main(String[] args) {
        new SignUpThree("");
    }
    
}

