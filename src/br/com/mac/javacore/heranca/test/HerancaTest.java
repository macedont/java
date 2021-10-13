package br.com.mac.javacore.heranca.test;

import br.com.mac.javacore.heranca.classes.Endereco;
import br.com.mac.javacore.heranca.classes.Funcionario;
import br.com.mac.javacore.heranca.classes.Pessoa;

public class HerancaTest {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Macedo");
        Endereco e = new Endereco();
        e.setBairro("bairro flores");
        e.setRua("rua das margaridas");
        p.setCpf("213.124.547-55");
        p.setEndereco(e);
        p.imprimir();

        Funcionario f = new Funcionario("Augustinho");
        f.setSalario(2000);
        f.setCpf("661.224.668-66");
        f.setEndereco(e);
        System.out.println("--------------------------------------------------");
        f.imprimir();
    }
}
