package br.com.fiap.cp1.main;

import br.com.fiap.cp1.dao.FuncionarioDAO;
import br.com.fiap.cp1.model.Funcionario;
import br.com.fiap.cp1.model.FuncionarioSenior;
import br.com.fiap.cp1.model.FuncionarioTranquilizador;
import br.com.fiap.cp1.reflection.GeradorSQL;

public class Teste {

    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAO();

        System.out.println("\n==============================");
        System.out.println("        TESTE CREATE");
        System.out.println("==============================");

        Funcionario f = new Funcionario();
        f.setNome("Funcionario Base");
        f.setHorasTrabalhadas(40);
        f.setValorHora(50);

        dao.salvar(f);

        System.out.println("\n==============================");
        System.out.println("         TESTE READ");
        System.out.println("==============================");

        Funcionario buscado = dao.buscar(f.getId());
        if (buscado != null) {
            buscado.imprimirInformacao();
        }

        System.out.println("\n==============================");
        System.out.println("        TESTE UPDATE");
        System.out.println("==============================");

        if (buscado != null) {
            buscado.setNome("Funcionario Atualizado");
            dao.atualizar(buscado);
        }

        System.out.println("\n==============================");
        System.out.println("        TESTE DELETE");
        System.out.println("==============================");

        dao.deletar(f.getId());

        System.out.println("\n==============================");
        System.out.println("     TESTE POLIMORFISMO");
        System.out.println("==============================");

        FuncionarioSenior s = new FuncionarioSenior();
        s.setNome("Senior");
        s.setHorasTrabalhadas(45);
        s.setValorHora(60);

        FuncionarioTranquilizador t = new FuncionarioTranquilizador();
        t.setNome("Tranquilizador");
        t.setHorasTrabalhadas(30);
        t.setValorHora(40);
        t.setQtdClientesAcalmados(10);
        t.setQtdPiadasBoas(5);
        t.setQtdPiadasRuins(2);

        s.imprimirInformacao();
        System.out.println("------------------------------");
        t.imprimirInformacao();

        System.out.println("\n==============================");
        System.out.println("     COMPARAÇÃO DE SALÁRIOS");
        System.out.println("==============================");

        System.out.println("Base: " + f.calcularSalario());
        System.out.println("Senior: " + s.calcularSalario());
        System.out.println("Tranquilizador: " + t.calcularSalario());

        System.out.println("\n==============================");
        System.out.println("     TESTE REFLECTION");
        System.out.println("==============================");

        System.out.println(GeradorSQL.gerarSelectDB(f));
    }
}