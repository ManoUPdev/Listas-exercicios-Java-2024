import java.util.Scanner;

public class L3Ex25 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Digite a nota do estudante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o numero de matricula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota do Trabalho de Laboratorio:");
        double notaLab = scanner.nextDouble();

        System.out.print("Digite a nota do Avaliacao Semestral: ");
        double notaAv = scanner.nextDouble();

        System.out.print("Digite a nota do Exame Final");
        double notaExame = scanner.nextDouble();

        double notaFinal = (notaLab * 2 + notaAv * 3 + notaExame * 5) / 10;
        String  classificao;

        if  (notaFinal >= 8) {
            classificao = "A";

            } else if (notaFinal >= 7) {
                classificao = "B";
            } else if (notaFinal >= 6) {
                classificao = "C";
            } else if (notaFinal >= 5) {
                classificao = "D";
            } else {
                classificao = "R";    
        }
        
    System.out.println("Estudante: " + nome);
    System.out.println("Matricula: " + matricula);
    System.out.println("Nota final: " + notaFinal);
    System.out.println("Classificao: " + classificao);
    scanner.close();

    }
}