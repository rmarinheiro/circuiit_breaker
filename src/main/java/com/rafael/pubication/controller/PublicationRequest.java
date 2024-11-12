package com.rafael.pubication.controller;

import jakarta.validation.constraints.NotBlank;

public class PublicationRequest {
    @NotBlank
    private String title;
    private String imageUrl;
    @NotBlank
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public PublicationRequest(String title, String imageUrl, String text) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PublicationRequest() {
    }
}
