package io.github.danielvieirabh.arquiteturasspring.montadora;

public class Motor {
    private String modelo;
    private Integer cavalo;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipo;

    public Motor() {

    }

    public Motor(String modelo, Integer cavalo, Integer cilindros, Double litragem, TipoMotor tipo) {
        this.modelo = modelo;
        this.cavalo = cavalo;
        this.cilindros = cilindros;
        this.litragem = litragem;
        this.tipo = tipo;
    }

    public Integer getCavalo() {
        return cavalo;
    }

    public void setCavalo(Integer cavalo) {
        this.cavalo = cavalo;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
