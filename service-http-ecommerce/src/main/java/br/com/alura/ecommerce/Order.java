package br.com.alura.ecommerce;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Order {
    private final String orderId;
    private final BigDecimal amount;
    private final String email;
}
