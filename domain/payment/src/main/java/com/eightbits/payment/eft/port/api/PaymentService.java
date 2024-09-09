package com.eightbits.payment.eft.port.api;

public interface PaymentService {

    void processRequest(String cardNumber, String expiryDate, String cvv, double amount, String requestType);

    /**
    void pay(String cardNumber, String expiryDate, String cvv, double amount);

    void refund(String cardNumber, String expiryDate, String cvv, double amount);

    void cancel(String cardNumber, String expiryDate, String cvv, double amount);

    void verify(String cardNumber, String expiryDate, String cvv, double amount);

    void withdraw(String cardNumber, String expiryDate, String cvv, double amount);

    void deposit(String cardNumber, String expiryDate, String cvv, double amount);

    void transfer(String cardNumber, String expiryDate, String cvv, double amount);

    void balance(String cardNumber, String expiryDate, String cvv, double amount);

    void statement(String cardNumber, String expiryDate, String cvv, double amount);

    void payBill(String cardNumber, String expiryDate, String cvv, double amount);

    void payLoan(String cardNumber, String expiryDate, String cvv, double amount);

    void payTax(String cardNumber, String expiryDate, String cvv, double amount);

    void payUtility(String cardNumber, String expiryDate, String cvv, double amount);

    void payInsurance(String cardNumber, String expiryDate, String cvv, double amount);

    void paySubscription(String cardNumber, String expiryDate, String cvv, double amount);

    void payDonation(String cardNumber, String expiryDate, String cvv, double amount);

    void payTransfer(String cardNumber, String expiryDate, String cvv, double amount);

    void paySalary(String cardNumber, String expiryDate, String cvv, double amount);

    void payPension(String cardNumber, String expiryDate, String cvv, double amount);

    void paySocialSecurity(String cardNumber, String expiryDate, String cvv, double amount);

    void payHealthInsurance(String cardNumber, String expiryDate, String cvv, double amount);

    void payEducation(String cardNumber, String expiryDate, String cvv, double amount);

    void payFood(String cardNumber, String expiryDate, String cvv, double amount);

    void payTransport(String cardNumber, String expiryDate, String cvv, double amount);

    void payRent(String cardNumber, String expiryDate, String cvv, double amount);

    void payUtilities(String cardNumber, String expiryDate, String cvv, double amount);

    void payInsurancePremium(String cardNumber, String expiryDate, String cvv, double amount);
    **/
}
