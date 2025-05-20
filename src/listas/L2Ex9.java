package br.edu.up;

import java.util.Scanner;

public class L2Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        //Leitura dos vetores
        System.out.println("Digite os elementos do vetor A:");
        for(int i = 0; i < 5; i++){
            System.out.println("Elemento " + (i + 1) + ":");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        //Criação do vetor C
        int indexC = 0;
        for(int i = 0; i < 5; i++) {
            if(vetorA[i] % 2 == 0) {
                vetorC[indexC++] = vetorA[i];
            }
        }

        for(int i = 0; i < 5; i++) {
            if(vetorB[i] % 2 !=0){
                vetorC[indexC++] = vetorB[i];
            }
        }

        // Exibição do vetor C
        System.out.println("Vetor C (pares de A e impares de B):");
        for(int i = 0; i < indexC; i++) {
            System.out.println("Elemento " + i + ":" +vetorC[i]);
        }
        scanner.close();
    }

}
