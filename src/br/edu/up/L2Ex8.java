import java.util.Scanner;

public class L2Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];


       // Leitura dos vetores
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os elementos do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os elementos do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }

         //Concatenação dos vetores
         for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 5] = vetorB[i];
        }

        //Exibição do vetor concatenado
        System.out.println("Vetor C (concatenação de A e B):");
        for(int i = 0; i < 10; i++) {
             System.out.println("Elemento " + i + ":" +vetorC[i]);
        }
        scanner.close();
    }
    
}
