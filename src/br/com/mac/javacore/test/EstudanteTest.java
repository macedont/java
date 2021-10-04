package br.com.mac.javacore.test;

import br.com.mac.javacore.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "João Cabral";
        joao.idade = 22;
        joao.matricula = "661";

        System.out.println(joao.nome);
    }
}
