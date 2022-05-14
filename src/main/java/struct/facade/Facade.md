파사드 패턴
==

1. 클라이언트가 사용해야할 복잡한 하위 시스템(주로 외부 라이브라리 같은 것들)을 인터페이스 하나로 최소화
2. 클라이언트가 하위 시스템에 대한 의존성을 낮추기 위한 작업


<br>
자바 메일 보내는 부분

```java
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
```


```java
public class MailMassege {
    private String subject;
    private String to;
    private String from;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
```
<br>


```java
public class MailSetting {

    private String smtpServer;

    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }
}
```

<br>

사용하는 클라이언트는 Java 메일 라이브러리를 전혀 참조하지 않고 있다

```java
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

```