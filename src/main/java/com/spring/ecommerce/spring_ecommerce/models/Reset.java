package com.spring.ecommerce.spring_ecommerce.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Reset {
    @Id
    private String id;
    private String customerId;
    private String token;
    private String status;
    private Date expiration;
    private Date requestTime;
    private String suctomers;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getExpiration() {
        return expiration;
    }
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
    public Date getRequestTime() {
        return requestTime;
    }
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }
    public String getSuctomers() {
        return suctomers;
    }
    public void setSuctomers(String suctomers) {
        this.suctomers = suctomers;
    }

    
    
}
