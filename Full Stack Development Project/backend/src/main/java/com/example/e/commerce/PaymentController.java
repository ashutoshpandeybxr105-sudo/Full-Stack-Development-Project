package com.example.e.commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private OrderRepository orderRepo;

    // ✅ POST - Payment
    @PostMapping
    public String pay(@RequestBody PaymentRequest request) {

        Order order = new Order();
        order.setAmount(request.getAmount());
        order.setStatus("PAID");

        orderRepo.save(order);

        return "Payment Done & Order Saved!";
    }

    // ✅ GET - Fetch all orders
    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderRepo.findAll();
    }
}