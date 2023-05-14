package com.spring.ecommerce.spring_ecommerce.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
public class Orders {
    @Id
    private String id;

    private String cutomerId;

    private String paymentId;

    private String paymentStatus;
    private String status;
    private String currency;
    private String[] items;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCutomerId() {
        return cutomerId;
    }
    public void setCutomerId(String cutomerId) {
        this.cutomerId = cutomerId;
    }
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String[] getItems() {
        return items;
    }
    public void setItems(String[] items) {
        this.items = items;
    }

    
}
