package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        System.out.println("-------------------------------------");
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        System.out.println("-------------------------------------");

        System.out.println("O aluno" + a1 + "está matriculado? ");

        System.out.println(javaColecoes.estaMatriculado(a1));

    }
}
