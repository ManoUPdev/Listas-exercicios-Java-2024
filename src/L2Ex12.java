import java.util.Scanner;

public class L2Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[12];
        int produto = 1;
        boolean encontrouPares = false;

        //Leitura dos elementos do vetor
        System.out.println("Digite os 12 elementos do vetor:");
        for(int i = 0; i < 12; i++) {
            System.out.println("Elemento"+ (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        //Cálculo do produto dos elementos pares positivos
        for(int i = 0; i < 12; i++) {
            if(vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
                encontrouPares = true;
            }
        }
        if(encontrouPares) {
            System.out.println("O produto dos elementos pares positivos é: " +produto);
        } else {
            System.out.println("Não há elementos pares positivos no vetor.");
        }
        
        scanner.close();
    }
    
}
