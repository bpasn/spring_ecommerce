package com.spring.ecommerce.spring_ecommerce.models;

public class Cart {
    private String brand;
    private String panLastFour;
    private double expirationMonth;
    private double expirationYear;
    private boolean cvvVerified;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getPanLastFour() {
        return panLastFour;
    }
    public void setPanLastFour(String panLastFour) {
        this.panLastFour = panLastFour;
    }
    public double getExpirationMonth() {
        return expirationMonth;
    }
    public void setExpirationMonth(double expirationMonth) {
        this.expirationMonth = expirationMonth;
    }
    public double getExpirationYear() {
        return expirationYear;
    }
    public void setExpirationYear(double expirationYear) {
        this.expirationYear = expirationYear;
    }
    public boolean isCvvVerified() {
        return cvvVerified;
    }
    public void setCvvVerified(boolean cvvVerified) {
        this.cvvVerified = cvvVerified;
    }

    
}
