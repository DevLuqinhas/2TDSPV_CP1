package br.com.fiap.cp1.model;

public class FuncionarioTranquilizador extends Funcionario {

    private int qtdClientesAcalmados;
    private int qtdPiadasBoas;
    private int qtdPiadasRuins;

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double bonusPiadas = qtdPiadasBoas * 500 - qtdPiadasRuins * 250;
        double bonusClientesAcalmados = qtdClientesAcalmados * 100;

        return salarioBase + bonusPiadas + bonusClientesAcalmados;
    }

    @Override
    public void imprimirInformacao() {
        super.imprimirInformacao();
        double bonusPiadas = qtdPiadasBoas * 500 - qtdPiadasRuins * 250;
        double bonusClientesAcalmados = qtdClientesAcalmados * 100;

        System.out.println("Bonus por Piadas: " + bonusPiadas);
        System.out.println("Bonus por Clientes Acalmados: " + bonusClientesAcalmados);
    }

    public void setQtdClientesAcalmados(int qtdClientesAcalmados) {
        this.qtdClientesAcalmados = qtdClientesAcalmados;
    }

    public void setQtdPiadasBoas(int qtdPiadasBoas) {
        this.qtdPiadasBoas = qtdPiadasBoas;
    }

    public void setQtdPiadasRuins(int qtdPiadasRuins) {
        this.qtdPiadasRuins = qtdPiadasRuins;
    }
}