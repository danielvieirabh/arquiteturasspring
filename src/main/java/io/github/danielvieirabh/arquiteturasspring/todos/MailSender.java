package io.github.danielvieirabh.arquiteturasspring.todos;

import org.springframework.stereotype.Component;

//Enviar Email
@Component
public class MailSender {

    public void enviar(String mensagem) {
        System.out.println("Enviado email: " + mensagem);
    }
}


