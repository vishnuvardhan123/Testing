package emailTesting;
import java.util.Properties;

import javax.mail.*;

import javax.mail.internet.*;

public class EmailSender {

    public static void main(String[] args) {

        // Email configuration

        String host = "smtp.gmail.com";

        final String username = "dondetivvardhan@gmail.com";

        final String password = "Vardhan@123";

        // Recipient email address

        String to = "vishnuvardhan.dondeti@gmail.com";

        // Email properties

        Properties properties = new Properties();

        properties.put("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.port", "465");

        // Session creation

        Session session = Session.getInstance(properties, new Authenticator() {

            @Override

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(username, password);

            }

        });

        try {

            // Create a default MimeMessage object

            Message message = new MimeMessage(session);
            
           
            // Set From: header field

            message.setFrom(new InternetAddress(username));

            // Set To: header field

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set Subject: header field

            message.setSubject("Test Automation Report");

            // Set the actual message

            message.setText("Hello, this is your Selenium test automation report!");

            // Send message

            Transport.send(message);

            System.out.println("Email sent successfully!");


        } catch (MessagingException e) {

            e.printStackTrace();

        }

    }

}