package com.eightbits.payment.eft.web.resources;

import com.eightbits.eco.retail.infrastructure.generated.v1.api.PaymentsApi;
import com.eightbits.eco.retail.infrastructure.generated.v1.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/payments")
@RestController
public class PaymentsResource implements PaymentsApi {


    /**
     * GET /payments : Retrieve all payments for given card number
     * Retrieve all payments for given card number
     *
     * @param cardNumber      Card number (required)
     * @param transactionDate Transaction date (optional)
     * @return A list of payments (status code 200)
     * or Invalid card number (status code 400)
     * or Payments not found (status code 404)
     */
    @Override
    public ResponseEntity<List<Payment>> retrievePayments(String cardNumber, LocalDate transactionDate) {
        return PaymentsApi.super.retrievePayments(cardNumber, transactionDate);
    }
}
