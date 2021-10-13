package br.com.mac.javacore.heranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Salário: R$ " + this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
