package br.com.alura.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {

    private final String uuid;

    public String getReportPath(){
        return "target/" + uuid + "-report.txt";
    }
}
