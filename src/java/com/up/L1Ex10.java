import java.util.Scanner;

public class L1Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 5: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres"); 
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco"); 
                break;
            default:
                System.out.println("Numero invalido!"); 
        }

        scanner.close();
    }
}
