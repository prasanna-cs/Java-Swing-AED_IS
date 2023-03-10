/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.serviceSeeker;

import business.common.DOBValidation;
import business.common.EmailValidation;
import business.common.ZipValidation;
import business.common.PhoneNumberValidation;
import business.common.InputValidation;
import business.common.Validation;
import business.person.Person;
import business.userAccount.UserAccount;
import business.userAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */
public class UpdateServiceSeekerProfile extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Person person;
    private UserAccountDirectory userAccountDirectory;
    
    /**
     * Creates new form ViewVolunteerProfile
     */
    public UpdateServiceSeekerProfile(JPanel userProcessContainer, UserAccount userAccount, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
        this.userAccountDirectory = userAccountDirectory;
        DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
                
        firstNameField.setText(person.getPersonsFirstName());
        lastNameField.setText(person.getlName());
        dobField.setText(dateformat.format(person.getDateOfBirth()));
        genderComboBox.setSelectedItem(person.getGender());
        addressField2.setText(person.getAddress1());
        addressField1.setText(person.getAddress2());
        townField.setText(person.getTown());
        zipCodeField.setText(person.getZipCode());
        occupationField.setText(person.getZipCode());
        emailIDField.setText(person.getEmailId());
        userNameTxtField.setText(userAccount.getuName());
        phoneNumberField.setText(String.valueOf(person.getMobileNumber()));
        
        addInputVerifiers();
        
        
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
        userNameTxtField.setInputVerifier(stringValidation);
        
        
        InputVerifier dobValidtion = new DOBValidation();
        dobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ZipValidation();
        zipCodeField.setInputVerifier(numberValidation);
        
        
        
       InputVerifier emailValidtion = new EmailValidation();
        emailIDField.setInputVerifier(emailValidtion);
     
         InputVerifier phnumberValidation = new PhoneNumberValidation();
        phoneNumberField.setInputVerifier(phnumberValidation);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        areaCode = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        addressField1 = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        address2 = new javax.swing.JLabel();
        addressField2 = new javax.swing.JTextField();
        manageEnt1 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        viewYourProfile1 = new javax.swing.JLabel();
        viewYourProfile2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Welcome to Senior Safe");

        setBackground(new java.awt.Color(21, 25, 28));
        setForeground(new java.awt.Color(169, 224, 49));

        occupationField.setEditable(false);
        occupationField.setBackground(new java.awt.Color(21, 25, 28));
        occupationField.setForeground(new java.awt.Color(255, 255, 255));
        occupationField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        occupationField.setEnabled(false);

        emailID.setForeground(new java.awt.Color(169, 224, 49));
        emailID.setText("Email Address:");

        emailIDField.setEditable(false);
        emailIDField.setBackground(new java.awt.Color(21, 25, 28));
        emailIDField.setForeground(new java.awt.Color(255, 255, 255));
        emailIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        emailIDField.setEnabled(false);
        emailIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDFieldActionPerformed(evt);
            }
        });

        areaCode.setForeground(new java.awt.Color(169, 224, 49));
        areaCode.setText("User Name:");

        userNameTxtField.setEditable(false);
        userNameTxtField.setBackground(new java.awt.Color(21, 25, 28));
        userNameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        userNameTxtField.setEnabled(false);

        firstName.setForeground(new java.awt.Color(169, 224, 49));
        firstName.setText("First Name:");

        phoneNumber.setForeground(new java.awt.Color(169, 224, 49));
        phoneNumber.setText("Phone Number:");

        firstNameField.setEditable(false);
        firstNameField.setBackground(new java.awt.Color(21, 25, 28));
        firstNameField.setForeground(new java.awt.Color(255, 255, 255));
        firstNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        firstNameField.setEnabled(false);

        phoneNumberField.setEditable(false);
        phoneNumberField.setBackground(new java.awt.Color(21, 25, 28));
        phoneNumberField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        phoneNumberField.setEnabled(false);
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        LastName.setForeground(new java.awt.Color(169, 224, 49));
        LastName.setText("Last Name:");

        lastNameField.setEditable(false);
        lastNameField.setBackground(new java.awt.Color(21, 25, 28));
        lastNameField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        lastNameField.setEnabled(false);

        dateOfBirth.setForeground(new java.awt.Color(169, 224, 49));
        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address.setForeground(new java.awt.Color(169, 224, 49));
        address.setText("Address Line1:");

        addressField1.setEditable(false);
        addressField1.setBackground(new java.awt.Color(21, 25, 28));
        addressField1.setForeground(new java.awt.Color(255, 255, 255));
        addressField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        addressField1.setEnabled(false);

        town.setForeground(new java.awt.Color(169, 224, 49));
        town.setText("Town/City: ");

        townField.setEditable(false);
        townField.setBackground(new java.awt.Color(21, 25, 28));
        townField.setForeground(new java.awt.Color(255, 255, 255));
        townField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        townField.setEnabled(false);

        zipCode.setForeground(new java.awt.Color(169, 224, 49));
        zipCode.setText("Zip Code:");

        zipCodeField.setEditable(false);
        zipCodeField.setBackground(new java.awt.Color(21, 25, 28));
        zipCodeField.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        zipCodeField.setEnabled(false);

        occupation.setForeground(new java.awt.Color(169, 224, 49));
        occupation.setText("Occupation:");

        dobField.setBackground(new java.awt.Color(21, 25, 28));
        dobField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        dobField.setEnabled(false);

        address2.setForeground(new java.awt.Color(169, 224, 49));
        address2.setText("Address Line2 : ");

        addressField2.setBackground(new java.awt.Color(21, 25, 28));
        addressField2.setForeground(new java.awt.Color(255, 255, 255));
        addressField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        addressField2.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt1.setText("Senior Safe");

        gender.setForeground(new java.awt.Color(169, 224, 49));
        gender.setText("Gender:");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.setEnabled(false);

        viewYourProfile1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile1.setForeground(new java.awt.Color(169, 224, 49));
        viewYourProfile1.setText("Personal Information");

        viewYourProfile2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile2.setForeground(new java.awt.Color(169, 224, 49));
        viewYourProfile2.setText("Address: ");

        backJButton.setBackground(new java.awt.Color(152, 201, 45));
        backJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(21, 25, 28));
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.setFocusPainted(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        updateJButton.setBackground(new java.awt.Color(152, 201, 45));
        updateJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        updateJButton.setForeground(new java.awt.Color(21, 25, 28));
        updateJButton.setText("Update");
        updateJButton.setBorder(null);
        updateJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateJButton.setFocusPainted(false);
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(152, 201, 45));
        saveJButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        saveJButton.setForeground(new java.awt.Color(21, 25, 28));
        saveJButton.setText("Save");
        saveJButton.setBorder(null);
        saveJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveJButton.setFocusPainted(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstName)
                                    .addComponent(LastName)
                                    .addComponent(areaCode)
                                    .addComponent(emailID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(viewYourProfile1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(address))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(addressField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addressField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(170, 170, 170)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(gender)
                                                .addComponent(dateOfBirth)
                                                .addComponent(town)
                                                .addComponent(zipCode)
                                                .addComponent(occupation)
                                                .addComponent(phoneNumber))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(332, 332, 332)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(viewYourProfile2)))))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(manageEnt1)
                .addGap(10, 10, 10)
                .addComponent(viewYourProfile1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfBirth)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaCode)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(occupation)
                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailID)
                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(viewYourProfile2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(town)
                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address2)
                    .addComponent(zipCode)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed

        firstNameField.setEnabled(true);
        lastNameField.setEnabled(true);
        dobField.setEnabled(true);
        genderComboBox.setEnabled(true);
        addressField1.setEnabled(true);
        addressField2.setEnabled(true);
        townField.setEnabled(true);
        zipCodeField.setEnabled(true);
        occupationField.setEnabled(true);
        userNameTxtField.setEnabled(true);
        phoneNumberField.setEnabled(true);
        saveJButton.setEnabled(true);
        updateJButton.setEnabled(false);
        firstNameField.setEditable(true);
        lastNameField.setEditable(true);
        dobField.setEditable(true);
        addressField1.setEditable(true);
         addressField2.setEditable(true);
        townField.setEditable(true);
        zipCodeField.setEditable(true);
        occupationField.setEditable(true);
        userNameTxtField.setEditable(true);
        phoneNumberField.setEditable(true);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed

        if(firstNameField.getText()!= null && !firstNameField.getText().isEmpty() &&
            lastNameField.getText()!= null && !lastNameField.getText().isEmpty() &&
           addressField1.getText()!=null && !addressField1.getText().isEmpty() &&
            addressField2.getText()!=null && !addressField2.getText().isEmpty() &&
            townField.getText()!=null && !townField.getText().isEmpty() &&
            occupationField.getText()!=null && !occupationField.getText().isEmpty() &&
            emailIDField.getText()!=null && !emailIDField.getText().isEmpty() &&
             userNameTxtField.getText()!=null && !userNameTxtField.getText().isEmpty() 
                && genderComboBox.getSelectedIndex()>=1 && dobField.getText()!=null && 
                !dobField.getText().isEmpty() && 
             zipCodeField.getText()!=null && !zipCodeField.getText().isEmpty())
        {
            try
            {
                 if(!(userAccount.getuName().equals(userNameTxtField.getText()))&&!(userAccountDirectory.checkIfUsernameIsUnique(userNameTxtField.getText())))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                 
                
                  Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(dobField.getText()) ;
                  int age = Validation.ageCalculator(dateOfBirthVal);
                   if(age<12)
                    {
                    JOptionPane.showMessageDialog(null, "Your age does not qualify to be a Volunteer!","warning", JOptionPane.WARNING_MESSAGE);
                     return;
                    }
                    person.setPersonsFirstName(firstNameField.getText());
                    person.setlName(lastNameField.getText());
                    person.setAddress2(addressField2.getText());
                    person.setAddress1(addressField1.getText());
                    person.setTown(townField.getText());
                    person.setZipCode(zipCodeField.getText());
                    person.setOccupation(occupationField.getText());
                    userAccount.setuName(userNameTxtField.getText());
                    person.setDateOfBirth(dateOfBirthVal);
                    person.setMobileNumber(phoneNumberField.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
            catch(ParseException pe)
            {
            JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            return; 
            }
           
             JOptionPane.showMessageDialog(null, "Your Profile has been updated successfully", "success", JOptionPane.PLAIN_MESSAGE);
                updateJButton.setEnabled(true);
                saveJButton.setEnabled(false);
                firstNameField.setEnabled(false);
                lastNameField.setEnabled(false);
                addressField2.setEnabled(false);
                dobField.setEnabled(false);
                genderComboBox.setEnabled(false);
                addressField1.setEnabled(false);
                townField.setEnabled(false);
                zipCodeField.setEnabled(false);
                occupationField.setEnabled(false);
                emailIDField.setEnabled(false);
                userNameTxtField.setEnabled(false);
                phoneNumberField.setEnabled(false);
         }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void emailIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address2;
    private javax.swing.JTextField addressField1;
    private javax.swing.JTextField addressField2;
    private javax.swing.JLabel areaCode;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JLabel viewYourProfile2;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
