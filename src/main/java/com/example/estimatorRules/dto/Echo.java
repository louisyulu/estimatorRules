package com.example.estimatorRules.dto;

public class Echo {
    String echoTime;
    String echMessage;

    public Echo(String echoTime, String echMessage) {
        this.echoTime = echoTime;
        this.echMessage = echMessage;
    }

    public String getEchoTime() {
        return echoTime;
    }

    public void setEchoTime(String echoTime) {
        this.echoTime = echoTime;
    }

    public String getEchMessage() {
        return echMessage;
    }

    public void setEchMessage(String echMessage) {
        this.echMessage = echMessage;
    }
}
