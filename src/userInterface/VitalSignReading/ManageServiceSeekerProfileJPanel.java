/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.VitalSignReading;

import business.EcoSystem;
import business.enterprises.Enterprise;
import business.person.ServiceSeeker;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.serviceSeeker.ViewVitalSignHistoryJPanel;
import userInterface.serviceSeeker.UpdateServiceSeekerProfile;
import userInterface.serviceSeeker.ViewVitalSignInfoJPanel;

/**
 *
 * @author prasanna
 */
public class ManageServiceSeekerProfileJPanel extends javax.swing.JPanel {
       private JPanel userProcessContainer;
    private UserAccount userAccount; 
   private Enterprise enterprise;
   private EcoSystem ecoSystem;
    
    /**
     * Creates new form GetAlertFromSeniorSafepJPanel
     */
    public ManageServiceSeekerProfileJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        helpSeekerName.setText(userAccount.getPerson().getFullName());
       
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
        getAlertFromHH = new javax.swing.JLabel();
        helpSeekerName = new javax.swing.JLabel();
        btnViewVitalSignHistory = new javax.swing.JButton();
        btnViewUpdateProfile = new javax.swing.JButton();
        btnManageVitalSigns = new javax.swing.JButton();
        btnViewVitalSignInfo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSendVitalInfoToDoc = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 26, 42));

        getAlertFromHH.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getAlertFromHH.setForeground(new java.awt.Color(169, 224, 49));
        getAlertFromHH.setText("Manage Service Seeker Profile ");

        helpSeekerName.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        helpSeekerName.setForeground(new java.awt.Color(169, 224, 49));
        helpSeekerName.setText("Help Seeker Name");

        btnViewVitalSignHistory.setBackground(new java.awt.Color(152, 201, 45));
        btnViewVitalSignHistory.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnViewVitalSignHistory.setForeground(new java.awt.Color(152, 201, 45));
        btnViewVitalSignHistory.setText("View Vital Sign History");
        btnViewVitalSignHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnViewVitalSignHistory.setContentAreaFilled(false);
        btnViewVitalSignHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewVitalSignHistory.setFocusPainted(false);
        btnViewVitalSignHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignHistoryActionPerformed(evt);
            }
        });

        btnViewUpdateProfile.setBackground(new java.awt.Color(152, 201, 45));
        btnViewUpdateProfile.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnViewUpdateProfile.setForeground(new java.awt.Color(152, 201, 45));
        btnViewUpdateProfile.setText("View / UpdateProfile");
        btnViewUpdateProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnViewUpdateProfile.setContentAreaFilled(false);
        btnViewUpdateProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewUpdateProfile.setFocusPainted(false);
        btnViewUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateProfileActionPerformed(evt);
            }
        });

        btnManageVitalSigns.setBackground(new java.awt.Color(152, 201, 45));
        btnManageVitalSigns.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnManageVitalSigns.setForeground(new java.awt.Color(152, 201, 45));
        btnManageVitalSigns.setText("Manage Vital Signs");
        btnManageVitalSigns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnManageVitalSigns.setContentAreaFilled(false);
        btnManageVitalSigns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageVitalSigns.setFocusPainted(false);
        btnManageVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVitalSignsActionPerformed(evt);
            }
        });

        btnViewVitalSignInfo.setBackground(new java.awt.Color(152, 201, 45));
        btnViewVitalSignInfo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnViewVitalSignInfo.setForeground(new java.awt.Color(152, 201, 45));
        btnViewVitalSignInfo.setText("View Vital Sign Info");
        btnViewVitalSignInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnViewVitalSignInfo.setContentAreaFilled(false);
        btnViewVitalSignInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewVitalSignInfo.setFocusPainted(false);
        btnViewVitalSignInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignInfoActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(152, 201, 45));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(152, 201, 45));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSendVitalInfoToDoc.setBackground(new java.awt.Color(152, 201, 45));
        btnSendVitalInfoToDoc.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnSendVitalInfoToDoc.setForeground(new java.awt.Color(152, 201, 45));
        btnSendVitalInfoToDoc.setText("Send Vital Info To Doctor");
        btnSendVitalInfoToDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        btnSendVitalInfoToDoc.setContentAreaFilled(false);
        btnSendVitalInfoToDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendVitalInfoToDoc.setFocusPainted(false);
        btnSendVitalInfoToDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendVitalInfoToDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(436, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageVitalSigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewVitalSignHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewVitalSignInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSendVitalInfoToDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(getAlertFromHH)
                .addGap(10, 10, 10)
                .addComponent(helpSeekerName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpSeekerName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getAlertFromHH))
                .addGap(52, 52, 52)
                .addComponent(btnViewUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewVitalSignHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSendVitalInfoToDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnViewVitalSignInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewVitalSignHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignHistoryActionPerformed
        // TODO add your handling code here:
      ServiceSeeker customer = (ServiceSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        ViewVitalSignHistoryJPanel viewVitalSignHistoryJPanel = new ViewVitalSignHistoryJPanel(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVitalSignHistoryJPanel);
        layout.next(userProcessContainer);
    
    }//GEN-LAST:event_btnViewVitalSignHistoryActionPerformed

    private void btnViewUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateProfileActionPerformed
        // TODO add your handling code here:
        UpdateServiceSeekerProfile viewVolunteerProfile = new UpdateServiceSeekerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewUpdateProfileActionPerformed

    private void btnManageVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVitalSignsActionPerformed
        // TODO add your handling code here:
            ManageVitalSignJPanel manageVitalSignJPanel = new ManageVitalSignJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVitalSignJPanel", manageVitalSignJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVitalSignsActionPerformed

    private void btnViewVitalSignInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignInfoActionPerformed
        // TODO add your handling code here:

          ServiceSeeker customer = (ServiceSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        ViewVitalSignInfoJPanel viewVitalSignInfoJPanel = new ViewVitalSignInfoJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVitalSignInfoJPanel", viewVitalSignInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewVitalSignInfoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendVitalInfoToDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendVitalInfoToDocActionPerformed
        // TODO add your handling code here:
         ServiceSeeker customer = (ServiceSeeker)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "Please update vital sign information first", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        SendVitalSignDataToDoctorPanel sendVitalSignDataToDoctorPanel = new SendVitalSignDataToDoctorPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendVitalSignDataToDoctorPanel", sendVitalSignDataToDoctorPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendVitalInfoToDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageVitalSigns;
    private javax.swing.JButton btnSendVitalInfoToDoc;
    private javax.swing.JButton btnViewUpdateProfile;
    private javax.swing.JButton btnViewVitalSignHistory;
    private javax.swing.JButton btnViewVitalSignInfo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JLabel helpSeekerName;
    // End of variables declaration//GEN-END:variables
}
