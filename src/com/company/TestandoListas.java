package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com curso e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        System.out.println("-----------------------");
        System.out.println("** for com forEach");
        for (String aula : aulas) {
            System.out.println("Aula:" + aula);
        }
        System.out.println("-----------------------");


        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        System.out.println("-----------------------");
        System.out.println("** for com for tradicional");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }
        System.out.println("-----------------------");

        System.out.println("** for com forEach java 8");
        aulas.forEach(aula -> {
            System.out.println("percorrendo : ");
            System.out.println("Aula : " + aula);
        });

        System.out.println("-----------------------");
        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
    }
}
