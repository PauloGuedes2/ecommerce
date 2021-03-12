package br.com.alura.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@ToString
@Getter
public class Order {
    private final String userId, orderId;
    private final BigDecimal amount;
}
