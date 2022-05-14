package struct.facade;


import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavaMailSender implements MailSender {

    private MailSetting mailSetting;


    public void setMailSetting(MailSetting mailSetting) {
        this.mailSetting = mailSetting;
    }


    public void sendMailMessage(MailMassege mailMassege) {
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host",mailSetting.getSmtpServer());

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(mailMassege.getFrom());
            mimeMessage.setSubject(mailMassege.getSubject());

            Transport.send(mimeMessage);
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
