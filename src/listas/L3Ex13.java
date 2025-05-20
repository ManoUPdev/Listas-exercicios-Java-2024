package br.edu.up;

import java.util.Scanner;

public class L3Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aptos = 0, inaptos = 0;
        String continuar;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            
            scanner.nextLine(); // Consumir o newline
            
            System.out.print("Condição de saúde (boa/ruim): ");
            String saude = scanner.nextLine();

            boolean apto = (idade >= 18 && saude.equalsIgnoreCase("boa"));

            if (apto) {
                System.out.println(nome + " (" + sexo + ") está apto para o serviço militar.");
                aptos++;
            } else {
                System.out.println(nome + " (" + sexo + ") não está apto para o serviço militar.");
                inaptos++;
            }

            System.out.print("Deseja continuar (S/N)? ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Total de aptos: " + aptos);
        System.out.println("Total de inaptos: " + inaptos);
        scanner.close();
    }
}
