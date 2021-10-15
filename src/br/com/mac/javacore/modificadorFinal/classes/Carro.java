package br.com.mac.javacore.modificadorFinal.classes;

public class Carro {
    private static final double VELOCIDADE_FINAL = 220;
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeLimit=" + VELOCIDADE_FINAL +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVELOCIDADE_FINAL(){
        return VELOCIDADE_FINAL;
    }
}
