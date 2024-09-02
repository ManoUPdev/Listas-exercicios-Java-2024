import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos números
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Leitura do valor de n
        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();

        // Exibição dos índices dos elementos menores que n
        System.out.println("Índices de elementos inferiores a " + n + ":");
        for(int i = 0; i < 5; i++) {
            if(numeros[i] < n) {
                System.out.println("Índice " + i + ": " + numeros[i]);
            }
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
