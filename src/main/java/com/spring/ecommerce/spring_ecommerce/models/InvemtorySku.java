package com.spring.ecommerce.spring_ecommerce.models;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class InvemtorySku {
    @DBRef
    private OrderItem sku;
    private InventoryPrice price;
    private double quantity;
    private Options options; 
    private String[] features;
    private String[] colors;
    private String ruling;
    private String image;
    public OrderItem getSku() {
        return sku;
    }
    public void setSku(OrderItem sku) {
        this.sku = sku;
    }
    public InventoryPrice getPrice() {
        return price;
    }
    public void setPrice(InventoryPrice price) {
        this.price = price;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public Options getOptions() {
        return options;
    }
    public void setOptions(Options options) {
        this.options = options;
    }
    public String[] getFeatures() {
        return features;
    }
    public void setFeatures(String[] features) {
        this.features = features;
    }
    public String[] getColors() {
        return colors;
    }
    public void setColors(String[] colors) {
        this.colors = colors;
    }
    public String getRuling() {
        return ruling;
    }
    public void setRuling(String ruling) {
        this.ruling = ruling;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    
}
