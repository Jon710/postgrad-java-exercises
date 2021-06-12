package com.designpatterns.strategy;

import com.designpatterns.strategy.negocio.entidade.*;

public class Main {

    public static void main(String[] args) {

        Curso c = new Curso();
        c.setNome("Qualidade de Código");

        Aluno a = new Aluno();
        a.setNome("João");

        Matricula m = new Matricula();

        Prova p1 = new Prova();
        p1.setNota(7.0);
        p1.setMatricula(m);

        Prova p2 = new Prova();
        p2.setNota(3.0);
        p2.setMatricula(m);

        m.getProvas().add(p1);
        m.getProvas().add(p2);
        m.setAluno(a);
        m.setCurso(c);
        m.setMediaStrategy(new MediaAritmeticaStrategy());

        System.out.println("A média do aluno " + a.getNome() + " é: " + m.calcularMedia());

    }
}
