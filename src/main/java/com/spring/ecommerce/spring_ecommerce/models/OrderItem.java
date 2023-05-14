package com.spring.ecommerce.spring_ecommerce.models;

public class OrderItem {
    private String sku;
    private String quantity;
    private Double price;
    private Double discount;
    private Double preTaxTotal;
    private Double tax;
    private Double total;
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Double getPreTaxTotal() {
        return preTaxTotal;
    }
    public void setPreTaxTotal(Double preTaxTotal) {
        this.preTaxTotal = preTaxTotal;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

    
    
}
