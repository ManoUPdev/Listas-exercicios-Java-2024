package br.edu.up;

import java.util.Scanner;

public class L3Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        String situacao;

        if(media >= 7) {
             situacao = "Aprovado";
          } else if  (media <= 5) {
             situacao = "Reprovado";
          } else {
             situacao = "Recuperacao";
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        System.out.println("Situacao: " + situacao);

        
        scanner.close();
    }
}
