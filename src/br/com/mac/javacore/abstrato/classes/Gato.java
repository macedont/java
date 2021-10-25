package br.com.mac.javacore.abstrato.classes;

public class Gato extends Animal {

    public Gato(String nome, String tipo){
        super(nome, tipo);
    }

    public void imprimirAnimal() {
        System.out.println(super.nome);
        System.out.println(super.tipAnimal);
    }
}
