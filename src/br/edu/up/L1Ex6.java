package br.edu.up;

import java.util.Scanner;

public class L1Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}
