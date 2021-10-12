package br.com.mac.javacore.metodos.test;

import br.com.mac.Introducao.Arrays.Arrays;
import br.com.mac.javacore.metodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        int[] numeros = new int[] {1,2,3,4,5,6,7,8,9};

        Calculadora.soma(5, 10);
        Calculadora.subtrai();
        Calculadora.multiplicacao(1, 1);
        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(10, 20, 30, 40, 50);
    }
}
