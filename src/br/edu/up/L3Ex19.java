package br.edu.up;

import java.util.Scanner;

public class L3Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor do lado B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor do lado C: ");
        int c = sc.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não podem formar um triângulo.");
        }

        sc.close();
    }
}
