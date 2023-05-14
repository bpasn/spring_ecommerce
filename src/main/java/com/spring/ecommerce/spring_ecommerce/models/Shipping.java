package com.spring.ecommerce.spring_ecommerce.models;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Shipping {
    @DBRef
    private Address address;
    @DBRef
    private Address origin;

    private String carrier;
    private String tracking;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

}
