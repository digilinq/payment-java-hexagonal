package com.eightbits.payment.eft.validator;

import com.eightbits.payment.eft.payment.PaymentRequest;

public interface Validator {
    boolean validate(PaymentRequest payment);
}
