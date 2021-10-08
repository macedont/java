package br.com.mac.javacore.sobrecargaConstrutores.classes;

public class Estudante {
    private String nome;
    private String matricula;
    private String cpf;
    private double[] notas;

    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, double[] notas, String cpf){
        this(nome,matricula,notas);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
