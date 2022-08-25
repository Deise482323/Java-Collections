package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaAlunosNoCurso {
    public static void main(String[] args) throws NoSuchFieldException {
        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));
        System.out.println("-------------------------------------");
        Aluno a1 = new Aluno("Rodrido Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        System.out.println("-------------------------------------");

        System.out.println("Quem é o aluno com matricula 5617? ");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("aluno: " + aluno);

        Map<Integer, Set<Aluno>> matriculaParaAlunos;
    }
}
