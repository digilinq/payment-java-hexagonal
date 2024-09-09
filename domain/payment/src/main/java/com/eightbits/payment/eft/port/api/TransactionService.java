package com.eightbits.payment.eft.port.api;

import com.eightbits.payment.eft.payment.PaymentRequest;

public interface TransactionService {
    void processRequest(PaymentRequest paymentRequest);
}
