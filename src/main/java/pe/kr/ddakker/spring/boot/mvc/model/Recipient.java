package pe.kr.ddakker.spring.boot.mvc.model;

public class Recipient {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
