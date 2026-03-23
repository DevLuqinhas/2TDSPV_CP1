package br.com.fiap.cp1.model;

public class FuncionarioSenior extends Funcionario {

    private double bonus;

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        int qtdBonus = getHorasTrabalhadas() / 15;
        bonus = qtdBonus * 200;
        return salarioBase + bonus;
    }

    @Override
    public void imprimirInformacao() {
        super.imprimirInformacao();
        System.out.println("Bônus Senior: " + bonus);
    }
}