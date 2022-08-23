package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("trabalhando com ArrayList", 21 ));
        javaColecoes.adiciona(new Aula("Criando aula", 20 ));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22 ));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("-------------------------------------");

        System.out.println(javaColecoes.getTempoTotal());
    }
}
