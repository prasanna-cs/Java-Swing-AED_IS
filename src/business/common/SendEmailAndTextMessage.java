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


import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmailAndTextMessage {
 
    private static final String SMTP_HOST_NAME = "smtp.gmail.com"; 
    private static final String SMTP_PORT_NUMBER = "587"; 
     private static StringBuilder emailMsgTxt ;
        
        private static String emailSubjectTxt = "WELCOME TO SENIOR SAFE!";
        private static String emailFromAddress = "seniorsafe24x7@gmail.com";
    

    public static String generatePassword(String fullname)
    {
        try
        {
      Random random = new Random();
      String passwordExtension = String.valueOf(random.nextInt(50000));
      //String value1 = String.valueOf(random.nextInt(100));
        StringBuilder strinBuilder = new StringBuilder();
       // sb.append(value1);
        strinBuilder.append(fullname);
        strinBuilder.append(passwordExtension);
        System.out.println("Password:"+strinBuilder.toString());
         return strinBuilder.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
    
    public static String generateUserName(String fullname)
    {
        try
        {
      Random random = new Random();
      String userNameExtension = String.valueOf(random.nextInt(1000));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(userNameExtension);
        stringBuilder.append(fullname);
        System.out.println("Username:"+stringBuilder.toString());
         return stringBuilder.toString();
    }
     catch(Exception e)
        {
            
        }
        return null;
    }
      

 // Send Email                   
    
    public static boolean sendEmail(String message, String email, String uname, String pwd)
    {
      boolean checkIfMailIsSent = true;
 
    try {
     Properties properties = new Properties();
        properties.put("mail.smtp.host", SMTP_HOST_NAME);                                                        
        properties.put("mail.smtp.auth", "true");  
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.port", "587");
        
        Authenticator authenticator = new EmailAuthenticator();
        Session session = Session.getDefaultInstance(properties,authenticator);
        Message msg = new MimeMessage(session);
         InternetAddress senderAdress ;
        InternetAddress reciverAddress;
        try
           {
         senderAdress = new InternetAddress(emailFromAddress);
         reciverAddress = new InternetAddress(email);
         }
        
        catch (AddressException ae) {
            ae.printStackTrace();
         checkIfMailIsSent= false;
         return checkIfMailIsSent;
         }
        
        
        msg.setFrom(senderAdress);
        msg.setRecipient(RecipientType.TO, reciverAddress);
        msg.setSubject(emailSubjectTxt);
        msg.setText(message);
 
       Transport.send(msg);
       System.out.println("Email Sent !");
        } 
         catch (MessagingException mex) {
            checkIfMailIsSent=false;
            return checkIfMailIsSent;
       }
       
       catch (Exception e) {
            checkIfMailIsSent=false;
       }

         return checkIfMailIsSent;
     
    }
    
   
}

