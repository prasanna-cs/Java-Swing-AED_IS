/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.VitalSignReading;

import business.EcoSystem;
import business.enterprises.Enterprise;
import business.enterprises.NGOEnterprise;
import business.network.Network;
import business.organizations.Organization;
import business.person.ServiceSeeker;
import business.userAccount.UserAccount;
import business.workQueue.NeedVitalSignDeviceRq;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */
public class ManageVitalSignJPanel extends javax.swing.JPanel {
     
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private ServiceSeeker person;
    private EcoSystem ecoSystem;

    /**
     * Creates new form HeartRateSensorJPanel
     */
    public ManageVitalSignJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = (ServiceSeeker)userAccount.getPerson();
        this.ecoSystem = ecoSystem;
        vitalSignPanel.setVisible(false);

    }
    
    
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shareInfoGroup = new javax.swing.ButtonGroup();
        hasSensorGroup = new javax.swing.ButtonGroup();
        getAlertsGroup = new javax.swing.ButtonGroup();
        hasCardiacProbGroup = new javax.swing.ButtonGroup();
        sendToDoctorGroup = new javax.swing.ButtonGroup();
        getAlertFromHH = new javax.swing.JLabel();
        shareVitalInfoJRadioYes = new javax.swing.JRadioButton();
        shareVitalInfoJRadioNo = new javax.swing.JRadioButton();
        shareInfo = new javax.swing.JLabel();
        vitalSignPanel = new javax.swing.JPanel();
        hasSensorRadioYes = new javax.swing.JRadioButton();
        respRateCheckBox = new javax.swing.JCheckBox();
        getAlertJRadioYes = new javax.swing.JRadioButton();
        sysBPCheckBox = new javax.swing.JCheckBox();
        weightCheckBox = new javax.swing.JCheckBox();
        getAlert = new javax.swing.JLabel();
        sensorDevice = new javax.swing.JLabel();
        getAlertJRadioNo = new javax.swing.JRadioButton();
        vitalSignsTrck = new javax.swing.JLabel();
        hasSensorRadioNo = new javax.swing.JRadioButton();
        heartRateChckBox = new javax.swing.JCheckBox();
        cardiacProblems = new javax.swing.JLabel();
        hasCardiacYes = new javax.swing.JRadioButton();
        hasCardiacRadioNo = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 36, 42));

        getAlertFromHH.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getAlertFromHH.setForeground(new java.awt.Color(169, 224, 49));
        getAlertFromHH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getAlertFromHH.setText("Manage Vital Signs");

        shareVitalInfoJRadioYes.setBackground(new java.awt.Color(32, 36, 42));
        shareInfoGroup.add(shareVitalInfoJRadioYes);
        shareVitalInfoJRadioYes.setForeground(new java.awt.Color(169, 224, 49));
        shareVitalInfoJRadioYes.setText("Yes");
        shareVitalInfoJRadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareVitalInfoJRadioYesActionPerformed(evt);
            }
        });

        shareVitalInfoJRadioNo.setBackground(new java.awt.Color(32, 36, 42));
        shareInfoGroup.add(shareVitalInfoJRadioNo);
        shareVitalInfoJRadioNo.setForeground(new java.awt.Color(169, 224, 49));
        shareVitalInfoJRadioNo.setText("No");
        shareVitalInfoJRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareVitalInfoJRadioNoActionPerformed(evt);
            }
        });

        shareInfo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        shareInfo.setForeground(new java.awt.Color(169, 224, 49));
        shareInfo.setText("Would you like to share Vital Sign Information with us :");

        vitalSignPanel.setBackground(new java.awt.Color(32, 36, 42));
        vitalSignPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hasSensorRadioYes.setBackground(new java.awt.Color(32, 36, 42));
        hasSensorGroup.add(hasSensorRadioYes);
        hasSensorRadioYes.setForeground(new java.awt.Color(169, 224, 49));
        hasSensorRadioYes.setText("Yes");
        hasSensorRadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasSensorRadioYesActionPerformed(evt);
            }
        });

        respRateCheckBox.setBackground(new java.awt.Color(32, 36, 42));
        respRateCheckBox.setForeground(new java.awt.Color(169, 224, 49));
        respRateCheckBox.setText("Respiratory Rate");

        getAlertJRadioYes.setBackground(new java.awt.Color(32, 36, 42));
        getAlertsGroup.add(getAlertJRadioYes);
        getAlertJRadioYes.setForeground(new java.awt.Color(169, 224, 49));
        getAlertJRadioYes.setText("Yes");
        getAlertJRadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAlertJRadioYesActionPerformed(evt);
            }
        });

        sysBPCheckBox.setBackground(new java.awt.Color(32, 36, 42));
        sysBPCheckBox.setForeground(new java.awt.Color(169, 224, 49));
        sysBPCheckBox.setText("Systollic Blood Pressure");

        weightCheckBox.setBackground(new java.awt.Color(32, 36, 42));
        weightCheckBox.setForeground(new java.awt.Color(169, 224, 49));
        weightCheckBox.setText("Weight");

        getAlert.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getAlert.setForeground(new java.awt.Color(169, 224, 49));
        getAlert.setText("Would you like to get alert from Senior Safe:");

        sensorDevice.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sensorDevice.setForeground(new java.awt.Color(169, 224, 49));
        sensorDevice.setText("Do you have a vital sign device to track Vital Signs");

        getAlertJRadioNo.setBackground(new java.awt.Color(32, 36, 42));
        getAlertsGroup.add(getAlertJRadioNo);
        getAlertJRadioNo.setForeground(new java.awt.Color(169, 224, 49));
        getAlertJRadioNo.setText("No");
        getAlertJRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAlertJRadioNoActionPerformed(evt);
            }
        });

        vitalSignsTrck.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        vitalSignsTrck.setForeground(new java.awt.Color(169, 224, 49));
        vitalSignsTrck.setText("Please Select Vital Signs you would like to track:");

        hasSensorRadioNo.setBackground(new java.awt.Color(32, 36, 42));
        hasSensorGroup.add(hasSensorRadioNo);
        hasSensorRadioNo.setForeground(new java.awt.Color(169, 224, 49));
        hasSensorRadioNo.setText("No");
        hasSensorRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasSensorRadioNoActionPerformed(evt);
            }
        });

        heartRateChckBox.setBackground(new java.awt.Color(32, 36, 42));
        heartRateChckBox.setForeground(new java.awt.Color(169, 224, 49));
        heartRateChckBox.setText("Heart Rate");

        javax.swing.GroupLayout vitalSignPanelLayout = new javax.swing.GroupLayout(vitalSignPanel);
        vitalSignPanel.setLayout(vitalSignPanelLayout);
        vitalSignPanelLayout.setHorizontalGroup(
            vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vitalSignsTrck, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sensorDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getAlert))
                .addGap(58, 58, 58)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weightCheckBox)
                    .addComponent(sysBPCheckBox)
                    .addGroup(vitalSignPanelLayout.createSequentialGroup()
                        .addComponent(getAlertJRadioYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getAlertJRadioNo))
                    .addGroup(vitalSignPanelLayout.createSequentialGroup()
                        .addComponent(hasSensorRadioYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hasSensorRadioNo))
                    .addComponent(respRateCheckBox)
                    .addComponent(heartRateChckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        vitalSignPanelLayout.setVerticalGroup(
            vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vitalSignPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sensorDevice)
                    .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hasSensorRadioYes)
                        .addComponent(hasSensorRadioNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitalSignsTrck)
                    .addComponent(heartRateChckBox))
                .addGap(18, 18, 18)
                .addComponent(respRateCheckBox)
                .addGap(18, 18, 18)
                .addComponent(sysBPCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(weightCheckBox)
                .addGap(21, 21, 21)
                .addGroup(vitalSignPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAlert)
                    .addComponent(getAlertJRadioYes)
                    .addComponent(getAlertJRadioNo))
                .addGap(53, 53, 53))
        );

        cardiacProblems.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cardiacProblems.setForeground(new java.awt.Color(169, 224, 49));
        cardiacProblems.setText("Do you have health problems ");

        hasCardiacYes.setBackground(new java.awt.Color(32, 36, 42));
        hasCardiacProbGroup.add(hasCardiacYes);
        hasCardiacYes.setForeground(new java.awt.Color(169, 224, 49));
        hasCardiacYes.setText("Yes");
        hasCardiacYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasCardiacYesActionPerformed(evt);
            }
        });

        hasCardiacRadioNo.setBackground(new java.awt.Color(32, 36, 42));
        hasCardiacProbGroup.add(hasCardiacRadioNo);
        hasCardiacRadioNo.setForeground(new java.awt.Color(169, 224, 49));
        hasCardiacRadioNo.setText("No");
        hasCardiacRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasCardiacRadioNoActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(152, 201, 45));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(152, 201, 45));
        btnBack.setText("back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(152, 201, 45));
        btnCancel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(152, 201, 45));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(152, 201, 45));
        btnSubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(152, 201, 45));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setFocusPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(getAlertFromHH, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cardiacProblems)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hasCardiacYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hasCardiacRadioNo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(shareInfo)
                                .addGap(18, 18, 18)
                                .addComponent(shareVitalInfoJRadioYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shareVitalInfoJRadioNo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(vitalSignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(getAlertFromHH)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shareVitalInfoJRadioYes)
                    .addComponent(shareVitalInfoJRadioNo)
                    .addComponent(shareInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardiacProblems)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hasCardiacYes)
                        .addComponent(hasCardiacRadioNo)))
                .addGap(18, 18, 18)
                .addComponent(vitalSignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void  resetFields()
    {
        hasCardiacYes.setSelected(false);
        hasCardiacRadioNo.setSelected(false);
        shareVitalInfoJRadioNo.setSelected(false);
        shareVitalInfoJRadioYes.setSelected(false);
        hasSensorRadioYes.setSelected(false);
        hasSensorRadioNo.setSelected(false);
        heartRateChckBox.setSelected(false);
        respRateCheckBox.setSelected(false);
        sysBPCheckBox.setSelected(false);
        weightCheckBox.setSelected(false);
        getAlertJRadioYes.setSelected(false);
        getAlertJRadioNo.setSelected(false);
    }
       

    private void shareVitalInfoJRadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareVitalInfoJRadioYesActionPerformed
         
         person.setShareVitalInfo(true);
         if(hasCardiacYes.isSelected())
         {
           vitalSignPanel.setVisible(true);   
         }
           
    }//GEN-LAST:event_shareVitalInfoJRadioYesActionPerformed

    private void shareVitalInfoJRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareVitalInfoJRadioNoActionPerformed
         person.setShareVitalInfo(false);
         vitalSignPanel.setVisible(false);
    }//GEN-LAST:event_shareVitalInfoJRadioNoActionPerformed

    private void hasSensorRadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasSensorRadioYesActionPerformed
       person.setHasSensorDevice(true);
       
    }//GEN-LAST:event_hasSensorRadioYesActionPerformed

    private void hasSensorRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasSensorRadioNoActionPerformed
        person.setHasSensorDevice(false);
    }//GEN-LAST:event_hasSensorRadioNoActionPerformed

    private void getAlertJRadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAlertJRadioYesActionPerformed
       person.setGetAlerts(true);
    }//GEN-LAST:event_getAlertJRadioYesActionPerformed

    private void getAlertJRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAlertJRadioNoActionPerformed
        person.setGetAlerts(false);
    }//GEN-LAST:event_getAlertJRadioNoActionPerformed

    private void hasCardiacYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasCardiacYesActionPerformed
        person.setHasHealthIsuues(true);
        if(shareVitalInfoJRadioYes.isSelected())
        {
        vitalSignPanel.setVisible(true);
        }
    }//GEN-LAST:event_hasCardiacYesActionPerformed

    private void hasCardiacRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasCardiacRadioNoActionPerformed
       person.setHasHealthIsuues(false);
        vitalSignPanel.setVisible(false);
    }//GEN-LAST:event_hasCardiacRadioNoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         try
        {
        if(shareInfoGroup.getSelection() == null || hasCardiacProbGroup.getSelection() == null)
       {
      JOptionPane.showMessageDialog(null, "Please Select a radio button to Let us know if you would like to share Information ","warning", JOptionPane.WARNING_MESSAGE);
       return;      
       }
       
       if(shareVitalInfoJRadioYes.isSelected() && hasCardiacYes.isSelected())
       {
        person.setShareVitalInfo(true);
        person.setHasHealthIsuues(true);
           
         boolean hR =  false;
         boolean bp = false;
         boolean rr = false;
         boolean wght = false;
            
      ArrayList<String> vitalSigns = new ArrayList<>();
        if(heartRateChckBox.isSelected())
        {
        hR=true;    
        vitalSigns.add(heartRateChckBox.getText());
        }
        if(sysBPCheckBox.isSelected())
        {
            bp = true;
          vitalSigns.add(sysBPCheckBox.getText());   
        }
        if(respRateCheckBox.isSelected())
        {
            rr = true;
          vitalSigns.add(respRateCheckBox.getText());   
        }
         if(weightCheckBox.isSelected())
        {
            wght = true;
          vitalSigns.add(weightCheckBox.getText());   
        }
       if(!hR || !bp || !rr || !wght)
         {
        JOptionPane.showMessageDialog(null, "Please Select all the Checkboxes to track Vital signs","warning", JOptionPane.WARNING_MESSAGE);
         return;      
        }
        
         person.setVitalSignTrackingList(vitalSigns);
       }
       if(hasSensorGroup.getSelection() == null)
       {
       JOptionPane.showMessageDialog(null, "Please Select a radio button to Let us know if you have a vital sign device ","warning", JOptionPane.WARNING_MESSAGE);
       return;        
       }
      
       if(getAlertsGroup.getSelection() == null)
       {
       JOptionPane.showMessageDialog(null, "Please Select a radio button to Let us know if you would like to get alerts ","warning", JOptionPane.WARNING_MESSAGE);
       return;     
       }
     // To add vital sign data  
     if(person.isShareVitalInfo() && person.isHasSensorDevice())
     {
        person.setHasSensorDevice(true);
        person.addVitalSign();    
      }
       JOptionPane.showMessageDialog(null, "Vital Sign information has been updated successfully ","success", JOptionPane.PLAIN_MESSAGE);
       
       if(person.isShareVitalInfo() && !person.isHasSensorDevice())
       {
        person.setHasSensorDevice(false);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you need a vital Sign device ? ", "warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            
        if(!(userAccount.getWorkQueue().getWorkRequestList().isEmpty()))
                {
                for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
                {
                   if(request.getMessage().equalsIgnoreCase("Need vital sign device Device"))
                   {
                JOptionPane.showMessageDialog(null, "You have placed a request for vital sign device earlier ","warning", JOptionPane.WARNING_MESSAGE);
                 return;              
                   }
                }
                }    
            
        String message = "Need vital sign Device";    
        NeedVitalSignDeviceRq nsdwr = new NeedVitalSignDeviceRq();
        nsdwr.setMessage("Need vital sign Device");
        nsdwr.setComments(message);
        nsdwr.setSender(userAccount);
        nsdwr.setStatus("Sent");
        
      try
      {
        for(Network network : ecoSystem.getNetworkList())
        {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEl())
          {
              if(enterprise instanceof NGOEnterprise)
              {
              if(enterprise.getOrganizationDirectory().getOrganizationDirectory().isEmpty())
              {
             JOptionPane.showMessageDialog(null, "Donor Organization in Non Profit Enterprise does not exist as of now ","warning", JOptionPane.WARNING_MESSAGE);
             return;       
              }
              for(Organization org : enterprise.getOrganizationDirectory().getOrganizationDirectory())
              {
              org.getWorkQueue().getWorkRequestList().add(nsdwr);
              }
             }
          }
        }
      }
      catch(NullPointerException npe)
      {
       JOptionPane.showMessageDialog(null, "Non Profit Enterprise does not exist as of now ","warning", JOptionPane.WARNING_MESSAGE);
        return;          
      }
        userAccount.getWorkQueue().getWorkRequestList().add(nsdwr);
        JOptionPane.showMessageDialog(null, "Request has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
         
        }
        resetFields();
        }
        }
        catch(Exception e)
        {
      JOptionPane.showMessageDialog(null, "Please enter data in all fields  ","warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
       
    }//GEN-LAST:event_btnSubmitActionPerformed
  
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel cardiacProblems;
    private javax.swing.JLabel getAlert;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JRadioButton getAlertJRadioNo;
    private javax.swing.JRadioButton getAlertJRadioYes;
    private javax.swing.ButtonGroup getAlertsGroup;
    private javax.swing.ButtonGroup hasCardiacProbGroup;
    private javax.swing.JRadioButton hasCardiacRadioNo;
    private javax.swing.JRadioButton hasCardiacYes;
    private javax.swing.ButtonGroup hasSensorGroup;
    private javax.swing.JRadioButton hasSensorRadioNo;
    private javax.swing.JRadioButton hasSensorRadioYes;
    private javax.swing.JCheckBox heartRateChckBox;
    private javax.swing.JCheckBox respRateCheckBox;
    private javax.swing.ButtonGroup sendToDoctorGroup;
    private javax.swing.JLabel sensorDevice;
    private javax.swing.JLabel shareInfo;
    private javax.swing.ButtonGroup shareInfoGroup;
    private javax.swing.JRadioButton shareVitalInfoJRadioNo;
    private javax.swing.JRadioButton shareVitalInfoJRadioYes;
    private javax.swing.JCheckBox sysBPCheckBox;
    private javax.swing.JPanel vitalSignPanel;
    private javax.swing.JLabel vitalSignsTrck;
    private javax.swing.JCheckBox weightCheckBox;
    // End of variables declaration//GEN-END:variables

 
}
