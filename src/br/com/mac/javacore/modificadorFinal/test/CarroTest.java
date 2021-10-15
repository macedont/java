package br.com.mac.javacore.modificadorFinal.test;

import br.com.mac.javacore.modificadorFinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carr = new Carro();
        carr.setNome("Jetta");
        carr.setMarca("Volks");
        System.out.println(carr.toString());
    }
}
