package br.com.mac.javacore.arrays.classes;

public class Animal {
    public String  nome;

    public Animal(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
