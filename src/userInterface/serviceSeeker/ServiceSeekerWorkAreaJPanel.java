/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.serviceSeeker;

import business.EcoSystem;
import business.enterprises.Enterprise;
import business.person.ServiceSeeker;
import business.vsTrackingDevice.VitalSign;
import business.userAccount.UserAccount;
import business.workQueue.NeedVitalSignDeviceRq;
import business.workQueue.SendDataToDoctorWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import userInterface.VitalSignReading.ManageServiceSeekerProfileJPanel;

/**
 *
 * @author prasanna
 */
public class ServiceSeekerWorkAreaJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private Enterprise enterprise;
      private UserAccount userAccount;  
      private EcoSystem ecoSystem;
      private ServiceSeeker person;
    private static int count = 0;
     private static boolean patientCond = false;
    /**
     * Creates new form HelpSeekerWorkAreaJPanel
     */
    public ServiceSeekerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise , UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise; 
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        //setBackground(new Color(182,201,233));
       
       
        person  = (ServiceSeeker)userAccount.getPerson();
        alertsPanel.setVisible(false);
      
         populateAlerts();
         alertsPanel.revalidate();
    }
    

    public void populateAlerts()
    {
       int count = 0;
       if(person.isShareVitalInfo() && person.isHasSensorDevice()) 
       {
    //    System.out.println("person.getVitalSignList()"+person.getVitalSignList().toString());
        if(!(person.getVitalSignList().isEmpty()))
        {
        for(VitalSign vitalSign : person.getVitalSignList())
        {
        String patientCondition = person.patientCondition(person.getAge(), vitalSign);
        if(patientCondition.equals("ABNORMAL"))
        {
            count++;
        }
        }
         if(count>2)
        {
            JOptionPane.showMessageDialog(null, "You have an alert ! ", "Alerts", JOptionPane.PLAIN_MESSAGE);
            patientCond = true;
            count = 0;
        }
        }
       }
       
        displayAlerts();
    }
    
   
    public void displayAlerts()
    {
      alertsPanel.removeAll();
      alertsPanel.revalidate();
       alertsPanel.setLayout(new GridLayout(10, 1,10,10));
       JTextArea textArea;
       JTextField txtField;
       StringBuilder sb ;
       int count = 0;
       int pos = 0;
         boolean flag = false;
            if(patientCond)
            {
            txtField = new JTextField("Alert Message From Heart Help!");   
            txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            textArea = new JTextArea("Vital Signs tracked last two time show that you are not feeling well, Do you need some help!");
            textArea.setVisible(true);
            textArea.setEditable(false);
            alertsPanel.add(txtField,pos);
            alertsPanel.add(textArea,++pos);
            ++pos;
            flag = true;
            patientCond = false;
            }
       
       if(!(userAccount.getWorkQueue().getWorkRequestList().isEmpty()))
       {
       for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(request.getMessage().equalsIgnoreCase("Vital Sign Data") && request.getStatus().equalsIgnoreCase("Completed"))
            {
            if(count<5)
            {
            SendDataToDoctorWorkRequest dataToDoctorWorkRequest = (SendDataToDoctorWorkRequest)request;
            txtField = new JTextField(" Message From Doctor: "+dataToDoctorWorkRequest.getReceiver().getPerson().getFullName());
            txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            
            textArea = new JTextArea(dataToDoctorWorkRequest.getNewMedication());
            textArea.setVisible(true);
            textArea.setEditable(false);
            count++;
             
           
            txtField.setEditable(false);
            textArea.setEditable(false);
            alertsPanel.add(txtField,pos);
            alertsPanel.add(textArea,++pos);
            ++pos;
            flag = true;
            }

            }
            if(request.getMessage().equalsIgnoreCase("Need vital sign Device") && request.getStatus().equalsIgnoreCase("Completed"))
            {
            if(count<5)
            {
             NeedVitalSignDeviceRq needSensorDeviceWorkRequest = (NeedVitalSignDeviceRq)request;
             sb= new StringBuilder();
             sb.append("RequestResult: ");
             sb.append(needSensorDeviceWorkRequest.getdonationRequestResult());
             sb.append(System.lineSeparator());
             sb.append("Comments From Donor: ");
             sb.append(needSensorDeviceWorkRequest.getComments());
            txtField = new JTextField(" Message From Donor: "+needSensorDeviceWorkRequest.getReceiver().getPerson().getFullName());
            txtField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            txtField.setVisible(true);
            txtField.setEditable(false);
            textArea = new JTextArea(sb.toString());
            textArea.setVisible(true);
            textArea.setEditable(false);
            count++;
             
           
            txtField.setEditable(false);
            textArea.setEditable(false);
            alertsPanel.add(txtField,pos);
            alertsPanel.add(textArea,++pos);
            ++pos;
            flag = true;
            }

            }
        }
       }

        if(flag)
        {
        alertsPanel.revalidate();
        alertsPanel.setVisible(true);
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

        manageEnt = new javax.swing.JLabel();
        alertsPanel = new javax.swing.JPanel();
        btnWriteTestimonialToVolunteer = new javax.swing.JButton();
        btnRequestHelpFromVolunteer = new javax.swing.JButton();
        btnManageHelpSeekerProfile = new javax.swing.JButton();

        setBackground(new java.awt.Color(32, 36, 42));

        manageEnt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        manageEnt.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt.setText("Service Seeker Work Area");

        alertsPanel.setBackground(new java.awt.Color(169, 224, 49));

        javax.swing.GroupLayout alertsPanelLayout = new javax.swing.GroupLayout(alertsPanel);
        alertsPanel.setLayout(alertsPanelLayout);
        alertsPanelLayout.setHorizontalGroup(
            alertsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );
        alertsPanelLayout.setVerticalGroup(
            alertsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        btnWriteTestimonialToVolunteer.setBackground(new java.awt.Color(152, 201, 45));
        btnWriteTestimonialToVolunteer.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnWriteTestimonialToVolunteer.setForeground(new java.awt.Color(21, 25, 28));
        btnWriteTestimonialToVolunteer.setText("Write Feedback To Volunteer");
        btnWriteTestimonialToVolunteer.setBorder(null);
        btnWriteTestimonialToVolunteer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWriteTestimonialToVolunteer.setFocusPainted(false);
        btnWriteTestimonialToVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteTestimonialToVolunteerActionPerformed(evt);
            }
        });

        btnRequestHelpFromVolunteer.setBackground(new java.awt.Color(152, 201, 45));
        btnRequestHelpFromVolunteer.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnRequestHelpFromVolunteer.setForeground(new java.awt.Color(21, 25, 28));
        btnRequestHelpFromVolunteer.setText("Request Service from Volunteer");
        btnRequestHelpFromVolunteer.setBorder(null);
        btnRequestHelpFromVolunteer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRequestHelpFromVolunteer.setFocusPainted(false);
        btnRequestHelpFromVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHelpFromVolunteerActionPerformed(evt);
            }
        });

        btnManageHelpSeekerProfile.setBackground(new java.awt.Color(152, 201, 45));
        btnManageHelpSeekerProfile.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnManageHelpSeekerProfile.setForeground(new java.awt.Color(21, 25, 28));
        btnManageHelpSeekerProfile.setText("Manage My Profile");
        btnManageHelpSeekerProfile.setBorder(null);
        btnManageHelpSeekerProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageHelpSeekerProfile.setFocusPainted(false);
        btnManageHelpSeekerProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHelpSeekerProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRequestHelpFromVolunteer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWriteTestimonialToVolunteer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageHelpSeekerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(alertsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt)
                        .addGap(132, 132, 132)
                        .addComponent(btnManageHelpSeekerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnWriteTestimonialToVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRequestHelpFromVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alertsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnWriteTestimonialToVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteTestimonialToVolunteerActionPerformed
        // TODO add your handling code here:
       WriteFeedbackForVolJPanel writeTestimonialForVolJPanel = new WriteFeedbackForVolJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("WriteFeedbackForVolJPanel", writeTestimonialForVolJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWriteTestimonialToVolunteerActionPerformed

    private void btnRequestHelpFromVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHelpFromVolunteerActionPerformed
       ManageServiceFromVolunteer manageHelpFromVolunteer = new ManageServiceFromVolunteer(userProcessContainer, userAccount, ecoSystem, enterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageServiceFromVolunteer", manageHelpFromVolunteer);
        layout.next(userProcessContainer); 

    }//GEN-LAST:event_btnRequestHelpFromVolunteerActionPerformed

    private void btnManageHelpSeekerProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHelpSeekerProfileActionPerformed
        // TODO add your handling code here:
  ManageServiceSeekerProfileJPanel manageHelpSeekerProfileJPanel = new ManageServiceSeekerProfileJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ManageServiceSeekerProfileJPanel", manageHelpSeekerProfileJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHelpSeekerProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alertsPanel;
    private javax.swing.JButton btnManageHelpSeekerProfile;
    private javax.swing.JButton btnRequestHelpFromVolunteer;
    private javax.swing.JButton btnWriteTestimonialToVolunteer;
    private javax.swing.JLabel manageEnt;
    // End of variables declaration//GEN-END:variables


}
