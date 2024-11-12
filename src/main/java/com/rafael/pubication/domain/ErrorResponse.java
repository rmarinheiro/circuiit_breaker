package com.rafael.pubication.domain;

public class ErrorResponse {

    private  Long timeStamp;
    private Integer status;
    private String message;
    private String path;

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ErrorResponse(Long timeStamp, Integer status, String message, String path) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.message = message;
        this.path = path;
    }

    public ErrorResponse() {
    }
}
