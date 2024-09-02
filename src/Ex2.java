import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantos números ele deseja digitar
        System.out.print("Quantos números deseja digitar? ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];

        // Leitura dos números
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Verificação dos números
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] > 0) {
                System.out.println("Número na posição " + i + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("Número na posição " + i + " é negativo.");
            } else {
                System.out.println("Número na posição " + i + " é zero.");
            }
        }

        
        scanner.close();
    }
}

