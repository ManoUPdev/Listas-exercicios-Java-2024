package br.edu.up;

import java.util.Scanner;

public class L1Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero (A): ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo numero (B): ");
        int b = scanner.nextInt();

        
        if (a == b) {
            System.out.println("Os numeros sao iguais.");
        } else if (a > b) {
            System.out.println("Os numeros sao diferentes. O maior e A: " + a);
        } else {
            System.out.println("Os numeros sao diferentes. O maior e B: " + b);
        }

        scanner.close();
    }
}
