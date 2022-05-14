package struct.facade;

public class Client {

    void main(){
        MailSetting setting = new MailSetting();
        setting.setSmtpServer("127.0.0.1");

        MailMassege massege = new MailMassege();
        massege.setTo("to");
        massege.setFrom("from");
        massege.setSubject("subject");


        MailSender mailSender = new JavaMailSender();
        mailSender.setMailSetting(setting);
        mailSender.sendMailMessage(massege);
    }
}
