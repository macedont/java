package br.com.mac.javacore.arrays.classes;

public class Animal {
    public String  nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void getNome(){
        System.out.println(this.nome);
    }
}
