import java.util.Scanner;

public class L2Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        // Leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Cálculo da média
        double media = soma / 5.0;
        System.out.println("Média: " + media);

        // Comparação com a média
        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                System.out.println("Número " + numeros[i] + " é menor que a média.");
            } else if (numeros[i] == media) {
                System.out.println("Número " + numeros[i] + " é igual à média.");
            } else {
                System.out.println("Número " + numeros[i] + " é maior que a média.");
            }
        }

        scanner.close();
    }
}
