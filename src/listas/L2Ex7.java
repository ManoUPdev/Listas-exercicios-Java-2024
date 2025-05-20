import java.util.Scanner;

public class L2Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        boolean iguais = true;

        // Leitura dos valores do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Leitura dos valores do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        // Comparação dos vetores
        for(int i = 0; i < 5; i++) {
            if(vetorA[i] != vetorB[i]) {
                iguais = false;
                break;
            }
        }

        if(iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        scanner.close();
    }
}
