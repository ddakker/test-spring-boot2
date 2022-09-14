package pe.kr.ddakker.spring.boot.mvc.model;

public class Sender {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

