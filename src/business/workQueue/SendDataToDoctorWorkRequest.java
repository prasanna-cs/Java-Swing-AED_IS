/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.vsTrackingDevice.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class SendDataToDoctorWorkRequest extends WorkRequest{
    
    private String sendDataRequestId;
    private static int counter = 000;
    private ArrayList<VitalSign> vitalSignDirectory;
    private String currentPrescriptions;
    private String newMedication;
    private String reqResult;
   
    
     public SendDataToDoctorWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(counter);
        sendDataRequestId = sb.toString();
        counter++;
        vitalSignDirectory = new ArrayList<>();
    }
    

    @Override
    public String toString() {
        
        return this.sendDataRequestId;       
    }

    public ArrayList<VitalSign> getVitalSignDirectory() {
        return vitalSignDirectory;
    }

    public String getCurrentPrescriptions() {
        return currentPrescriptions;
    }

    public void setCurrentPrescriptions(String currentPrescriptions) {
        this.currentPrescriptions = currentPrescriptions;
    }

    public void setNewMedication(String newMedication) {
        this.newMedication = newMedication;
    }

    public String getNewMedication() {
        return newMedication;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public String getReqResult() {
        return reqResult;
    }

   
   
     
     
}
