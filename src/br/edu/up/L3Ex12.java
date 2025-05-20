package br.edu.up;

import java.util.Scanner;

public class L3Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carrosAte2000 = 0, totalCarros = 0;
        String continuar;
    
    do {
        System.out.println("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();

        System.out.println("Digite o ano do carro: ");
        int anoCarro = scanner.nextInt();

        double desconto = (anoCarro <= 2000) ? valorCarro * 0.12 : valorCarro * 0.07;
        double valorFinal = valorCarro - desconto;

        if (anoCarro <= 2000) carrosAte2000++;
        totalCarros++;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor a ser pago: R$ " + valorFinal);

        System.out.print("Deseja continuar (S/N)? ");
        continuar = scanner.next();
    } while (continuar.equalsIgnoreCase("S"));

    System.out.println("Total de carros ate 2000: " + carrosAte2000);
    System.out.println("Total de carros: " + totalCarros);
    scanner.close();
  }
}