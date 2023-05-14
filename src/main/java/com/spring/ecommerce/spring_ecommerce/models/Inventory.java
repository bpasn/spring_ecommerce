package com.spring.ecommerce.spring_ecommerce.models;

import org.springframework.data.annotation.Id;

public class Inventory {
    @Id
    private String id;
    private String item;
    private String[] fratures;
    private String[] categories;
    @Id
    private String[] skus;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String[] getFratures() {
        return fratures;
    }
    public void setFratures(String[] fratures) {
        this.fratures = fratures;
    }
    public String[] getCategories() {
        return categories;
    }
    public void setCategories(String[] categories) {
        this.categories = categories;
    }
    public String[] getSkus() {
        return skus;
    }
    public void setSkus(String[] skus) {
        this.skus = skus;
    }

    
}
