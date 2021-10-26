package br.com.mac.javacore.abstrato.classes;

/**
 * extende a classe abstrata animal
 *
 * @author Macedo
 * @version 1.0
 *
 */
public class Gato extends Animal {

    public Gato(String nome, String tipo){
        super(nome, tipo);
    }

    public void imprimirAnimal() {
        System.out.println(super.nome);
        System.out.println(super.tipAnimal);
    }
}
