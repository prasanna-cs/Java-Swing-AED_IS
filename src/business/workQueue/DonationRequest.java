/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.common.Donation;

/**
 *
 * @author daniel
 */




public class DonationRequest extends WorkRequest{
    
    private String nameOfDonor;
    private String donorId;
    private static int counter = 000;
    private Donation donationAmount;
   
    public DonationRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("DONATION");
        sb.append(counter);
        donorId = sb.toString();
        counter++;
    }

    public String getNameOfDonor() {
        return nameOfDonor;
    }

    public void setNameOfDonor(String nameOfDonor) {
        this.nameOfDonor = nameOfDonor;
    }

    public void setDonationAmount(Donation donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Donation getDonationAmount() {
        return donationAmount;
    }

    @Override
    public String toString() {
        return this.donorId;
    }
    
    
}
