package com.eightbits.payment.eft.port.api;

public interface PinValidator /*extends PaymentValidator*/ {
    boolean validate(String pinBlock);
}
