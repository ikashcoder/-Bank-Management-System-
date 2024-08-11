package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUpTwo extends JFrame implements ActionListener{
    //Declaring some global variable
    JTextField PanTextfield,AadharTextField;
    JRadioButton SeniorButton,not_SeniorButton,EAccountButton,not_EAccountButton;
    JComboBox<String> CategoryCombo,IncomeCombo,EducationCombo,OccupationCombo,ReligionCombo ;
    JButton nextButton;
    String FormNo=null;
    

    public SignUpTwo(String formno){

        //Jframe functions 
        setSize(800,800);
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("SIGN UP FORM");

        //Assigning to Form Number 
        this.FormNo = formno;

        //personalDetails Label 
        JLabel personalDetails =new JLabel("Page 2 : Additional Details");
        personalDetails.setBounds(290,50,300,30);
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(personalDetails);
        
        //Religion Lable
        JLabel ReligionLabel =new JLabel("Religion:");
        ReligionLabel.setBounds(100,140,150,30);
        ReligionLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(ReligionLabel);
        //Religion dropdown textField
        String ReligionVar[] = {"Hindu" ,"Muslim","Sikh","Christian","other"};
        ReligionCombo = new JComboBox<>(ReligionVar);
        ReligionCombo.setBounds(300,140,400,30);
        ReligionCombo.setBackground(Color.WHITE);
        add(ReligionCombo);
    
        //Category Name Label
        JLabel Categorylabel =new JLabel("Category:");
        Categorylabel.setBounds(100,190,150,30);
        Categorylabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(Categorylabel);
        //Category dropdown textField
        String CategoryVar[] = {"General","OBC","SC","ST","other"};
        CategoryCombo = new JComboBox<>(CategoryVar);
        CategoryCombo.setBounds(300,190,400,30);
        CategoryCombo.setBackground(Color.WHITE);
        add(CategoryCombo);
    
        //Income Label
        JLabel incomeLabel =new JLabel("Income:");
        incomeLabel.setBounds(100,240,150,30);
        incomeLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(incomeLabel);
        //Income dropdown textField
        String IncomeVar[] = {"Null","<=1,20,000","<=3,00,000","<=5,00,000" ,"Up to 10,00,000"};
        IncomeCombo = new JComboBox<>(IncomeVar);
        IncomeCombo.setBounds(300,240,400,30);
        IncomeCombo.setBackground(Color.WHITE);
        add(IncomeCombo);


        //Education Qualification Label
        JLabel educationLabel1 =new JLabel("Education");
        educationLabel1.setBounds(100,290,200,30);
        educationLabel1.setFont(new Font("Raleway",Font.BOLD,20));
        add(educationLabel1);
        JLabel educationLabel2 =new JLabel("Qualification:");
        educationLabel2.setBounds(100,315,200,30);
        educationLabel2.setFont(new Font("Raleway",Font.BOLD,20));
        add(educationLabel2);

        //Educational Qualification dropdown textField
        String EducationVar[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        EducationCombo = new JComboBox<>(EducationVar);
        EducationCombo.setBounds(300,315,400,30);
        EducationCombo.setBackground(Color.WHITE);
        add(EducationCombo);

       
        //Occupation label
        JLabel OccupationLabel =new JLabel("Occupation:");
        OccupationLabel.setBounds(100,365,150,30);
        OccupationLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(OccupationLabel);
        //Occupation dropdown textField
        String OccupationVar[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        OccupationCombo = new JComboBox<>(OccupationVar);
        OccupationCombo.setBounds(300,365,400,30);
        OccupationCombo.setBackground(Color.WHITE);
        add(OccupationCombo);
       

        //PAN Number lable 
        JLabel PANlLabel =new JLabel("PAN Number:");
        PANlLabel.setBounds(100,415,150,30);
        PANlLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(PANlLabel);
        //pan textfield
        PanTextfield =new JTextField();
        PanTextfield.setBounds(300,415,400,30);
        PanTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        add(PanTextfield);
       
        //Aadhar Number Label
        JLabel AadharLabel1 =new JLabel("Aadhar Number:");
        AadharLabel1.setBounds(100,465,300,30);
        AadharLabel1.setFont(new Font("Raleway",Font.BOLD,20));
        add(AadharLabel1);
        //Textfield 
        AadharTextField =new JTextField();
        AadharTextField.setBounds(300,465,400,30);
        AadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(AadharTextField);

        // Senior Citizen Label 
        JLabel SeniorLabel =new JLabel("Senior Citizen:");
        SeniorLabel.setBounds(100,515,150,30);
        SeniorLabel.setFont(new Font("Raleway",Font.BOLD,20));
        add(SeniorLabel);

         //Adding radio buttons yes or no for Senior 
         SeniorButton =new JRadioButton("yes");
         SeniorButton.setBounds(300,515,100,30);
         SeniorButton.setBackground(Color.WHITE);
         add(SeniorButton);
 
         not_SeniorButton =new JRadioButton("no");
         not_SeniorButton.setBounds(450,515,100,30);
         not_SeniorButton.setBackground(Color.WHITE);
         add(not_SeniorButton);
 
         ButtonGroup SeniorGButtons =new ButtonGroup();
         SeniorGButtons.add(SeniorButton);
         SeniorGButtons.add(not_SeniorButton);
       

        // Existing Account Label
        JLabel EAccountLabel1 =new JLabel("Existing Account:");
        EAccountLabel1.setBounds(100,565,300,30);
        EAccountLabel1.setFont(new Font("Raleway",Font.BOLD,20));
        add(EAccountLabel1);
       
        //Adding radio buttons yes or no for Existing Account
        EAccountButton =new JRadioButton("yes");
        EAccountButton.setBounds(300,565,100,30);
        EAccountButton.setBackground(Color.WHITE);
        add(EAccountButton);

        not_EAccountButton =new JRadioButton("no");
        not_EAccountButton.setBounds(450,565,100,30);
        not_EAccountButton.setBackground(Color.WHITE);
        add(not_EAccountButton);

        ButtonGroup  EAccountGButtons =new ButtonGroup();
        EAccountGButtons.add(EAccountButton);
        EAccountGButtons.add(not_EAccountButton);

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
        
            String Religion = (String) ReligionCombo.getSelectedItem();
            String Category = (String) CategoryCombo.getSelectedItem();
            String Income = (String) IncomeCombo.getSelectedItem();
            String Education = (String) EducationCombo.getSelectedItem();
            String Occupation = (String) OccupationCombo.getSelectedItem();
            String Senior =null;
                if(SeniorButton.isSelected()){
                    Senior ="Yes";
                }
                else if(not_SeniorButton.isSelected()){
                    Senior ="No";
                }
            String EAccount =null;
                if(EAccountButton.isSelected()){
                    EAccount ="Yes";
                }
                else if(not_EAccountButton.isSelected()){
                    EAccount ="No";
                }
            String PAN = PanTextfield.getText();
            String Aadhar =AadharTextField.getText();

            try {
                //Create the object of connection class for sends the data into database 
                Conn dbConn =new Conn();

                //This is the query of inserting the data .
                String queryString ="insert into signuptwo values('"+FormNo+"', '"+Religion+"','"+Category+"','"+Income+"','"+Education+"','"+Occupation+"','"+Senior+"','"+EAccount+"','"+PAN+"','"+Aadhar+"')";
                //For executing the query .
                dbConn.dbstatement.executeUpdate(queryString);

                //next go to the signupthree page so 
                setVisible(false);
                new SignUpThree(FormNo).setVisible(true);
                
            } catch (Exception e) {
            System.out.println(e);
            }

    }
    public static void main(String[] args) {
        new SignUpTwo("");
    }
}


