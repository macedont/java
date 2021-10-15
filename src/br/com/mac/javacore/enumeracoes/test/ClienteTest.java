package br.com.mac.javacore.enumeracoes.test;

import br.com.mac.javacore.enumeracoes.classes.Cliente;
import br.com.mac.javacore.enumeracoes.classes.TipoCliente;


public class ClienteTest {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        System.out.println(cli);
    }
}
