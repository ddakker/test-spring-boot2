package pe.kr.ddakker.spring.boot.mvc.model;

import java.util.List;

public class EventSend {
    private String subject;
    private String contents;
    private Sender sender;
    private List<Recipient> recipients;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    @Override
    public String toString() {
        return "EventSend{" +
                "subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                ", sender=" + sender +
                ", recipients=" + recipients +
                '}';
    }
}
