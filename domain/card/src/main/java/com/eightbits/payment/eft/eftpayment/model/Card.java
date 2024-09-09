package com.eightbits.payment.eft.eftpayment.model;

public record Card(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
}
