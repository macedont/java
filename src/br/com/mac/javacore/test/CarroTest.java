package br.com.mac.javacore.test;

import br.com.mac.javacore.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Volkswagem";
        carro.modelo = "Jetta";
        carro.placa = "XXX-0000";
        carro.velocidadeMax = 200.0F;

        System.out.println(carro.velocidadeMax);
    }
}
