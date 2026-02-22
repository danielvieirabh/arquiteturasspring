package io.github.danielvieirabh.arquiteturasspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config") //Pega do properties/yml
public class AppProperties {
    private String variavel;
    private Integer valor1;


    public AppProperties() {

    }
    public AppProperties(String variavel , Integer valor1) {
        this.variavel = variavel;
        this.valor1 = valor1;
    }
    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }
}
