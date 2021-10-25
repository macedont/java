package br.com.mac.javacore.abstrato.teste;

import br.com.mac.javacore.abstrato.classes.Gato;

public class GatoTeste {

    public static void main(String[] args) {
        Gato gato = new Gato("Aninha", "Mamifero");
        gato.imprimirAnimal();
    }
}
