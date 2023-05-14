package com.spring.ecommerce.spring_ecommerce.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("shipping_address")
public class ShippingAddress {
    @Id
    private String id;
}
