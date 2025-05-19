import java.util.Scanner;

public class L2Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        //Leitura do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Elemento" + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }
        
        //Inversão dos elementos para o vetor B
        for(int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - 1];
        }

        //Exibição do vetor B
        System.out.println("Vetor B (inverso de A):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento" + i + ": " +vetorB[i]);
        }
        
        scanner.close();
    }
    
}
