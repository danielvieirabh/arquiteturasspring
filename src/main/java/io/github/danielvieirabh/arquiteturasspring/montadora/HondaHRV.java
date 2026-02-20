package io.github.danielvieirabh.arquiteturasspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV"); //setando as informacoes no construtor
        setColor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }

}
