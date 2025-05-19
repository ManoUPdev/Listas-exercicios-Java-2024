import java.util.Scanner;

public class L2Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double[] pesos = new double[5];
        double somaNotas = 0;
        double somaPesos = 0;

        //Leitura das notas e pesos
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i + 1) +":");
            notas[i] = scanner.nextDouble();
            System.out.println("Digite o peso da nota " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        //Calculo da media ponderada
        double mediaPonderada = somaNotas / somaPesos;
        System.out.println("A media ponderada e: " + mediaPonderada);

        scanner.close();

        
    }
    
}
