package edu.miu.cs590.bankpaymentservice.controller;

import edu.miu.cs590.bankpaymentservice.model.PaymentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BankPaymentController {
    @PostMapping("/process-payment")
    public ResponseEntity<String> makePayment(@RequestBody PaymentRequest paymentRequest){
        return new ResponseEntity<>("Payment successful for bankId " + paymentRequest.getBankId() + " with UID " + UUID.randomUUID().toString(), HttpStatus.OK);
    }
}
