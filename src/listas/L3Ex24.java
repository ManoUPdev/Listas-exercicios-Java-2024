import java.util.Scanner;

public class L3Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do Trabalho de Laboratorio: ");
        double notaLab = scanner.nextDouble();

        System.out.println("Digite  a nota da Avaliacao Semestral: ");
        double notaAv = scanner.nextDouble();

        System.out.println("Digite a nota do Exame Final: ");
        double notaExame = scanner.nextDouble();

        double mediaPonderada = (notaLab * 2 * notaAv * 3 + notaExame * 5) /10;

        System.out.println("Nota final (media ponderada): " + mediaPonderada);
        scanner.close();
    }
}