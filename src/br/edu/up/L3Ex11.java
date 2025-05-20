package br.edu.up;

import java.util.Scanner;

public class L3Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0, totalMulheres = 0;

        for(int i = 0; i < 56; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                totalHomens++;
                System.out.println(nome + "e homem.");
            } else if (sexo == 'F') {
                totalMulheres++;
                System.out.println(nome + "e mulher.");
            } else {
                System.out.println("Sexo invalido.");
        }
        
     System.out.println("Total de homens: " + totalHomens);
     System.out.println("Total de mulheres: " +totalMulheres);
     scanner.close();

    }

   }
}  