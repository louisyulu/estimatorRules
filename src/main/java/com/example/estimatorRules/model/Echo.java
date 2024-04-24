package com.example.estimatorRules.model;

public class Echo {
    String echoTime;
    String echoMessage;

    public Echo(String echoTime, String echoMessage) {
        this.echoTime = echoTime;
        this.echoMessage = echoMessage;
    }

    public String getEchoTime() {
        return echoTime;
    }

    public void setEchoTime(String echoTime) {
        this.echoTime = echoTime;
    }

    public String getEchoMessage() {
        return echoMessage;
    }

    public void setEchoMessage(String echoMessage) {
        this.echoMessage = echoMessage;
    }
}
