import java.util.Scanner;

public class L2Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de termos da sequencia de Fibonacci:");
        int n = scanner.nextInt();

        if(n <= 0) {
            System.out.println("Numero de termos deve ser positivo.");
            scanner.close();
            return;
        }
        int[] fibonacci = new int[n];
        if(n > 0) fibonacci[0] = 1;
        if(n > 1) fibonacci[0] = 1;

        for(int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Sequencia de Fibonacci:");
        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
        }
        scanner.close();
    }
    
}
