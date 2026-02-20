package io.github.danielvieirabh.arquiteturasspring.montadora.configurantion;

import io.github.danielvieirabh.arquiteturasspring.montadora.Motor;
import io.github.danielvieirabh.arquiteturasspring.montadora.TipoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Configuracoes de BEAN
public class MontadoraConfiguration {

    //Precisa sempre do Bean e Configuration para um classe de configuracao

    @Bean //Bean e um metodo que retorna um metodo construido
    public Motor motor() {
        Motor motor = new Motor("XPTO-0", 120, 4, 2.5, TipoMotor.ASPIRADO);
        return motor;
    }


}
