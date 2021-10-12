package br.com.mac.javacore.metodos.classes;

public class Calculadora {

    public static void soma(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void subtrai(){
        System.out.println("resultado: " + (5 - 3));
    }

    //indica o tipo de retorno a segunda palavra reservada
    public static double divisao(double num, double num1){
        return num / num1;
    }

    public static void multiplicacao(int num, int num1){
        if(num != 0 && num1 != 0){
            System.out.println(num * num1);
            return;
        }
        System.out.println("Informe um número maior que zero.");
    }

    public static void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarArgs(int ...numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
