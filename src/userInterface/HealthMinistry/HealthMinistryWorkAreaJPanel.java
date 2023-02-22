/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HealthMinistry;

import business.EcoSystem;
import business.enterprises.Enterprise;
import business.network.Network;
import business.organizations.ServiceSeekerOrganization;
import business.organizations.HealthMinistryOrganization;
import business.organizations.Organization;
import business.person.ServiceSeeker;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class HealthMinistryWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private HealthMinistryOrganization healthMinistryOrganization;
    private HashMap<String,Integer> communitydetailsmap;
 
    public HealthMinistryWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, EcoSystem ecoSystem ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.healthMinistryOrganization = (HealthMinistryOrganization)organization;
        
        populateWorkRequestTable();
        
        
    }
    
 
    
    public void populateWorkRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)communityHealthTable.getModel();
        model.setRowCount(0);
        
        try
        {
        communitydetailsmap = getHelpSeekerData();
        }
        catch(NullPointerException npe)
        {
        npe.printStackTrace();
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
    
         Object[] rowData = new Object[4];
         rowData[0] = communitydetailsmap.get("TotalNoOfSeniorPeople");
         rowData[1] = communitydetailsmap.get("AverageAge");
         rowData[2] = communitydetailsmap.get("SeniorswithhealthProblem");
         rowData[3] = communitydetailsmap.get("SeniorswithNohealthProblem");
         
         model.addRow(rowData);
    }
    
    public ServiceSeekerOrganization getHelpSeekerOrg()
    {
        ServiceSeekerOrganization helpSeekerOrg = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEl())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.SeniorSafe))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(organization instanceof ServiceSeekerOrganization)
             {
              helpSeekerOrg = (ServiceSeekerOrganization)organization;
             }
            }
            }
          }
         }
        }
        return helpSeekerOrg;
    }
    
    public HashMap<String,Integer> getHelpSeekerData()
    {
        int seniorCardiacProb = 0;
        int seniorNoCardiacProb = 0;
        int avgAge = 0;
        int seniorsWithSensorDevice = 0;
        int seniorsShareVitalInfo = 0;
        int seniorsSendDataToDoctor = 0;
        int seniorsWithNoSensorDevice = 0;
        
        ServiceSeekerOrganization serviceSeekerOrganization = getHelpSeekerOrg();
        if(serviceSeekerOrganization == null)
        {
        JOptionPane.showMessageDialog(null, " Service Seeker Organization does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return null;     
        }
        if(serviceSeekerOrganization.getPersonDirectory().getCustomerDirectory().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Service Seekers Registered!","warning", JOptionPane.WARNING_MESSAGE);
        return null; 
        }
        int totalSeniors = serviceSeekerOrganization.getPersonDirectory().getCustomerDirectory().size();
      HashMap<String,Integer> seniorHealthPatientMap = new HashMap<>();
       for(ServiceSeeker serviceSeeker : serviceSeekerOrganization.getPersonDirectory().getCustomerDirectory())
          {
           if(serviceSeeker.isHasHealthIsuues())
           {
            seniorCardiacProb ++;  
           } 
           if(!serviceSeeker.isHasHealthIsuues())
           {
            seniorNoCardiacProb ++;   
           }
           if(serviceSeeker.isHasSensorDevice())
           {
            seniorsWithSensorDevice ++;   
           } 
           if(!serviceSeeker.isHasSensorDevice())
           {
            seniorsWithNoSensorDevice++;   
           }
           if(serviceSeeker.isSendVitalSignsToDoctor())
           {
            seniorsSendDataToDoctor ++;   
           } 
           if(serviceSeeker.isShareVitalInfo())
           {
            seniorsShareVitalInfo ++;   
           } 
           avgAge+= serviceSeeker.getAge();
          } 
        
               
       seniorHealthPatientMap.put("SeniorswithhealthProblem", seniorCardiacProb);
       seniorHealthPatientMap.put("SeniorswithNohealthProblem", seniorNoCardiacProb);
       seniorHealthPatientMap.put("TotalNoOfSeniorPeople", totalSeniors);
       seniorHealthPatientMap.put("AverageAge", avgAge/totalSeniors);
       seniorHealthPatientMap.put("seniorsSendDataToDoctor",seniorsSendDataToDoctor);
       seniorHealthPatientMap.put("seniorsShareVitalInfo",seniorsShareVitalInfo);
       seniorHealthPatientMap.put("seniorsWithSensorDevice",seniorsWithSensorDevice);
       seniorHealthPatientMap.put("seniorsWithNoSensorDevice",seniorsWithNoSensorDevice);
       
       return seniorHealthPatientMap;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityHealthTable = new javax.swing.JTable();
        viewDetailedRprtMayorBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(21, 25, 28));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 224, 49));
        jLabel6.setText("Health Ministry Work Area");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 224, 49));
        jLabel7.setText("Community Health Report:");

        communityHealthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Senior People", "Average age ", "Seniors with Health problem", "Seniors with no Health problems"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(communityHealthTable);

        viewDetailedRprtMayorBtn1.setBackground(new java.awt.Color(152, 201, 45));
        viewDetailedRprtMayorBtn1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        viewDetailedRprtMayorBtn1.setForeground(new java.awt.Color(152, 201, 45));
        viewDetailedRprtMayorBtn1.setText("View full report");
        viewDetailedRprtMayorBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        viewDetailedRprtMayorBtn1.setContentAreaFilled(false);
        viewDetailedRprtMayorBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewDetailedRprtMayorBtn1.setFocusPainted(false);
        viewDetailedRprtMayorBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailedRprtMayorBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewDetailedRprtMayorBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(335, 335, 335))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(viewDetailedRprtMayorBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailedRprtMayorBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailedRprtMayorBtn1ActionPerformed
        // TODO add your handling code here:
        if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
        ViewDetailedReportHealthMinistryJPanel viewDetailedReportMayorJPanel = new ViewDetailedReportHealthMinistryJPanel(userProcessContainer, communitydetailsmap);
        CardLayout layoutt = (CardLayout) userProcessContainer.getLayout();
        CardLayout layout = null;
        userProcessContainer.add("ViewDetailedReportMayorJPanel", viewDetailedReportMayorJPanel);
        layoutt.next(userProcessContainer);
    }//GEN-LAST:event_viewDetailedRprtMayorBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable communityHealthTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDetailedRprtMayorBtn1;
    // End of variables declaration//GEN-END:variables
}
