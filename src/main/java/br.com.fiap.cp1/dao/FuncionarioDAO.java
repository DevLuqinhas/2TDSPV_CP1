package br.com.fiap.cp1.dao;

import br.com.fiap.cp1.model.Funcionario;

import javax.persistence.*;

public class FuncionarioDAO {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void salvar(Funcionario f) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();

        em.close();
    }

    public Funcionario buscar(Long id) {
        EntityManager em = getEntityManager();
        Funcionario f = em.find(Funcionario.class, id);
        em.close();
        return f;
    }

    public void atualizar(Funcionario f) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();

        em.close();
    }

    public void deletar(Long id) {
        EntityManager em = getEntityManager();

        Funcionario f = em.find(Funcionario.class, id);

        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();

        em.close();
    }
}