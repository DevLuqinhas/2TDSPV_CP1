package br.com.fiap.cp1.reflection;

import br.com.fiap.cp1.annotations.Coluna;
import br.com.fiap.cp1.annotations.Descricao;

import java.lang.reflect.Field;

public class GeradorSQL {

    public static String gerarSelectDB(Object obj) {

        Class<?> classe = obj.getClass();

        if (!classe.isAnnotationPresent(Descricao.class)) return null;

        Descricao tabela = classe.getAnnotation(Descricao.class);

        StringBuilder sql = new StringBuilder("SELECT ");

        Field[] campos = classe.getDeclaredFields();

        for (Field campo : campos) {
            if (campo.isAnnotationPresent(Coluna.class)) {
                Coluna coluna = campo.getAnnotation(Coluna.class);
                sql.append(coluna.nome()).append(", ");
            }
        }

        // remove última vírgula
        sql.delete(sql.length() - 2, sql.length());

        sql.append(" FROM ").append(tabela.descricao());

        return sql.toString();
    }
}