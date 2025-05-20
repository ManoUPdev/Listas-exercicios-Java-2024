package br.edu.up;

import java.util.Scanner;

public class L3Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("Media: "+ media);

        scanner.close();
    }
}
