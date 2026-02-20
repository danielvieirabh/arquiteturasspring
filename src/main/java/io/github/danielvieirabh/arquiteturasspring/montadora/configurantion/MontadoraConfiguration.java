package io.github.danielvieirabh.arquiteturasspring.montadora.configurantion;

import io.github.danielvieirabh.arquiteturasspring.montadora.Motor;
import io.github.danielvieirabh.arquiteturasspring.montadora.TipoMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration //Configuracoes de BEAN
public class MontadoraConfiguration {

    //Precisa sempre do Bean e Configuration para um classe de configuracao

    @Bean(name = "motorAspirado") //Bean e um metodo que retorna um metodo construido
    @Primary //Bean Pricipal , caso ele nao encontrar algum Bean
    public Motor motorAspirado() {
        Motor motor = new Motor("XPTO-0", 120, 4, 2.5, TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        Motor motor = new Motor("TH-40", 110, 3, 2.0, TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        Motor motor = new Motor("XPTO-01", 180, 4, 1.5, TipoMotor.TURBO);
        return motor;
    }

}
