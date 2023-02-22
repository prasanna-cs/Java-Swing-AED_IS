/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.person.Volunteer;

/**
 *
 * @author prasanna
 */


public class TransportRequest extends WorkRequest{
    
    private String transRequestId;
    private static int counter = 000;
    private String needTransport;
    private String reqResult;
    
    
     public TransportRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(counter);
        transRequestId = sb.toString();
        counter++;
    }
     
    public void setNeedTransport(String needTransport) {
        this.needTransport = needTransport;
    }

    public String getNeedTransport() {
        return needTransport;
    }

    @Override
    public String toString() {
        Volunteer volunteer = (Volunteer)this.getSender().getPerson();
        String address = volunteer.getAddress1().concat(volunteer.getAddress2().concat(volunteer.getTown()));
        return address;
                
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }
     
     
}
