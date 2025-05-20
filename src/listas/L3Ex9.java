package br.edu.up;

import java.util.Scanner;

public class L3Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }


        System.out.println("Quantidade de numeros no intervalo [10, 150]: " + contador);
        scanner.close();
    }
}
