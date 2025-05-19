import java.util.Scanner;

public class L2Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        // Leitura dos elementos do vetor
        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Encontrar o maior elemento e seu índice
        int maior = vetor[0];
        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }

        // Posicionar o maior elemento na última posição
        if (indiceMaior != 4) {
            int temp = vetor[4];
            vetor[4] = vetor[indiceMaior];
            vetor[indiceMaior] = temp;
        }

        // Exibição do vetor atualizado
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}
