package view;

import java.util.Scanner;

public class Menu1 {
    private Scanner scanner = new Scanner(System.in);

    public  void exibirMenu() {
    System.out.println("\n=== MENU ===");
    System.out.println("1 - Incluir Evento");
    System.out.println("2 - Alterar Evento");
    System.out.println("3 - Listar Eventos");
    System.out.println("4 - Excluir Evento");
    System.out.println("5 - Realizar Reserva");
    System.out.println("6 - Listar Reservas");
    System.out.println("7 - Excluir Reserva");
    System.out.println("0 - Sair");
    System.out.print("Escolha: ");
    }

    public String lerString(String msg) {
        System.out.println(msg);
        return scanner.nextLine();

    }

    public int LerInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scanner.nextLine());
    }
    
    public  double lerDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scanner.nextLine());
    }


}

