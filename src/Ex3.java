import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do vetor
        System.out.print("Quantos números deseja digitar? ");
        int tamanho = scanner.nextInt();
        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];

        // Leitura dos números e cálculo do dobro
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        // Exibição do vetor com o dobro dos valores
        System.out.println("Vetor com o dobro dos valores:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("VetorDobro[" + i + "] = " + vetorDobro[i]);
        }

        // Fechando o scanner
        scanner.close();
    }
}
