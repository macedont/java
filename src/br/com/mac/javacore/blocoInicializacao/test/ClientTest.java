package br.com.mac.javacore.blocoInicializacao.test;

import br.com.mac.javacore.blocoInicializacao.classes.Cliente;

public class ClientTest {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        System.out.println("Exibindo parcelas possíveis.");
        for(int x: cli.getParcelas()){
            System.out.print(x + " ");
        }
    }
}
