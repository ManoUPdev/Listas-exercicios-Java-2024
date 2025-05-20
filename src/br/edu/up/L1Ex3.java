package br.edu.up;

import java.util.Scanner;

public class L1Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero (A): ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo numero (B): ");
        int b = scanner.nextInt();

        if(a == b){
            System.out.println("A sequencia de numeros informados e invalida.");
        } else if (a > b) {
            System.out.println("O maior numero e: " + a);
        } else {
            System.out.println("O maior numero e: " + b);
        }
        scanner.close();
    }
}


