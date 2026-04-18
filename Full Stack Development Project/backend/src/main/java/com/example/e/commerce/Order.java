package com.example.e.commerce;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")   // ✅ MUST BE THIS
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    private String status;

    public Order() {}

    public Long getId() { return id; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}