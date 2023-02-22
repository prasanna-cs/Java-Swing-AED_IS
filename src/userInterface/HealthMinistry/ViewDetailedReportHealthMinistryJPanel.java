/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HealthMinistry;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author daniel
 */
public class ViewDetailedReportHealthMinistryJPanel extends javax.swing.JPanel {
    private HashMap<String,Integer> communitydetailsmap;
    private JPanel userProcessContainer;
    /**
     * Creates new form ViewDetailedReportHealthMinistryJPanel
     */
    public ViewDetailedReportHealthMinistryJPanel(JPanel userProcessContainer,HashMap<String,Integer> communitydetailsmap) {
        initComponents();
        this.communitydetailsmap = communitydetailsmap;
        this.userProcessContainer = userProcessContainer;
        
        populateDetailsForCommunity();
        populatePieDataChartPanel();
    }
    

    public void populateDetailsForCommunity()
    {
         try
        {
        seniorsWithHealthPrbField.setText(String.valueOf(communitydetailsmap.get("SeniorswithhealthProblem")));
       senWithNoHealthProbField.setText(String.valueOf(communitydetailsmap.get("SeniorswithNohealthProblem")));
       totSeniorPPLField.setText(String.valueOf(communitydetailsmap.get("TotalNoOfSeniorPeople")));
       senSendDataToDocField.setText(String.valueOf(communitydetailsmap.get("seniorsSendDataToDoctor")));
       senShareInfoField.setText(String.valueOf(communitydetailsmap.get("seniorsShareVitalInfo")));
       senNoSensorDevField.setText(String.valueOf(communitydetailsmap.get("seniorsWithNoVitalSignDevice")));
       senWithSensorField.setText(String.valueOf(communitydetailsmap.get("seniorsWithVitalSignDevice")));
        }
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }  
    }
    
    public void populatePieDataChartPanel()
    {
        pieChartDetailedReportPanel.removeAll();
        
        try
        {
         DefaultPieDataset dataSet = new DefaultPieDataset(); 
         dataSet.setValue("SeniorswithhealthProblem",communitydetailsmap.get("SeniorswithhealthProblem"));
         dataSet.setValue("SeniorswithNohealthProblem", communitydetailsmap.get("SeniorswithNohealthProblem") );
         dataSet.setValue("TotalNoOfSeniorPeople", communitydetailsmap.get("TotalNoOfSeniorPeople"));
         dataSet.setValue("seniorsSendDataToDoctor",communitydetailsmap.get("seniorsSendDataToDoctor"));
         dataSet.setValue("seniorsShareVitalInfo",  communitydetailsmap.get("seniorsShareVitalInfo"));
         dataSet.setValue("seniorsWithVitalSignDevice", communitydetailsmap.get("seniorsWithVitalSignDevice"));
         dataSet.setValue("seniorsWithNoVitalSignDevice", communitydetailsmap.get("seniorsWithNoVitalSignDevice"));
     
         JFreeChart  chart = ChartFactory.createPieChart3D("Pie Chart ", dataSet, true, true, Locale.ENGLISH);
          chart.setBackgroundPaint(Color.WHITE);
          chart.getTitle().setPaint(Color.BLUE);
            ChartPanel chartpanel = new ChartPanel(chart);
          chartpanel.setDomainZoomable(true);
          chartpanel.setBackground(Color.WHITE);
        pieChartDetailedReportPanel.setLayout(new BorderLayout());
        pieChartDetailedReportPanel.add(chartpanel, BorderLayout.EAST);
        pieChartDetailedReportPanel.revalidate();
        pieChartDetailedReportPanel.setVisible(true);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
    }
    
    public void populateBarDataChartPanel()
    {
        if(communitydetailsmap==null || communitydetailsmap.isEmpty())
        {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        try
        {
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset(); 
        if(communitydetailsmap.get("SeniorswithhealthProblem")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("SeniorswithhealthProblem"),"Values","SeniorswithhealthProblem");
        }
        if(communitydetailsmap.get("SeniorswithNohealthProblem")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("SeniorswithNohealthProblem"),"Values","SeniorswithNohealthProblem" );
        }
        if(communitydetailsmap.get("TotalNoOfSeniorPeople")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("TotalNoOfSeniorPeople"),"Values","TotalNoOfSeniorPeople" );
        }
        if(communitydetailsmap.get("seniorsSendDataToDoctor")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("seniorsSendDataToDoctor"),"Values","seniorsSendDataToDoctor");
        }
        if(communitydetailsmap.get("seniorsShareVitalInfo")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("seniorsShareVitalInfo"),"Values","seniorsShareVitalInfo"  );
        }
        if(communitydetailsmap.get("seniorsWithSensorDevice")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("seniorsWithSensorDevice"),"Values","seniorsWithSensorDevice" );
        }
        if(communitydetailsmap.get("seniorsWithNoSensorDevice")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("seniorsWithNoSensorDevice"),"Values","seniorsWithNoSensorDevice");
        }
        JFreeChart barchart = ChartFactory.createBarChart(" Bar Chart" ," Values " ,"Community Info", dataSet,PlotOrientation.VERTICAL, false, true, false);
             barchart.setBackgroundPaint(Color.WHITE);
             barchart.getTitle().setPaint(Color.BLUE);
             CategoryPlot plot = barchart.getCategoryPlot();
             plot.setBackgroundPaint(Color.CYAN);
             
            ChartFrame frame = new ChartFrame("Bar Chart  ", barchart);
            frame.setVisible(true);
            frame.setSize(450,350);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
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

        manageEnt1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        senSendDataToDocField = new javax.swing.JTextField();
        sendToDoc = new javax.swing.JLabel();
        seniorsWithHealthPrbField = new javax.swing.JTextField();
        totTransReq1 = new javax.swing.JLabel();
        totalSeniorPpl = new javax.swing.JLabel();
        senShareInfoField = new javax.swing.JTextField();
        noheartPrblm = new javax.swing.JLabel();
        hasHeartPblm = new javax.swing.JLabel();
        senWithNoHealthProbField = new javax.swing.JTextField();
        totSeniorPPLField = new javax.swing.JTextField();
        hasNoSensor = new javax.swing.JLabel();
        senWithSensorField = new javax.swing.JTextField();
        hasSensor = new javax.swing.JLabel();
        senNoSensorDevField = new javax.swing.JTextField();
        pieChartDetailedReportPanel = new javax.swing.JPanel();
        manageEnt2 = new javax.swing.JLabel();
        barchartBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(21, 25, 28));
        setForeground(new java.awt.Color(255, 255, 255));

        manageEnt1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        manageEnt1.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt1.setText("Report");

        jLayeredPane1.setBackground(new java.awt.Color(255, 204, 204));

        senSendDataToDocField.setEditable(false);
        senSendDataToDocField.setBackground(new java.awt.Color(152, 201, 45));
        senSendDataToDocField.setForeground(new java.awt.Color(152, 201, 45));
        senSendDataToDocField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        senSendDataToDocField.setOpaque(false);

        sendToDoc.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        sendToDoc.setForeground(new java.awt.Color(169, 224, 49));
        sendToDoc.setText("Total No of Seniors who send data to doctor");

        seniorsWithHealthPrbField.setEditable(false);
        seniorsWithHealthPrbField.setBackground(new java.awt.Color(152, 201, 45));
        seniorsWithHealthPrbField.setForeground(new java.awt.Color(152, 201, 45));
        seniorsWithHealthPrbField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        seniorsWithHealthPrbField.setOpaque(false);

        totTransReq1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        totTransReq1.setForeground(new java.awt.Color(169, 224, 49));
        totTransReq1.setText("Total No of Seniors who share Vital Info");

        totalSeniorPpl.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        totalSeniorPpl.setForeground(new java.awt.Color(169, 224, 49));
        totalSeniorPpl.setText("Total No of Senior People who are in need of Service");

        senShareInfoField.setEditable(false);
        senShareInfoField.setBackground(new java.awt.Color(152, 201, 45));
        senShareInfoField.setForeground(new java.awt.Color(152, 201, 45));
        senShareInfoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        senShareInfoField.setOpaque(false);

        noheartPrblm.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        noheartPrblm.setForeground(new java.awt.Color(169, 224, 49));
        noheartPrblm.setText("No of Senior people with no health problem ");

        hasHeartPblm.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        hasHeartPblm.setForeground(new java.awt.Color(169, 224, 49));
        hasHeartPblm.setText("No of Senior people with health problem");

        senWithNoHealthProbField.setEditable(false);
        senWithNoHealthProbField.setBackground(new java.awt.Color(152, 201, 45));
        senWithNoHealthProbField.setForeground(new java.awt.Color(152, 201, 45));
        senWithNoHealthProbField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        senWithNoHealthProbField.setOpaque(false);

        totSeniorPPLField.setEditable(false);
        totSeniorPPLField.setBackground(new java.awt.Color(152, 201, 45));
        totSeniorPPLField.setForeground(new java.awt.Color(152, 201, 45));
        totSeniorPPLField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        totSeniorPPLField.setOpaque(false);

        hasNoSensor.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        hasNoSensor.setForeground(new java.awt.Color(169, 224, 49));
        hasNoSensor.setText("Total No of Seniors who dont have Vital sign device");

        senWithSensorField.setEditable(false);
        senWithSensorField.setBackground(new java.awt.Color(152, 201, 45));
        senWithSensorField.setForeground(new java.awt.Color(152, 201, 45));
        senWithSensorField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        senWithSensorField.setOpaque(false);

        hasSensor.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        hasSensor.setForeground(new java.awt.Color(169, 224, 49));
        hasSensor.setText("Total No of seniors who has vital sign device");

        senNoSensorDevField.setEditable(false);
        senNoSensorDevField.setBackground(new java.awt.Color(152, 201, 45));
        senNoSensorDevField.setForeground(new java.awt.Color(152, 201, 45));
        senNoSensorDevField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        senNoSensorDevField.setOpaque(false);

        jLayeredPane1.setLayer(senSendDataToDocField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sendToDoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(seniorsWithHealthPrbField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totTransReq1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totalSeniorPpl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senShareInfoField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(noheartPrblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasHeartPblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senWithNoHealthProbField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totSeniorPPLField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasNoSensor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senWithSensorField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasSensor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senNoSensorDevField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasNoSensor)
                    .addComponent(totalSeniorPpl, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasHeartPblm, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hasSensor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noheartPrblm, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(totTransReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendToDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senNoSensorDevField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senShareInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senWithSensorField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senWithNoHealthProbField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seniorsWithHealthPrbField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totSeniorPPLField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senSendDataToDocField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSeniorPpl)
                    .addComponent(totSeniorPPLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasHeartPblm)
                    .addComponent(seniorsWithHealthPrbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noheartPrblm)
                    .addComponent(senWithNoHealthProbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasSensor)
                    .addComponent(senWithSensorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totTransReq1)
                    .addComponent(senShareInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasNoSensor)
                    .addComponent(senNoSensorDevField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendToDoc)
                    .addComponent(senSendDataToDocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pieChartDetailedReportPanel.setBackground(new java.awt.Color(21, 25, 28));

        javax.swing.GroupLayout pieChartDetailedReportPanelLayout = new javax.swing.GroupLayout(pieChartDetailedReportPanel);
        pieChartDetailedReportPanel.setLayout(pieChartDetailedReportPanelLayout);
        pieChartDetailedReportPanelLayout.setHorizontalGroup(
            pieChartDetailedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        pieChartDetailedReportPanelLayout.setVerticalGroup(
            pieChartDetailedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        manageEnt2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        manageEnt2.setForeground(new java.awt.Color(169, 224, 49));
        manageEnt2.setText("Health Minister Portal");

        barchartBtn.setBackground(new java.awt.Color(152, 201, 45));
        barchartBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        barchartBtn.setForeground(new java.awt.Color(152, 201, 45));
        barchartBtn.setText("View Chart");
        barchartBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        barchartBtn.setContentAreaFilled(false);
        barchartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barchartBtn.setFocusPainted(false);
        barchartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barchartBtnActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(152, 201, 45));
        jButton7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(152, 201, 45));
        jButton7.setText("Back");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 201, 45)));
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barchartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pieChartDetailedReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(manageEnt2)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEnt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pieChartDetailedReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barchartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void barchartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barchartBtnActionPerformed
 populateBarDataChartPanel(); populateBarDataChartPanel();    }//GEN-LAST:event_barchartBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barchartBtn;
    private javax.swing.JLabel hasHeartPblm;
    private javax.swing.JLabel hasNoSensor;
    private javax.swing.JLabel hasSensor;
    private javax.swing.JButton jButton7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel noheartPrblm;
    private javax.swing.JPanel pieChartDetailedReportPanel;
    private javax.swing.JTextField senNoSensorDevField;
    private javax.swing.JTextField senSendDataToDocField;
    private javax.swing.JTextField senShareInfoField;
    private javax.swing.JTextField senWithNoHealthProbField;
    private javax.swing.JTextField senWithSensorField;
    private javax.swing.JLabel sendToDoc;
    private javax.swing.JTextField seniorsWithHealthPrbField;
    private javax.swing.JTextField totSeniorPPLField;
    private javax.swing.JLabel totTransReq1;
    private javax.swing.JLabel totalSeniorPpl;
    // End of variables declaration//GEN-END:variables
}
