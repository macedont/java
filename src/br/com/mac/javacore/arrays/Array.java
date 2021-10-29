package br.com.mac.javacore.arrays;

public class Array {

    public static void main(String[] args) {
        int[] idades = new int[5];

        for(int x = 0; x < idades.length; x++){
            idades[x] = x * 5;
        }

        for (int aux: idades) {
            System.out.println(aux);
        }


    }
}
