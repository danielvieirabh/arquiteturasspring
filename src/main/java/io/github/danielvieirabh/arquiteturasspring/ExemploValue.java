package io.github.danielvieirabh.arquiteturasspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    @Value("${app.config.variavel}") //injeta o valor X , que fica la no properties
    private String variavel;

    public void imprimirVariavel() {
        System.out.println(variavel);
    }

}
