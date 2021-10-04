package br.com.mac.javacore.test;

import br.com.mac.javacore.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Macedo";
        prof.matricula = "21c";
        prof.rg = "3.285.441";
        prof.cpf = "000.624.147.21";

        System.out.println(prof.nome);
    }
}
