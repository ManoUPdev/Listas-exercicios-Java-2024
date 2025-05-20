package br.edu.up;

import java.util.Scanner;

public class L2Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int produtoEscalar = 0;

        //Leitura dos vetores
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento" + (i + 1)+ ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        //Cálculo do produto escalar
        for(int i = 0; i < 5; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }
        System.out.println("O produto escalar e: " +produtoEscalar);

        scanner.close();
    }
}
