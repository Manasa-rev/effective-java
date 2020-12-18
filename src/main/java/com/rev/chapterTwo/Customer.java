package com.rev.chapterTwo;

public class Customer {
    private String name;

    // public constructor
    public Customer(String customerName) {
        this.name = customerName;
    }

    // static factory method
    public static Customer name(String customerName) {
        return new Customer(customerName);
    }

    public String getCustomerName() {
        return name;
    }
}
