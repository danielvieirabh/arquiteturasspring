package io.github.danielvieirabh.arquiteturasspring.montadora.api;

import io.github.danielvieirabh.arquiteturasspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros") //Passar no json a montadora e tipo que vem de chave
public class TesteFabricaController {
    @Autowired //Pegar a instancia do motor onde ela ja esta instanciada no projeto
    @Qualifier("motorTurbo") //Colocar isso quando tiver mais de um Bean
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        Carro carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }

}
