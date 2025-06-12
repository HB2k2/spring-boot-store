package com.firstapi.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Logic to process payment using Stripe
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
    
}
