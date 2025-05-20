package br.edu.up;

import java.util.Scanner;

public class L1Ex5 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Valores originais -> A: " + a +", B:" +b);


        int temp = a;
        a = b;
        b = temp;
    
        System.out.println("Valores trocados -> A: " + a + ", B: " + b);
    
    
        scanner.close();
    }

    
}
