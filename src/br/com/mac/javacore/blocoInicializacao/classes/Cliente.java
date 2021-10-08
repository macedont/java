package br.com.mac.javacore.blocoInicializacao.classes;

public class Cliente {

    private int[] parcelas;
    {
        parcelas = new int[100];
        for(int x = 1; x <= 100; x++){
            parcelas[x-1] = x;
        }
    }

    public Cliente(){}

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
