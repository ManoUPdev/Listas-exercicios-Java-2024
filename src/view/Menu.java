package view;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("\n=== MENU ESTACIONAMENTO ===");
        System.out.println("1 - Entrada de Veículo");
        System.out.println("2 - Saída de Veículo");
        System.out.println("3 - Relatório por Período");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    public int lerInt(String mensagem) {
        System.out.print(mensagem);
        return sc.nextInt();
    }
}
