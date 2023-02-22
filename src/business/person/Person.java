/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import business.common.Donation;
import java.awt.Image;
import java.io.File;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author daniel
 */


public class Person {
    
    private String personsFirstName;
    private String fullName;
    private String lName;
    private Date dateOfBirth;
    private String address1;
    private String mobileNumber;
    private String personIdentificationNo;
    private boolean Volunteer;
    private boolean ServiceSeeker;
    private String emailId;
    private String occupation;
    private String address2;
    private String town;
    private String zipCode;
    private String gender;
    private static int count = 00001;
    private String country;
    private String state;
    private int age;
    private ArrayList<Donation> donationList;
    private File image;
    private Image uploadedImage;
    private ImageIcon imageIcon;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person()
    {
     StringBuffer sb = new StringBuffer();
        sb.append("PER");
        sb.append(count);
        personIdentificationNo = sb.toString();
        count++;   
        donationList = new ArrayList<>();
    }

    public String getPersonsFirstName() {
        return personsFirstName;
    }

    public void setPersonsFirstName(String personsFirstName) {
        this.personsFirstName = personsFirstName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Image getUploadedImage() {
        return uploadedImage;
    }

    public void setUploadedImage(Image uploadedImage) {
        this.uploadedImage = uploadedImage;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
    
    

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    
    public String getFullName() {
        return fullName;
    }

    public void setName() {
        this.fullName = this.personsFirstName+ " "+this.lName;
    }

    public String getPersonIdentificationNo() {
        return personIdentificationNo;
    }

   
    public boolean isVolunteer() {
        return Volunteer;
    }

    public void setVolunteer(boolean Volunteer) {
        this.Volunteer = Volunteer;
    }

    public boolean isServiceSeeker() {
        return ServiceSeeker;
    }

    public void setServiceSeeker(boolean ServiceSeeker) {
        this.ServiceSeeker = ServiceSeeker;
    }

   
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

 

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

   
    
    @Override
    public String toString() {
        return this.fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

       public Donation addDonation()
    {
        Donation donation = new Donation();
        donationList.add(donation);
        return donation;
    }
            
}
