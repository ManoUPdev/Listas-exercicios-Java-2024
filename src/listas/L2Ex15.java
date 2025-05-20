import java.util.Scanner;

public class L2Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int[5];

        System.out.println("Digite o primeiro numero: ");
        vetor[0] = scanner.nextInt();

        for(int i = 1; i < 5; i++) {
            int numero;
            do{
                System.out.println("Digite um maior que " + vetor[i - 1]+": ");
                numero = scanner.nextInt();
            } while (numero <= vetor[i - 1]);
            vetor[i] = numero;
        }
        //Exibicao do vetor
        System.out.println("Vetor preenchido:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Elemento" + i + ": " +vetor[i]);
        }
        scanner.close();
    }
    
}
