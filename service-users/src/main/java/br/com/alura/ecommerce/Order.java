package br.com.alura.ecommerce;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Order {
    private final String userId, orderId;
    private final BigDecimal amount;

    public String getEmail() {
        return "email";
    }
}
