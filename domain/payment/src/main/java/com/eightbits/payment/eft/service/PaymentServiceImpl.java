package com.eightbits.payment.eft.service;

import com.eightbits.payment.eft.port.api.PaymentService;
import com.eightbits.payment.eft.validator.PaymentValidator;

public class PaymentServiceImpl implements PaymentService {

    private final PaymentValidator paymentValidator;

    public PaymentServiceImpl(PaymentValidator paymentValidator) {
        this.paymentValidator = paymentValidator;
    }

    @Override
    public void processRequest(String cardNumber, String expiryDate, String cvv, double amount, String requestType) {
        paymentValidator.validate();
    }
}
