package helper;

import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Helper {
	public void sendMailHelper(String name,String email,String message) throws Exception {
		String clientMessageTemplate = "\n <b> Hey "+name 
				+ "<br> Thank you for your interest in Gozo Virtual Experiences, we have recieved your request and our team will get back to you shortly" 
				+ " <br> If you have any urgent requirement or want to talk to us, Feel free to call us at our mobile numbers.";
		String gozoMessageTemplate = "\n <b> You have a vistor " 
				+ "<br><b> Name: </b>"+name
				+ "<br><b> Email: </b>"+email
				+ "<br><b> message: </b>"+message;
		Helper.sendMailToClient(email, name, "Congratz! You're one step closer to your own virtual world", clientMessageTemplate);
		Helper.sendMailToGozo("info@gozoexperiences.com,n.yokeshwar.kumar@gmail.com,sales@gozoexperiences.com", "Gozo", "You have a visitor", gozoMessageTemplate);
	}
	public static void sendMailToClient(String toAddress , String toName, String pSubject , String body) throws Exception
	{
    	Properties 		props 		= 	null;
    	Session 		session 	=	null;
    	Message 		msg 		=	null;
    	String[] 		To 			=	null;
    	String[]  		Cc 			=	null;	
    	String[] 		Bcc 		=	null;
		try
		{

			props 		= 	new Properties();
			session 	= 	Session.getDefaultInstance(props, null);
			msg 		= 	new MimeMessage(session);
			To 			= 	toAddress.split(",");
			javax.mail.internet.InternetAddress[] addressCc = null;

			msg.setFrom(new InternetAddress("n.yokeshwar.kumar@gmail.com", "Gozo Virtual Experiences"));
			javax.mail.internet.InternetAddress[] addressTo = new javax.mail.internet.InternetAddress[To.length];
			
			for (int i = 0; i < To.length; i++)
			{
				addressTo[i] = new javax.mail.internet.InternetAddress(To[i],toName);
			}
			

			msg.setRecipients(javax.mail.Message.RecipientType.TO, addressTo);
			
			if (addressCc != null)
			{
				msg.setRecipients(javax.mail.Message.RecipientType.CC, addressCc);
			}
			msg.setSubject(pSubject);
			msg.setContent(body, "text/html");
			Transport.send(msg);
			
		}
		catch (Exception e) 
		{
		}
	}
	public static void sendMailToGozo(String toAddress , String toName, String pSubject , String body) throws Exception
	{
    	Properties 		props 		= 	null;
    	Session 		session 	=	null;
    	Message 		msg 		=	null;
    	String[] 		To 			=	null;
    	String[]  		Cc 			=	null;	
    	String[] 		Bcc 		=	null;
		try
		{

			props 		= 	new Properties();
			session 	= 	Session.getDefaultInstance(props, null);
			msg 		= 	new MimeMessage(session);
			To 			= 	toAddress.split(",");
			javax.mail.internet.InternetAddress[] addressCc = null;

			msg.setFrom(new InternetAddress("n.yokeshwar.kumar@gmail.com", "Gozo Virtual Experiences"));
			javax.mail.internet.InternetAddress[] addressTo = new javax.mail.internet.InternetAddress[To.length];
			
			for (int i = 0; i < To.length; i++)
			{
				addressTo[i] = new javax.mail.internet.InternetAddress(To[i],toName);
			}
			

			msg.setRecipients(javax.mail.Message.RecipientType.TO, addressTo);
			
			if (addressCc != null)
			{
				msg.setRecipients(javax.mail.Message.RecipientType.CC, addressCc);
			}
			msg.setSubject(pSubject);
			msg.setContent(body, "text/html");
			Transport.send(msg);
			
		}
		catch (Exception e) 
		{
		}
	}
}
