package com.dhatriinfo.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.dhatriinfo.bean.EmployeeBean;

public class SendMail 
{
	private static String host="smtp.gmail.com";
	private static String port="564";
	private static final String userName="nikhitha.dhatriinfo@gmail.com";
	private static final String password="9032126310";
	public static void sendEmail(EmployeeBean employeeBean) throws AddressException,
            MessagingException {
 
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        MimeMessage msg = new MimeMessage(session);

        String message_send="Employee Id = "+employeeBean.getEmployeeId() + "\n"; 
        		msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(employeeBean.getEmployeeEmail()) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject("Hi " +employeeBean.getEmployeeName());
        msg.setSentDate(new Date());
        msg.setText(message_send);
 
        // sends the e-mail
        Transport.send(msg);
 
    }


}
