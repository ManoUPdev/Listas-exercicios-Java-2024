import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];


        //Leitura dos numeros
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero" + (i + 1)+":");
            numeros[i] = scanner.nextInt();
        }

        //Leitura do numero n
        System.out.println("Digite um numero para verificar quantas vezes aparece: ");
        int n = scanner.nextInt();

        //Contagem de ocorrencia
        int contagem = 0;
        for (int i = 0; i < 5; i++) {
            if(numeros[i] == n){
                contagem++;
            }
        }

        System.out.println("O número " + n + " aparece " + contagem + " vez(es) no vetor.");
        
        scanner.close();
    }
    
}
