package br.com.alura.ecommerce;

import lombok.Getter;

import java.util.UUID;

@Getter
public class CorrelationId {

    private final String id;

    CorrelationId() {
        id = UUID.randomUUID().toString();
    }
}
