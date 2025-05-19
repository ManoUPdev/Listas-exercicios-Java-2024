import java.util.Scanner;

public class L3Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de horas/aula: ");
        int horas = scanner.nextInt();

        System.out.println("Digite o nivel do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        double valorHora;
        switch (nivel) {
            case 1:
                valorHora = 12.00;
                break;
            case 2:
                 valorHora = 17.00;
                 break;
            case 3:
                 valorHora = 25.00;
                 break;
              default:
                   valorHora = 0;
                   System.out.println("Nivel invalido.");            
        }

        double salario = horas * valorHora;

        System.out.println("Salario do professor: R$ " + salario);
        scanner.close();
    }
    
}
