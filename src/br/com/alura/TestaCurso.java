package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        System.out.println("-------------------------------------");

        javaColecoes.adiciona(new Aula("trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));

        System.out.println(aulas);
    }
}
