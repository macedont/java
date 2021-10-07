package br.com.mac.javacore.sobrecarga.test;

import br.com.mac.javacore.sobrecarga.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Macedo");
        funcionario.init("Macbook", "000.222.444-66", 2000, "1.123.456");

        funcionario.imprimir();
    }
}
