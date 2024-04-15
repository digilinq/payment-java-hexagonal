package com.eightbits.payment.eft.service;

import com.eightbits.payment.eft.payment.PaymentRequest;

import com.eightbits.payment.eft.port.api.TransactionService;
import com.eightbits.payment.eft.validator.PaymentValidator;

public class TransactionServiceImpl implements TransactionService {

    private final PaymentValidator paymentValidator;

    public TransactionServiceImpl(PaymentValidator paymentValidator) {
        this.paymentValidator = paymentValidator;
    }

    @Override
    public void processRequest(PaymentRequest paymentRequest) {
        paymentValidator.validate();
    }
}
