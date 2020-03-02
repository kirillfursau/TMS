package model;

public class Message {
    private String userName;
    private String userMessage;
    private String dateTime;

    public Message(String userName, String userMessage, String dateTime) {
        this.userName = userName;
        this.userMessage = userMessage;
        this.dateTime = dateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
