/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.person.Person;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class ViewVolunteerProfile extends javax.swing.JPanel {
    
     private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Person person;
  
    /**
     * Creates new form ViewVolunteerProfile
     */
    public ViewVolunteerProfile(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
   
        DateFormat form = new SimpleDateFormat("MM/dd/yyyy");
                
        firstNameField.setText(person.getPersonsFirstName());
        lastNameField.setText(person.getlName());
        dobField.setText(form.format(person.getDateOfBirth()));
        genderComboBox.setSelectedItem(person.getGender());
        addressField2.setText(person.getAddress1());
        addressField1.setText(person.getAddress2());
        townField.setText(person.getTown());
        zipCodeField.setText(person.getZipCode());
        occupationField.setText(person.getZipCode());
        emailIDField.setText(person.getEmailId());
        phoneNumberField.setText(person.getMobileNumber());
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewYourProfile2 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        occupationField = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        addressField1 = new javax.swing.JTextField();
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
        firstNameField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(21, 25, 28));
        setForeground(new java.awt.Color(169, 224, 49));
        setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        viewYourProfile2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile2.setForeground(new java.awt.Color(169, 224, 49));
        viewYourProfile2.setText("Address: ");

        phoneNumberField.setEditable(false);
        phoneNumberField.setBackground(new java.awt.Color(31, 36, 42));
        phoneNumberField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        phoneNumberField.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        phoneNumberField.setEnabled(false);
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        occupationField.setEditable(false);
        occupationField.setBackground(new java.awt.Color(31, 36, 42));
        occupationField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        occupationField.setForeground(new java.awt.Color(255, 255, 255));
        occupationField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        occupationField.setEnabled(false);

        LastName.setForeground(new java.awt.Color(169, 224, 49));
        LastName.setText("Last Name:");

        lastNameField.setEditable(false);
        lastNameField.setBackground(new java.awt.Color(31, 36, 42));
        lastNameField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        lastNameField.setEnabled(false);

        firstName.setForeground(new java.awt.Color(169, 224, 49));
        firstName.setText("First Name:");

        dateOfBirth.setForeground(new java.awt.Color(169, 224, 49));
        dateOfBirth.setText("Date Of Birth (YYYY/MM/DD):");

        phoneNumber.setForeground(new java.awt.Color(169, 224, 49));
        phoneNumber.setText("Phone Number:");

        address.setForeground(new java.awt.Color(169, 224, 49));
        address.setText("Address Line1:");

        town.setForeground(new java.awt.Color(169, 224, 49));
        town.setText("Town/City: ");

        addressField1.setEditable(false);
        addressField1.setBackground(new java.awt.Color(31, 36, 42));
        addressField1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        addressField1.setForeground(new java.awt.Color(255, 255, 255));
        addressField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        addressField1.setEnabled(false);

        townField.setEditable(false);
        townField.setBackground(new java.awt.Color(31, 36, 42));
        townField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        townField.setForeground(new java.awt.Color(255, 255, 255));
        townField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        townField.setEnabled(false);

        zipCode.setForeground(new java.awt.Color(169, 224, 49));
        zipCode.setText("Zip Code:");

        zipCodeField.setEditable(false);
        zipCodeField.setBackground(new java.awt.Color(31, 36, 42));
        zipCodeField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        zipCodeField.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        zipCodeField.setEnabled(false);

        occupation.setForeground(new java.awt.Color(169, 224, 49));
        occupation.setText("Occupation:");

        dobField.setBackground(new java.awt.Color(31, 36, 42));
        dobField.setForeground(new java.awt.Color(255, 255, 255));
        dobField.setEnabled(false);

        address2.setForeground(new java.awt.Color(169, 224, 49));
        address2.setText("Address Line2 : ");

        addressField2.setBackground(new java.awt.Color(31, 36, 42));
        addressField2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        addressField2.setForeground(new java.awt.Color(255, 255, 255));
        addressField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        addressField2.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt1.setText("Senior Safe");

        gender.setForeground(new java.awt.Color(169, 224, 49));
        gender.setText("Gender:");

        genderComboBox.setBackground(new java.awt.Color(31, 36, 42));
        genderComboBox.setForeground(new java.awt.Color(255, 255, 255));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.setEnabled(false);

        viewYourProfile1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile1.setForeground(new java.awt.Color(169, 224, 49));
        viewYourProfile1.setText("Personal Information");

        firstNameField.setEditable(false);
        firstNameField.setBackground(new java.awt.Color(31, 36, 42));
        firstNameField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(255, 255, 255));
        firstNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        firstNameField.setEnabled(false);

        emailID.setForeground(new java.awt.Color(169, 224, 49));
        emailID.setText("Email Address:");

        emailIDField.setEditable(false);
        emailIDField.setBackground(new java.awt.Color(31, 36, 42));
        emailIDField.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        emailIDField.setForeground(new java.awt.Color(255, 255, 255));
        emailIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        emailIDField.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(town)
                                    .addGap(18, 18, 18)
                                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LastName)
                                        .addComponent(firstName)
                                        .addComponent(occupation)
                                        .addComponent(emailID))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(92, 92, 92)
                                                    .addComponent(dateOfBirth)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(116, 116, 116)
                                                    .addComponent(gender)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(167, 167, 167)
                                            .addComponent(phoneNumber)
                                            .addGap(18, 18, 18)
                                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(address)
                                            .addGap(18, 18, 18)
                                            .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(address2)
                                            .addGap(18, 18, 18)
                                            .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewYourProfile2)
                                        .addGap(202, 202, 202)))
                                .addGap(186, 186, 186)
                                .addComponent(zipCode)
                                .addGap(18, 18, 18)
                                .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(463, 463, 463))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(552, 552, 552)
                    .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(viewYourProfile1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateOfBirth)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastName)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gender)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupation)
                    .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailID)
                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(viewYourProfile2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(town)
                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address2)
                    .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(manageEnt1)
                    .addContainerGap(616, Short.MAX_VALUE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address2;
    private javax.swing.JTextField addressField1;
    private javax.swing.JTextField addressField2;
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
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JLabel viewYourProfile2;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
