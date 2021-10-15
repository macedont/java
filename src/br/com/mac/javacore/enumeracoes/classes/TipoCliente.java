package br.com.mac.javacore.enumeracoes.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Júridica");

    private int tipo;
    private String nome;
    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo(){
        return tipo;
    }

    public String getNome(){
        return nome;
    }

}
