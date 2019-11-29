package com.devahmed.firebasesimplechat;

import java.util.Date;

public class Message {
    private String message;
    private String sender;
    private long date;


    public Message(String message, String sender) {
        this.message = message;
        this.sender = sender;
        this.date = new Date().getTime();
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
