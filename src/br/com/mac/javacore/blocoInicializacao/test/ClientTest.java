package br.com.mac.javacore.blocoInicializacao.test;

import br.com.mac.javacore.blocoInicializacao.classes.Cliente;

public class ClientTest {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();

        System.out.println("Exibindo parcelas possíveis.");
        System.out.println("Tamanho das Parcelas: " + Cliente.getParcelas().length);
    }
}
