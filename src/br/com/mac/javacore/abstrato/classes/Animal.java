package br.com.mac.javacore.abstrato.classes;

public abstract class Animal {
    protected String nome;
    protected String tipAnimal;

    public Animal(String nome, String tipAnimal){
        this.nome = nome;
        this.tipAnimal = tipAnimal;
    }
}
