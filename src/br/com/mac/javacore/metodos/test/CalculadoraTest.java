package br.com.mac.javacore.metodos.test;

import br.com.mac.Introducao.Arrays.Arrays;
import br.com.mac.javacore.metodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numeros = new int[] {1,2,3,4,5,6,7,8,9};

        calc.soma(5, 10);
        calc.subtrai();
        double rs = calc.divisao(5.0, 2.0);
        System.out.println(rs);
        calc.multiplicacao(1, 1);
        calc.somaArray(numeros);
        calc.somaVarArgs(10, 20, 30, 40, 50);
    }
}
