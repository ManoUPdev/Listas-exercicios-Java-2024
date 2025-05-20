package br.edu.up;

import java.util.Scanner;

public class L3Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

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

        double reajuste = novoSalario - salarioAtual;

        System.out.println("Funcionário: " + nome);
        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}
