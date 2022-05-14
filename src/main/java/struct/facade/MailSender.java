package struct.facade;

public interface MailSender {

    void setMailSetting(MailSetting mailSetting);

    void sendMailMessage(MailMassege mailMassege);
}
