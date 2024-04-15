package com.eightbits.payment.eft.validator;

import com.eightbits.payment.eft.payment.PaymentRequest;

import java.util.ArrayList;
import java.util.List;

public class PaymentValidator {

    private final PaymentRequest paymentRequest;
    private final List<Validator> validators = new ArrayList<>();

    public PaymentValidator(PaymentRequest paymentRequest) {
        this.paymentRequest = paymentRequest;
    }

    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    public boolean validate() {
        for (Validator validator : validators) {
            if (!validator.validate(paymentRequest)) {
                return false;
            }
        }
        return true;
    }
}
