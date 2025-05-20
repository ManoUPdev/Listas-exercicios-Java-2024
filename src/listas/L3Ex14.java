package br.edu.up;

import java.util.Scanner;

public class L3Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaCusto = 0, somaVenda = 0;

        for (int i = 0; i < 40; i++) {
            System.out.println("Digite o preço de custo do produto " + (i+1) + ": ");
            double precoCusto = scanner.nextDouble();

            System.out.println("Digite o preço de venda do produto " + (i+1) + ": ");
            double precoVenda = scanner.nextDouble();

            somaCusto += precoCusto;
            somaVenda += precoVenda;

            if(precoVenda > precoCusto) {
                System.out.println("Produto " + (i+1) + ": Lucro.");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + (i+1) + ": Prejuizo.");

            } else {
                System.out.println("Produto " + (i+1) + ": Empate.");
            }
        } 
                System.out.println("Media de preço de custo: R$ " + (somaCusto / 40));
                System.out.println("Media de preco de venda: R$" + (somaVenda / 40));
                scanner.close();
        
   }
}
