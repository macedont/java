package br.com.mac.javacore.modificadorStatic.classes;

public class Carro {

    private String marca;
    private double velocidadeMax;
    public static double velocidadeLimit = 270; //static faz com oq esse atributo faça parte da classe independente dos objetos.

    public Carro(String marca, double velocidadeMax){
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
    }

    public Carro(){}

    public void imprimi(){
        System.out.println("---------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade máxima: " + this.velocidadeMax);
        System.out.println("Velocidade Limite: " + velocidadeLimit);
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
