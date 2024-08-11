package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener{
    //Declaring some global variable
    long ranNumber;
    JTextField nameTextField,fatherTextField,EmailTextField,AddressTextField,cityTextField,StateTextField,pincodeTextField;
    JRadioButton maleButton,femaleButton,othergenButton ,marriedButton,unmarriedButton,otherMButton;
    JButton nextButton;
    JDateChooser dobdate ;
    

    public SignUpOne(){

        //Jframe functions 
        setSize(800,800);
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("SIGN UP FORM");

        //get Random Number for Application
        Random ran =new Random();
        ranNumber = Math.abs((ran.nextLong()% 9000L )+1000L);

        //Application Label
        JLabel Application =new JLabel("APPLICATION FROM NO. " + ranNumber);
        Application.setBounds(140,20,600,40);
        Application.setFont(new Font("Raleway",Font.BOLD,38));
        add(Application);

        //personalDetails Label 
        JLabel personalDetails =new JLabel("Page 1 : personal Details");
        personalDetails.setBounds(290,80,300,30);
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(personalDetails);
        
        //Name Lable
        JLabel nameLabel =new JLabel("Name:");
        nameLabel.setBounds(100,140,150,30);
        nameLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(nameLabel);
        //Name Textfield 
        nameTextField =new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(nameTextField);
         
        //Father Name Label
        JLabel fatherName =new JLabel("Father's Name:");
        fatherName.setBounds(100,190,150,30);
        fatherName.setFont(new Font("Raleway",Font.BOLD,20));
        add(fatherName);
        //Father Name  Textfield 
        fatherTextField =new JTextField();
        fatherTextField.setBounds(300,190,400,30);
        fatherTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(fatherTextField);
        
        //Date of Birth Label
        JLabel dobLabel =new JLabel("Date of Birth:");
        dobLabel.setBounds(100,240,150,30);
        dobLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(dobLabel);
        //using JDate chooser add text field to get date 
        dobdate = new JDateChooser();
        dobdate.setBounds(300,240,400,30);
        dobdate.setForeground(new Color(105,105,105));
        add(dobdate);
        


        //gender Label
        JLabel genderLabel =new JLabel("Gender:");
        genderLabel.setBounds(100,290,150,30);
        genderLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(genderLabel);
        //adding radio buttons 
        maleButton =new JRadioButton("male");
        maleButton.setBounds(300,290,60,30);
        maleButton.setBackground(Color.WHITE);
        add(maleButton);

        femaleButton =new JRadioButton("female");
        femaleButton.setBounds(450,290,120,30);
        femaleButton.setBackground(Color.WHITE);
        add(femaleButton);

        othergenButton =new JRadioButton("other");
        othergenButton.setBounds(620,290,120,30);
        othergenButton.setBackground(Color.WHITE);
        add(othergenButton);


        ButtonGroup genderButtons =new ButtonGroup();
        genderButtons.add(maleButton);
        genderButtons.add(femaleButton);
        genderButtons.add(othergenButton);


        //Email label
        JLabel EmailLabel =new JLabel("Email Address:");
        EmailLabel.setBounds(100,340,150,30);
        EmailLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(EmailLabel);
        //Email Textfield 
        EmailTextField =new JTextField();
        EmailTextField.setBounds(300,340,400,30);
        EmailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(EmailTextField);

        //Marital Status lable 
        JLabel MaritalLabel =new JLabel("Marital Status:");
        MaritalLabel.setBounds(100,390,150,30);
        MaritalLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(MaritalLabel);

        //Adding radio buttons to Marital Status
        marriedButton =new JRadioButton("married");
        marriedButton.setBounds(300,390,100,30);
        marriedButton.setBackground(Color.WHITE);
        add(marriedButton);

        unmarriedButton =new JRadioButton("unmarried");
        unmarriedButton.setBounds(450,390,100,30);
        unmarriedButton.setBackground(Color.WHITE);
        add(unmarriedButton);

        otherMButton =new JRadioButton("other");
        otherMButton.setBounds(620,390,100,30);
        otherMButton.setBackground(Color.WHITE);
        add(otherMButton);

        ButtonGroup marriedGButtons =new ButtonGroup();
        marriedGButtons.add(marriedButton);
        marriedGButtons.add(unmarriedButton);
        marriedGButtons.add(otherMButton);

        

        //Address Label
        JLabel AddressLabel =new JLabel("Address :");
        AddressLabel.setBounds(100,440,150,30);
        AddressLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(AddressLabel);
        
        //Address Textfield 
        AddressTextField =new JTextField();
        AddressTextField.setBounds(300,440,400,30);
        AddressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(AddressTextField);

        // city Label 
        JLabel cityLabel =new JLabel("City :");
        cityLabel.setBounds(100,490,150,30);
        cityLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(cityLabel);
        //Address Textfield 
        cityTextField =new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(cityTextField);

        // State Label
        JLabel stateLabel =new JLabel("State :");
        stateLabel.setBounds(100,540,150,30);
        stateLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(stateLabel);
        //Address Textfield 
        StateTextField =new JTextField();
        StateTextField.setBounds(300,540,400,30);
        StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(StateTextField);

        //pincode Label 
        JLabel pincodeLabel =new JLabel("Pin Code:");
        pincodeLabel.setBounds(100,590,150,30);
        pincodeLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(pincodeLabel);
        //Address Textfield 
        pincodeTextField =new JTextField();
        pincodeTextField.setBounds(300,590,400,30);
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(pincodeTextField);

        //Next Button 
        nextButton =new JButton("Next");
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(new Font("Raleway",Font.BOLD,14));
        nextButton.setBounds(620,660,80,30);
        nextButton.addActionListener(this);
        add(nextButton);
    }
    public void actionPerformed(ActionEvent ae){
        //getting the all information which is submited on the form into different variable 
        String formno = ""+ranNumber;
        String name = nameTextField.getText();
        String fname =fatherTextField.getText();
        String dob = ((JTextField)dobdate.getDateEditor().getUiComponent()).getText();
        String gender =null ;
        if(maleButton.isSelected()){
            gender ="male";
        }else if(femaleButton.isSelected()){
            gender ="female";
        }else if(othergenButton.isSelected()){
            gender ="other";
        }
        String email = EmailTextField.getText();
        String maritialStatus = null;
        if (marriedButton.isSelected()) {
            maritialStatus = "married";
        } else if(unmarriedButton.isSelected()){
            maritialStatus = "unmarried";
        }else if(otherMButton.isSelected()){
            maritialStatus = "other";
        }
        String address =AddressTextField.getText();
        String city =cityTextField.getText();
        String state =StateTextField.getText();
        String pin = pincodeTextField.getText();

        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required !");
                }
            else{
                //Create the object of connection class for sends the data into database 
                Conn dbConn =new Conn();

                //This is the query of inserting the data .
                String queryString ="insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritialStatus+"','"+address+"','"+city+"','"+state+"','"+pin+"')";

                //For executing the query .
                dbConn.dbstatement.executeUpdate(queryString);
                //After all ok then we have to move on to next page so
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new SignUpOne();
    }
}
