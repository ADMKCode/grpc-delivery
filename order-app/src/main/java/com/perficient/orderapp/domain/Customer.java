package com.perficient.orderapp.domain;

import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
public class Customer {
        @NonNull
        private UUID id;
        @NonNull
        private String name;
        private String address;
        private Cart cart;

    public Customer (UUID id, String name) {
        this(id, name, "");
    }
    public Customer (UUID id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cart = new Cart();
    }
}
