package br.com.mac.javacore.metodos.test;

import br.com.mac.javacore.metodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.soma(5, 10);
        calc.subtrai();
        double rs = calc.divisao(5.0, 2.0);
        System.out.println(rs);
    }
}
