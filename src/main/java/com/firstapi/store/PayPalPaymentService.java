package com.firstapi.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Logic to process payment using PayPal
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
    
}
