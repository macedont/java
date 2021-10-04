package br.com.mac.javacore.metodos.classes;

public class Calculadora {

    public void soma(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtrai(){
        System.out.println("resultado: " + (5 - 3));
    }

    //indica o tipo de retorno a segunda palavra reservada
    public double divisao(double num, double num1){
        return num / num1;
    }
}
