/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.common;

import business.EcoSystem;
import business.common.SendEmailAndTextMessage;
import business.common.DOBValidation;
import business.common.EmailValidation;
import business.common.ZipValidation;
import business.common.PasswordValidation;
import business.common.PhoneNumberValidation;
import business.common.InputValidation;
import business.common.Validation;
import business.enterprises.Enterprise;
import business.enterprises.SeniorSafeEnterprise;
import business.enterprises.HospitalEnterprise;
import business.enterprises.SchoolEnterprise;
import business.network.Network;
import business.organizations.DoctorOrganization;
import business.organizations.ServiceSeekerOrganization;
import business.organizations.Organization;
import business.organizations.SupervisorOrganization;
import business.organizations.VolunteerOrganization;
import business.person.ServiceSeeker;
import business.person.Person;
import business.person.PersonDirectory;
import business.person.Volunteer;
import business.role.DoctorRole;
import business.role.ServiceSeekerRole;
import business.role.VolunteerRole;
import business.userAccount.UserAccount;
import business.workQueue.SupervisorWorkRequest;
import java.util.Date;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */
public class RegistrationWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private EcoSystem ecoSystem; 
    private Enterprise enterprise;
    private Organization organization;
    
    /**
     * Creates new form RegistrationWorkAreaPanel
     */
    public RegistrationWorkAreaPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.ecoSystem = ecoSystem;
       
       helpSeekerPane.setVisible(false);
         
        addInputVerifiers();
        
        populateCountryComboBox();
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        
        fillForm();
        
    }
    
    
      private void addInputVerifiers() {
          
        InputVerifier stringValidation = new InputValidation();
        firstNameField.setInputVerifier(stringValidation);
        lastNameField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        userNameJTxtField.setInputVerifier(stringValidation);
        
        
        InputVerifier passwordValidation = new PasswordValidation();
        passwordField.setInputVerifier(passwordValidation);
        confirmPasswordField.setInputVerifier(passwordValidation);
        
        InputVerifier dobValidtion = new DOBValidation();
        //DobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ZipValidation();
        zipCodeField.setInputVerifier(numberValidation);
        
        InputVerifier emailValidtion = new EmailValidation();
        emailIDField.setInputVerifier(emailValidtion);
     
         InputVerifier phnumberValidation = new PhoneNumberValidation();
        phoneNumberField.setInputVerifier(phnumberValidation);
      
    }
    
    private void populateCountryComboBox(){
        countryComboBox.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Please create networks.");  
         return;        
        }
        countryComboBox.addItem("Please select a country");
        String networkVal = "";   
        HashSet<String> hs = new HashSet();
           
        for(Network network : ecoSystem.getNetworkList()){
           if(!network.getCountry().equals(networkVal))
           {
               hs.add(network.getCountry());
           }
        }
        for(String s : hs)
        {
         countryComboBox.addItem(s);
        }
        }
    
         private void populateNetworkComboBox()
         {
        
        helpSeekerNetworkCombo.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        helpSeekerNetworkCombo.addItem("Please Choose a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             helpSeekerNetworkCombo.addItem(network);
         }

        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        addressField2 = new javax.swing.JTextField();
        addressField1 = new javax.swing.JTextField();
        emailID1 = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        emailIDField1 = new javax.swing.JTextField();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        createProfileButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        address2 = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        isHelpSeeker = new javax.swing.JRadioButton();
        isVolunteer = new javax.swing.JRadioButton();
        helpSeekerPane = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        userNameJTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        helpSeekerNw = new javax.swing.JLabel();
        helpSeekerNetworkCombo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        isDoctorRadioBtn = new javax.swing.JRadioButton();
        volNetwork = new javax.swing.JLabel();
        volNetworkCombo = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(169, 224, 49));
        setLayout(null);

        addressField2.setBackground(new java.awt.Color(0, 0, 0));
        addressField2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        addressField2.setForeground(new java.awt.Color(255, 255, 255));
        addressField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addressField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        addressField2.setOpaque(false);
        add(addressField2);
        addressField2.setBounds(190, 480, 180, 20);

        addressField1.setBackground(new java.awt.Color(0, 0, 0));
        addressField1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        addressField1.setForeground(new java.awt.Color(255, 255, 255));
        addressField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        addressField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        addressField1.setOpaque(false);
        add(addressField1);
        addressField1.setBounds(190, 420, 180, 20);

        emailID1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        emailID1.setForeground(new java.awt.Color(255, 255, 255));
        emailID1.setText("Confirm Email Address");
        add(emailID1);
        emailID1.setBounds(530, 460, 112, 14);

        town.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        town.setForeground(new java.awt.Color(255, 255, 255));
        town.setText("Town/City");
        add(town);
        town.setBounds(530, 220, 50, 20);

        emailIDField1.setBackground(new java.awt.Color(0, 0, 0));
        emailIDField1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        emailIDField1.setForeground(new java.awt.Color(255, 255, 255));
        emailIDField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        emailIDField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        emailIDField1.setOpaque(false);
        add(emailIDField1);
        emailIDField1.setBounds(530, 480, 190, 20);

        townField.setBackground(new java.awt.Color(0, 0, 0));
        townField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        townField.setForeground(new java.awt.Color(255, 255, 255));
        townField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        townField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        townField.setOpaque(false);
        townField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                townFieldActionPerformed(evt);
            }
        });
        add(townField);
        townField.setBounds(530, 240, 190, 20);

        zipCode.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        zipCode.setForeground(new java.awt.Color(255, 255, 255));
        zipCode.setText("Zip Code");
        add(zipCode);
        zipCode.setBounds(530, 280, 44, 14);

        zipCodeField.setBackground(new java.awt.Color(0, 0, 0));
        zipCodeField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        zipCodeField.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        zipCodeField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        zipCodeField.setOpaque(false);
        add(zipCodeField);
        zipCodeField.setBounds(530, 300, 190, 20);

        occupation.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        occupation.setForeground(new java.awt.Color(255, 255, 255));
        occupation.setText("Occupation");
        add(occupation);
        occupation.setBounds(530, 330, 58, 14);

        occupationField.setBackground(new java.awt.Color(0, 0, 0));
        occupationField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        occupationField.setForeground(new java.awt.Color(255, 255, 255));
        occupationField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        occupationField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        occupationField.setOpaque(false);
        add(occupationField);
        occupationField.setBounds(530, 360, 190, 20);

        emailID.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        emailID.setForeground(new java.awt.Color(255, 255, 255));
        emailID.setText("Email Address");
        add(emailID);
        emailID.setBounds(530, 400, 70, 14);

        emailIDField.setBackground(new java.awt.Color(0, 0, 0));
        emailIDField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        emailIDField.setForeground(new java.awt.Color(255, 255, 255));
        emailIDField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        emailIDField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        emailIDField.setOpaque(false);
        emailIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDFieldActionPerformed(evt);
            }
        });
        add(emailIDField);
        emailIDField.setBounds(530, 420, 190, 20);

        firstName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setText("First Name");
        add(firstName);
        firstName.setBounds(190, 220, 70, 20);

        phoneNumber.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.setText("Phone Number");
        add(phoneNumber);
        phoneNumber.setBounds(190, 340, 77, 14);

        firstNameField.setBackground(new java.awt.Color(0, 0, 0));
        firstNameField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(255, 255, 255));
        firstNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        firstNameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        firstNameField.setOpaque(false);
        add(firstNameField);
        firstNameField.setBounds(190, 240, 180, 20);

        phoneNumberField.setBackground(new java.awt.Color(0, 0, 0));
        phoneNumberField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        phoneNumberField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        phoneNumberField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        phoneNumberField.setOpaque(false);
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });
        add(phoneNumberField);
        phoneNumberField.setBounds(190, 360, 180, 20);

        createProfileButton.setBackground(new java.awt.Color(0, 0, 0));
        createProfileButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        createProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        createProfileButton.setText("Register");
        createProfileButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        createProfileButton.setContentAreaFilled(false);
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });
        add(createProfileButton);
        createProfileButton.setBounds(530, 670, 150, 30);

        LastName.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name");
        add(LastName);
        LastName.setBounds(190, 280, 56, 14);

        lastNameField.setBackground(new java.awt.Color(0, 0, 0));
        lastNameField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lastNameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        lastNameField.setOpaque(false);
        add(lastNameField);
        lastNameField.setBounds(190, 300, 180, 20);

        address2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        address2.setForeground(new java.awt.Color(255, 255, 255));
        address2.setText("Address Line2");
        add(address2);
        address2.setBounds(190, 460, 69, 14);

        dateOfBirth.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        dateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirth.setText("Date Of Birth ");
        add(dateOfBirth);
        dateOfBirth.setBounds(850, 220, 70, 14);

        address1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        address1.setForeground(new java.awt.Color(255, 255, 255));
        address1.setText("Address Line1");
        add(address1);
        address1.setBounds(190, 400, 66, 14);

        isHelpSeeker.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(isHelpSeeker);
        isHelpSeeker.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        isHelpSeeker.setForeground(new java.awt.Color(255, 255, 255));
        isHelpSeeker.setText("Sign Up as Service Seeker");
        isHelpSeeker.setOpaque(false);
        isHelpSeeker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isHelpSeekerActionPerformed(evt);
            }
        });
        add(isHelpSeeker);
        isHelpSeeker.setBounds(270, 150, 180, 25);

        isVolunteer.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(isVolunteer);
        isVolunteer.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        isVolunteer.setForeground(new java.awt.Color(255, 255, 255));
        isVolunteer.setText("Sign Up as Volunteer");
        isVolunteer.setOpaque(false);
        isVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isVolunteerActionPerformed(evt);
            }
        });
        add(isVolunteer);
        isVolunteer.setBounds(530, 150, 160, 25);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Account Details");
        helpSeekerPane.add(jLabel7);
        jLabel7.setBounds(30, 30, 210, 27);

        passwordField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        passwordField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        passwordField.setOpaque(false);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        helpSeekerPane.add(passwordField);
        passwordField.setBounds(30, 170, 180, 20);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        helpSeekerPane.add(jLabel2);
        jLabel2.setBounds(30, 100, 60, 14);

        userNameJTxtField.setBackground(new java.awt.Color(0, 0, 0));
        userNameJTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        userNameJTxtField.setForeground(new java.awt.Color(255, 255, 255));
        userNameJTxtField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        userNameJTxtField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        userNameJTxtField.setOpaque(false);
        userNameJTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTxtFieldActionPerformed(evt);
            }
        });
        helpSeekerPane.add(userNameJTxtField);
        userNameJTxtField.setBounds(30, 120, 180, 20);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        helpSeekerPane.add(jLabel4);
        jLabel4.setBounds(30, 150, 60, 14);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        helpSeekerPane.add(jLabel5);
        jLabel5.setBounds(30, 210, 100, 14);

        confirmPasswordField.setBackground(new java.awt.Color(0, 0, 0));
        confirmPasswordField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        confirmPasswordField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        confirmPasswordField.setOpaque(false);
        helpSeekerPane.add(confirmPasswordField);
        confirmPasswordField.setBounds(30, 230, 180, 20);

        helpSeekerNw.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        helpSeekerNw.setForeground(new java.awt.Color(255, 255, 255));
        helpSeekerNw.setText("City");
        helpSeekerPane.add(helpSeekerNw);
        helpSeekerNw.setBounds(30, 270, 21, 14);

        helpSeekerNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpSeekerNetworkComboActionPerformed(evt);
            }
        });
        helpSeekerPane.add(helpSeekerNetworkCombo);
        helpSeekerNetworkCombo.setBounds(30, 290, 180, 20);

        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/morg (5).jpg"))); // NOI18N
        helpSeekerPane.add(jLabel8);
        jLabel8.setBounds(-930, 310, 1260, 150);

        add(helpSeekerPane);
        helpSeekerPane.setBounds(820, 300, 260, 330);

        manageEnt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        manageEnt.setForeground(new java.awt.Color(255, 255, 255));
        manageEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEnt.setText("Welcome to Senior Safe ");
        manageEnt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(manageEnt);
        manageEnt.setBounds(380, 60, 410, 27);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gender");
        add(jLabel1);
        jLabel1.setBounds(530, 520, 37, 14);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        add(genderComboBox);
        genderComboBox.setBounds(530, 540, 190, 20);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Country");
        add(jLabel3);
        jLabel3.setBounds(190, 520, 40, 14);

        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });
        add(countryComboBox);
        countryComboBox.setBounds(190, 540, 180, 20);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("State");
        add(jLabel6);
        jLabel6.setBounds(190, 580, 27, 14);

        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });
        add(stateComboBox);
        stateComboBox.setBounds(190, 600, 180, 20);

        isDoctorRadioBtn.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(isDoctorRadioBtn);
        isDoctorRadioBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        isDoctorRadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        isDoctorRadioBtn.setText("Sign up as Doctor");
        isDoctorRadioBtn.setOpaque(false);
        isDoctorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDoctorRadioBtnActionPerformed(evt);
            }
        });
        add(isDoctorRadioBtn);
        isDoctorRadioBtn.setBounds(760, 150, 129, 25);

        volNetwork.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        volNetwork.setForeground(new java.awt.Color(255, 255, 255));
        volNetwork.setText("City");
        add(volNetwork);
        volNetwork.setBounds(530, 580, 30, 14);

        volNetworkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volNetworkComboActionPerformed(evt);
            }
        });
        add(volNetworkCombo);
        volNetworkCombo.setBounds(530, 600, 190, 22);

        jDateChooser1.setBackground(new java.awt.Color(0, 0, 0));
        jDateChooser1.setForeground(new java.awt.Color(169, 224, 49));
        add(jDateChooser1);
        jDateChooser1.setBounds(850, 240, 180, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/morg (5).jpg"))); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(70, 0, 1170, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed

        try
        {
         if(countryComboBox.getSelectedIndex()<1 || stateComboBox.getSelectedIndex()<1)
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         if(genderComboBox.getSelectedIndex()<1 )
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         
         Date dateOfBirthVal = jDateChooser1.getDate() ;
            // Calculate age using dob
            
            int age = Validation.ageCalculator(dateOfBirthVal);
            
            String phoneNumber = phoneNumberField.getText();
            String firstName =   firstNameField.getText();
            String lastName = lastNameField.getText();
            String address1 = addressField1.getText();
            String address2 = addressField2.getText();
            String town = townField.getText();
            String zipCode = zipCodeField.getText();
            String emailId = emailIDField.getText();
            String confirmEmail = emailIDField1.getText();
            String occupation = occupationField.getText();
            String gender = (String)genderComboBox.getSelectedItem();
            String country = (String)countryComboBox.getSelectedItem();
            String state = (String)stateComboBox.getSelectedItem();
            
            if(firstName != null && !firstName.isEmpty() &&
                lastName!= null && !lastName.isEmpty() &&
                address1!=null && !address1.isEmpty() &&
                    address2!=null && !address2.isEmpty() &&
                town!=null && !town.isEmpty() &&
                occupation!=null && !occupation.isEmpty() &&
                emailId!=null && !emailId.isEmpty() &&
                confirmEmail!=null && !confirmEmail.isEmpty() &&
                zipCode != null && !zipCode.isEmpty() &&
                gender!=null && !gender.isEmpty() && age > 0 && !phoneNumber.isEmpty()
                    &&  country!=null && !country.isEmpty() 
                    &&  state!=null && !state.isEmpty() 
           )
            {
                if(buttonGroup1.getSelection()==null)
                {
             JOptionPane.showMessageDialog(null, "Please select radio button to know if you are volunteer or need help or a doctor ","warning", JOptionPane.WARNING_MESSAGE);
              return;       
                }

                if(!(confirmEmail.equals(emailId)))
                {
                    JOptionPane.showMessageDialog(null, "Email Address does not match, Please Enter valid email Address","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
          
                  Person person = null;
              if(isHelpSeeker.isSelected())
                {
                 if(passwordField.getPassword().length ==0 || confirmPasswordField.getPassword().length == 0 ||
                        userNameJTxtField.getText().trim().isEmpty() || helpSeekerNetworkCombo.getSelectedIndex()<1
                            )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
               
                 
                  if(helpSeekerNetworkCombo.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                  if(age<50 || age==0 || age > 120)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as service seeker","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                    String userName = userNameJTxtField.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    String confirmPassword =String.valueOf(confirmPasswordField.getPassword());
               
                    Network helpSeekerNw = (Network)helpSeekerNetworkCombo.getSelectedItem();
                      if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getCustomerDirectory().remove(person);
                        return;
                    }
                    
                    getEnterprise(helpSeekerNw);
                     if(enterprise == null)
                    {
                  JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+helpSeekerNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                    getOrganization("HelpSeeker",enterprise);
                    
                    if(organization == null)
                    {
                  JOptionPane.showMessageDialog(null, "Service Seeker Organization does not exist for the enterprise! "+enterprise.getOrganizationName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                 
                    person = organization.getPersonDirectory().addCustomer();
                    person.setServiceSeeker(true);
 
                    for(Enterprise e : helpSeekerNw.getEnterpriseDirectory().getEl())
                    {
                     for(UserAccount ua : e.getUserAccountDirectory().getUserAccountDirectory())
                    {
                        if(ua.getuName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountDirectory())
                            {  
                            if(ua1.getuName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getCustomerDirectory().remove((ServiceSeeker)person);
                        return;
                    }
                    // To get help seeker org
                    
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new ServiceSeekerRole());
                    userAccount.setPerson(person);
                   userAccount.setNetwork((Network)helpSeekerNw);
                  
                    // Send Req to Supervisor for approval       
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                   // For Supervisor  
                  for(Enterprise e : helpSeekerNw.getEnterpriseDirectory().getEl())
                  {
                      if(e instanceof SeniorSafeEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationDirectory())
                       {
                      if (organization instanceof SupervisorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
                }
                else if(isVolunteer.isSelected())
                {
                    if(age<10 || age==0 || age>100)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as Volunteer","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                    if(volNetworkCombo.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                     Network volNetwork = (Network)volNetworkCombo.getSelectedItem();
                    getEnterprise(volNetwork);
                    
                    if(enterprise==null)
                    {
                   JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! " +volNetwork.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    }
                    getOrganization("Volunteer",enterprise);
                  if(organization==null)
                    {
                   JOptionPane.showMessageDialog(null, "Volunteer Organization does not exist for the enterprise! " +enterprise.getOrganizationName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    }
                  
                  person = organization.getPersonDirectory().addVolunteer();
                  person.setVolunteer(true);
               
                   String userName = SendEmailAndTextMessage.generateUserName(lastNameField.getText());
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        userName = SendEmailAndTextMessage.generateUserName(lastNameField.getText());
                    }
                    String password = SendEmailAndTextMessage.generatePassword(firstNameField.getText());
                    String emailMsg = buildEmailTxtMsg(userName, password);
                    
                    boolean emailSent = SendEmailAndTextMessage.sendEmail(emailMsg, emailIDField.getText(),userName, password);
                    if(!emailSent)
                    {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Email address! ","warning", JOptionPane.WARNING_MESSAGE);
                    organization.getPersonDirectory().getVolunteerDirectory().remove((Volunteer)person);
                    return;         
                    }
                   
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName,password , person, new VolunteerRole());
                    userAccount.setPerson(person);
                    userAccount.setNetwork(volNetwork);
                    
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                   // For Supervisor  
                  for(Enterprise e : volNetwork.getEnterpriseDirectory().getEl())
                  {
                      if(e instanceof SeniorSafeEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationDirectory())
                       {
                      if (organization instanceof SupervisorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
                }
                if(isDoctorRadioBtn.isSelected() )
                {
                  if(age<20 || age==0)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as Dcotor","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                     if(passwordField.getPassword().length ==0 || confirmPasswordField.getPassword().length == 0 ||
                        userNameJTxtField.getText().trim().isEmpty() || helpSeekerNetworkCombo.getSelectedIndex()<1
                           )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                     String userName = userNameJTxtField.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    String confirmPassword =String.valueOf(confirmPasswordField.getPassword());
                   
                    Network docNw = (Network)helpSeekerNetworkCombo.getSelectedItem();
                    
                    
                     if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPersonDirectory().remove(person);
                        return;
                    }
                    
                    getEnterprise(docNw);
                    if(enterprise==null)
                    {
                     JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+docNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                    getOrganization("Doctor",enterprise);
                    if(organization==null)
                    {
                     JOptionPane.showMessageDialog(null, "Doctor Organization does not exist for the enterprise! "+enterprise.getOrganizationName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                  person = organization.getPersonDirectory().addPerson();
                   
                    for(Enterprise e : docNw.getEnterpriseDirectory().getEl())
                    {
                     for(UserAccount ua : e.getUserAccountDirectory().getUserAccountDirectory())
                    {
                        if(ua.getuName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountDirectory())
                            {  
                            if(ua1.getuName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPersonDirectory().remove(person);
                        return;
                    }
                    // To get Doctor org
                    
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new DoctorRole());
                    userAccount.setPerson(person);
                    userAccount.setNetwork(docNw);
                  
                // Request to Supervisor       
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                     // For Supervisor  
                  for(Enterprise e : docNw.getEnterpriseDirectory().getEl())
                  {
                      if(e instanceof SeniorSafeEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationDirectory())
                       {
                      if (organization instanceof SupervisorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                     if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                       userAccount.setEnabled(false);
                    }
                }
                
                person.setPersonsFirstName(firstName);
                person.setlName(lastName);
                person.setAddress2(address2);
                person.setAddress1(address1);
                person.setTown(town);
                person.setZipCode(zipCode);
                person.setOccupation(occupation);
                person.setEmailId(emailId);
                person.setDateOfBirth(dateOfBirthVal);
                person.setMobileNumber(phoneNumber);
                person.setGender(gender);
                person.setCountry(country);
                person.setState(state);
                person.setName();
                person.setAge(age);
                
               
                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            }
        }
        
        catch(NumberFormatException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid Number ! ");
        return;
        }
//        catch(ParseException npe)
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
//           return;
//        }
        catch(NullPointerException e )
        {
        JOptionPane.showMessageDialog(null, "Organization does not exist! ");  
          return;
        }
        catch(Exception e )
        {
        JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");  
          return;
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed
    public void resetFields()
    {
     userNameJTxtField.setText("");
     passwordField.setText("");
     confirmPasswordField.setText("");
    firstNameField.setText("");
    lastNameField.setText("");
    
    addressField1.setText("");
    addressField2.setText("");
    townField.setText("");
    zipCodeField.setText("");
    occupationField.setText("");
    emailIDField.setText("");
    emailIDField1.setText("");
    phoneNumberField.setText("");
    isHelpSeeker.setSelected(false);
    isVolunteer.setSelected(false);
    isDoctorRadioBtn.setSelected(false);
     
    }
    
    public void getEnterprise(Network network)
    {
          try
                {
                 for (Network n : ecoSystem.getNetworkList())
                    {
                    if(n.getCity().equals(network.getCity()))   
                    {  
                   for(Enterprise e : n.getEnterpriseDirectory().getEl())
                      {
                           if(e instanceof SchoolEnterprise && isVolunteer.isSelected())
                           {
                             this.enterprise = e;
                             network = n;
                            }
                           else if(e instanceof SeniorSafeEnterprise && isHelpSeeker.isSelected())
                           {
                             this.enterprise = e;
                              network = n;
                            }
                            else if(e instanceof HospitalEnterprise && isDoctorRadioBtn.isSelected())
                           {
                             this.enterprise = e;
                              network = n;
                           }
                      }
                    }
                    }
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.WARNING_MESSAGE);
                    return;    
                }
    }
    
    public String buildEmailTxtMsg(String usrNm, String pwd)
    {
      StringBuilder emailMsgTxt = new StringBuilder();
        emailMsgTxt.append("Please find username and password to login into our application");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("username : ".concat(usrNm));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("password : ".concat(pwd));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("Thank You ");
        emailMsgTxt.append("SeniorSafe");
        
        return emailMsgTxt.toString();
    }
    
    public void getOrganization(String orgVal, Enterprise e){
     
        try
        {
     for (Organization organization : e.getOrganizationDirectory().getOrganizationDirectory()){
      
       if(orgVal.equals("Volunteer") && organization instanceof VolunteerOrganization)
        {
              this.organization = organization;
              this.personDirectory = organization.getPersonDirectory();
        
        }     
     else if(orgVal.equals("HelpSeeker") && organization instanceof ServiceSeekerOrganization)
             {
               this.organization = organization;
               this.personDirectory = organization.getPersonDirectory();
             }  
       
       else if(orgVal.equals("Doctor") && organization instanceof DoctorOrganization)
             {
               this.organization = organization;
               this.personDirectory = organization.getPersonDirectory();
             } 
             }
        }
        catch(Exception ex)
        {
         return;     
        }
    }
    

    private void isHelpSeekerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isHelpSeekerActionPerformed

        helpSeekerPane.setVisible(true);
        volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
        
    }//GEN-LAST:event_isHelpSeekerActionPerformed

    private void isVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isVolunteerActionPerformed
        helpSeekerPane.setVisible(false);
        volNetworkCombo.setVisible(true);
        volNetwork.setVisible(true);
        populateVolNetworkComboBox();
    }//GEN-LAST:event_isVolunteerActionPerformed
    
    
    private void populateVolNetworkComboBox()
         {
         volNetworkCombo.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        volNetworkCombo.addItem("Please Choose a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             volNetworkCombo.addItem(network);
         }

        }
    
    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        
        stateComboBox.removeAllItems();
       
        
      if(countryComboBox.getSelectedIndex()>0)
      {
          stateComboBox.addItem("Please select a State");
         HashSet<String> hsstateVal = new HashSet<>();
        for (Network network : ecoSystem.getNetworkList())
        {
          if(network.getCountry().equals(countryComboBox.getSelectedItem()))
          {
           hsstateVal.add(network.getState());
          }
        }
        for(String s1 : hsstateVal)
        {
        stateComboBox.addItem(s1);
        }
       }
         
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed

    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void helpSeekerNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpSeekerNetworkComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpSeekerNetworkComboActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void isDoctorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDoctorRadioBtnActionPerformed
       helpSeekerPane.setVisible(true);
       volNetworkCombo.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
    }//GEN-LAST:event_isDoctorRadioBtnActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void volNetworkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volNetworkComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volNetworkComboActionPerformed

    private void userNameJTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTxtFieldActionPerformed

    private void townFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_townFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_townFieldActionPerformed

    private void emailIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDFieldActionPerformed
    
  
    
    public void fillForm()
    {
        Date date = new Date();
    firstNameField.setText("Ryan");
    lastNameField.setText("Peter");
   // DobField.setText("12/12/1938");
   jDateChooser1.setDate(date);
    genderComboBox.setSelectedItem("Male");
    addressField1.setText("433");
    addressField2.setText("Kenmore");
    townField.setText("boston");
    zipCodeField.setText("02145");
    occupationField.setText("student");
    emailIDField.setText("deepti.akarsha@gmail.com");
    emailIDField1.setText("deepti.akarsha@gmail.com");
    phoneNumberField.setText("8573996764");
  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address1;
    private javax.swing.JLabel address2;
    private javax.swing.JTextField addressField1;
    private javax.swing.JTextField addressField2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JComboBox countryComboBox;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JTextField emailIDField1;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JComboBox helpSeekerNetworkCombo;
    private javax.swing.JLabel helpSeekerNw;
    private javax.swing.JLayeredPane helpSeekerPane;
    private javax.swing.JRadioButton isDoctorRadioBtn;
    private javax.swing.JRadioButton isHelpSeeker;
    private javax.swing.JRadioButton isVolunteer;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JTextField userNameJTxtField;
    private javax.swing.JLabel volNetwork;
    private javax.swing.JComboBox volNetworkCombo;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
