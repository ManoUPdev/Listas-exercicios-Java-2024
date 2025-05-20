package br.edu.up;

import java.util.Scanner;

public class L3Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if(idade >= 18) {
                System.out.println("Maior de idade");
                
            } else {
                System.out.println("Menor de idade");
        }
        
        System.out.println("Deseja continuar (s/n)? ");
        opcao = scanner.next();
    } while (opcao.equalsIgnoreCase("s"));
 
    scanner.close();
}
}