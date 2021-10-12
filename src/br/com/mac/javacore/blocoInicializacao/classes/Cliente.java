package br.com.mac.javacore.blocoInicializacao.classes;

public class Cliente {
    // 0 - O bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaco na memoria para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicializacao é executado
    // 4 - O construtor é executado

    private static int[] parcelas;
    static { //só roda apenas uma vez independete da quantidade de vezes que a classe for instanciada.
        parcelas = new int[100];
        for(int x = 1; x <= 100; x++){
            parcelas[x-1] = x;
        }
    }

    public Cliente(){}

    public static int[] getParcelas() {
        return parcelas;
    }

}
