package br.com.mac.Introducao.DesvioCondicional;

public class Atividade1 {
    public static void main(String[] args) {
        int dia = 5;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("meio da semana");
                break;
        }
    }
}
