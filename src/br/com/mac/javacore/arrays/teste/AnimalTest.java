package br.com.mac.javacore.arrays.teste;

import br.com.mac.javacore.arrays.classes.Animal;
import br.com.mac.javacore.arrays.classes.ArrayAnimal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal gato = new Animal("aninha");
        Animal cachorro = new Animal("val");
        ArrayAnimal array = new ArrayAnimal();
        array.adiciona(gato);
        array.adiciona(cachorro);
        array.imprimirArray();
    }
}
