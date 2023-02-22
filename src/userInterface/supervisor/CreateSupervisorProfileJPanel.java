/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supervisor;

import business.common.DOBValidation;
import business.common.EmailValidation;
import business.common.ZipValidation;
import business.common.PhoneNumberValidation;
import business.common.InputValidation;
import business.person.Person;
import business.userAccount.UserAccount;
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
 * @author daniel
 */
public class CreateSupervisorProfileJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    /**
     * Creates new form CreateSupervisorProfileJPanel
     */
    public CreateSupervisorProfileJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        addInputVerifiers();
        supNameField.setText(userAccount.getPerson().getFullName());
    }
    
    
      private void addInputVerifiers() {
          
        InputVerifier stringValidation = new InputValidation();
        supNameField.setInputVerifier(stringValidation);
        supaddressField.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        
        InputVerifier dobValidtion = new DOBValidation();
        supDobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ZipValidation();
        zipCodeField.setInputVerifier(numberValidation);
        
        InputVerifier phnumberValidation = new PhoneNumberValidation();
        phoneNumberField.setInputVerifier(phnumberValidation);
        
        InputVerifier emailValidtion = new EmailValidation();
        emailIDField.setInputVerifier(emailValidtion);
     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zipCodeField = new javax.swing.JTextField();
        supNameField = new javax.swing.JTextField();
        donorName = new javax.swing.JLabel();
        createYourProfile = new javax.swing.JLabel();
        supDobField = new javax.swing.JFormattedTextField();
        zipCode = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        supaddressField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        occupation = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnCreateProfile = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 36, 42));

        zipCodeField.setBackground(new java.awt.Color(32, 36, 42));
        zipCodeField.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        supNameField.setEditable(false);
        supNameField.setBackground(new java.awt.Color(32, 36, 42));
        supNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        supNameField.setEnabled(false);

        donorName.setBackground(new java.awt.Color(32, 36, 42));
        donorName.setForeground(new java.awt.Color(169, 224, 49));
        donorName.setText("Full Name:");

        createYourProfile.setBackground(new java.awt.Color(32, 36, 42));
        createYourProfile.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        createYourProfile.setForeground(new java.awt.Color(169, 224, 49));
        createYourProfile.setText("Create Your Profile");

        supDobField.setBackground(new java.awt.Color(32, 36, 42));
        supDobField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        supDobField.setForeground(new java.awt.Color(255, 255, 255));

        zipCode.setBackground(new java.awt.Color(32, 36, 42));
        zipCode.setForeground(new java.awt.Color(169, 224, 49));
        zipCode.setText("Zip Code:");

        townField.setBackground(new java.awt.Color(32, 36, 42));
        townField.setForeground(new java.awt.Color(255, 255, 255));
        townField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        phoneNumber.setBackground(new java.awt.Color(32, 36, 42));
        phoneNumber.setForeground(new java.awt.Color(169, 224, 49));
        phoneNumber.setText("Phone Number:");

        emailIDField.setBackground(new java.awt.Color(32, 36, 42));
        emailIDField.setForeground(new java.awt.Color(255, 255, 255));
        emailIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        town.setBackground(new java.awt.Color(32, 36, 42));
        town.setForeground(new java.awt.Color(169, 224, 49));
        town.setText("Town/City: ");

        supaddressField.setBackground(new java.awt.Color(32, 36, 42));
        supaddressField.setForeground(new java.awt.Color(255, 255, 255));
        supaddressField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        emailID.setBackground(new java.awt.Color(32, 36, 42));
        emailID.setForeground(new java.awt.Color(169, 224, 49));
        emailID.setText("Email Address:");

        address.setBackground(new java.awt.Color(32, 36, 42));
        address.setForeground(new java.awt.Color(169, 224, 49));
        address.setText("Address: ");

        occupationField.setBackground(new java.awt.Color(32, 36, 42));
        occupationField.setForeground(new java.awt.Color(255, 255, 255));
        occupationField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        dateOfBirth.setBackground(new java.awt.Color(32, 36, 42));
        dateOfBirth.setForeground(new java.awt.Color(169, 224, 49));
        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        occupation.setBackground(new java.awt.Color(32, 36, 42));
        occupation.setForeground(new java.awt.Color(169, 224, 49));
        occupation.setText("Occupation:");

        manageEnt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        manageEnt.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEnt.setText("Supervisor Work Area");

        phoneNumberField.setBackground(new java.awt.Color(32, 36, 42));
        phoneNumberField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));

        btnBack.setBackground(new java.awt.Color(152, 201, 45));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(21, 25, 28));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateProfile.setBackground(new java.awt.Color(152, 201, 45));
        btnCreateProfile.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCreateProfile.setForeground(new java.awt.Color(21, 25, 28));
        btnCreateProfile.setText("Create Profile");
        btnCreateProfile.setBorder(null);
        btnCreateProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateProfile.setFocusPainted(false);
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(304, 304, 304)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumber)
                                        .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(occupation)
                                        .addComponent(town)
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(donorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(supDobField)
                                .addComponent(zipCodeField)
                                .addComponent(occupationField)
                                .addComponent(emailIDField)
                                .addComponent(supaddressField)
                                .addComponent(supNameField)
                                .addComponent(phoneNumberField)
                                .addComponent(townField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(262, 262, 262)
                            .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(397, 397, 397)
                            .addComponent(createYourProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(manageEnt)
                .addGap(40, 40, 40)
                .addComponent(createYourProfile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorName)
                    .addComponent(supNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(supDobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(supaddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(town))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(occupation))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
                Person person = userAccount.getPerson();
        if( supaddressField.getText()==null || supaddressField.getText().trim().isEmpty() ||
            townField.getText()==null || townField.getText().trim().isEmpty() ||
            occupationField.getText()==null || occupationField.getText().trim().isEmpty() ||
            emailIDField.getText()==null || emailIDField.getText().trim().isEmpty() ||
            phoneNumberField.getText()==null || phoneNumberField.getText().trim().isEmpty() || 
            supDobField.getText()==null || supDobField.getText().trim().isEmpty() ||
            zipCodeField.getText()==null || zipCodeField.getText().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all fields");
           return;
        }
        try
        {
        DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date dob =  dateFormat.parse(supDobField.getText());
        if(dob.after(date) || dob.equals(date))
        {
         JOptionPane.showMessageDialog(null, "Please Enter valid Date of Birth");
           return;    
        }
        
            person.setDateOfBirth(dateFormat.parse(supDobField.getText()));
            person.setAddress1(supaddressField.getText());
            person.setTown(townField.getText());
            person.setOccupation(occupationField.getText());
            person.setZipCode(zipCodeField.getText());
            person.setEmailId(emailIDField.getText());
            person.setMobileNumber(phoneNumberField.getText());

            JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            resetFields();
        }
        catch(ParseException pe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid date of Birth!");
            return;
        }
        catch(NumberFormatException nfe)
        {
          JOptionPane.showMessageDialog(null, "Please Enter valid number!");
            return;  
        }
        catch(Exception e)
        {  
            JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            return;
        }
    }//GEN-LAST:event_btnCreateProfileActionPerformed

    public void resetFields()
{
    supNameField.setText("");
    supDobField.setText("");
    supaddressField.setText("");
    townField.setText("");
    occupationField.setText("");
    zipCodeField.setText("");
    emailIDField.setText("");
    phoneNumberField.setText("");
    
    
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JLabel createYourProfile;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel donorName;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JFormattedTextField supDobField;
    private javax.swing.JTextField supNameField;
    private javax.swing.JTextField supaddressField;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}