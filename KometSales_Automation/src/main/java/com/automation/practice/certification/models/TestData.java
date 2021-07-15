package com.automation.practice.certification.models;

public class TestData {

    private String emailAddress;
    private String password;
    private String size;
    private String colour;
    private String discount;

    public TestData(String emailAddress, String password, String size, String colour, String discount) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.size = size;
        this.colour = colour;
        this.discount = discount;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getDiscount() {
        return discount;
    }
}
