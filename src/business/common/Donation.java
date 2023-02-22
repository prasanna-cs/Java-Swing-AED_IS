/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

/**
 *
 * @author riaka
 */

public class Donation {
    
    private String donationAmount;
    private String dateOfDonation;
    private String donorAccNumber;
    private String donorAccName;
    public static String NGOAccountNumber = "XXXXXXXX123";
    
    private static int count = 0;
    private int donationId;
    
    public Donation()
    {
     count++;
     donationId = count;
    }
    

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }

    public String getDateOfDonation() {
        return dateOfDonation;
    }

    public void setDateOfDonation(String dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }

    @Override
    public String toString() {
        return String.valueOf(donationId);
    }

    public String getDonorAccNumber() {
        return donorAccNumber;
    }

    public void setDonorAccNumber(String donorAccNumber) {
        this.donorAccNumber = donorAccNumber;
    }

    public String getDonorAccName() {
        return donorAccName;
    }

    public void setDonorAccName(String donorAccName) {
        this.donorAccName = donorAccName;
    }

    public String getToAccountNumber() {
        return NGOAccountNumber;
    }
    
    
    
    
}
