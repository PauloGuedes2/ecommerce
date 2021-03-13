package br.com.alura.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Order {
    private final String userId, orderId;
    private final BigDecimal amount;
    private final String email;
}
