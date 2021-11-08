package br.com.mac.javacore.arraysList.test;

import br.com.mac.javacore.arrays.classes.Animal;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<Animal>(); //generics
        Animal gato =  new Animal("aninha");
        Animal cachorro =  new Animal("val");
        Animal ornitorrinco =  new Animal("perry");
        lista.add(gato);
        lista.add(cachorro);
        boolean animal = lista.contains(ornitorrinco);
        System.out.println("tem ornitorrinco? " + animal);

        for (Animal nome: lista) {
            System.out.println(nome);
        }
    }
}
