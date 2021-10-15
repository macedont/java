package br.com.mac.javacore.modificadorStatic.test;

import br.com.mac.javacore.modificadorStatic.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 280);
        Carro carro1 = new Carro("Mercedes", 310);
        Carro carro2 = new Carro("Audi", 220);

        Carro.velocidadeLimit = 220;
        carro.imprimi();
        carro1.imprimi();
        carro2.imprimi();
    }
}
