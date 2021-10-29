package br.com.mac.javacore.arrays.classes;

public class ArrayAnimal {

    private Animal[] animals;
    private int posicao;
    
    public ArrayAnimal(){
        this.animals = new Animal[2];
        this.posicao = 0;
    }

    public void adiciona(Animal nome){
        this.animals[this.posicao] = nome;
        this.posicao++;
    }

    public void imprimirArray(){
        for(int x = 0; x < this.animals.length; x++){
            System.out.println("nome: " + this.animals[x]);
        }
    }
}
