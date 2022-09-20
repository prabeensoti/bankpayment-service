package edu.miu.cs590.bankpaymentservice.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private String userId;
    private String bankId;
    private Double balance;
}
