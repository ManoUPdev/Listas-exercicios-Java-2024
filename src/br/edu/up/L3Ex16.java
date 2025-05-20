package br.edu.up;

import java.util.Scanner;

public class L3Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFuncionarios = 584;
        double salarioMinimo, aumentoTotal = 0;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = scanner.nextDouble();

        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salarioAtual = scanner.nextDouble();
            double novoSalario;
            
            if (salarioAtual < 3 * salarioMinimo) {
                novoSalario = salarioAtual * 1.50;
            } else if (salarioAtual <= 10 * salarioMinimo) {
                novoSalario = salarioAtual * 1.20;
            } else if (salarioAtual <= 20 * salarioMinimo) {
                novoSalario = salarioAtual * 1.15;
            } else {
                novoSalario = salarioAtual * 1.10;
            }

            aumentoTotal += novoSalario - salarioAtual;

            System.out.println("Novo salário do funcionário " + (i + 1) + ": R$ " + novoSalario);
        }

        System.out.println("Aumento total na folha de pagamento: R$ " + aumentoTotal);
        scanner.close();
    }
}
