package br.com.fiap.cp1.model;

import javax.persistence.*;
import br.com.fiap.cp1.annotations.Coluna;
import br.com.fiap.cp1.annotations.Descricao;

@Entity
@Table(name = "TBL_FUNCIONARIOS")

@Descricao(descricao = "TBL_FUNCIONARIOS")

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Coluna(nome = "ID")
    private Long id;

    @Column(name = "NOME")
    @Coluna(nome = "NOME")
    private String nome;

    @Column(name = "HORAS_TRABALHADAS")
    @Coluna(nome = "HORAS_TRABALHADAS")
    private int horasTrabalhadas;

    @Column(name = "VALOR_HORA")
    @Coluna(nome = "VALOR_HORA")
    private double valorHora;

    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public void imprimirInformacao() {
        System.out.println("Nome: " + nome);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Salário final: " + calcularSalario());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}