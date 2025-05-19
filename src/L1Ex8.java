import java.util.Scanner;

public class L1Ex8 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero >= 50){
            System.out.println("O numero e maior ou igual a 50.");
        } else {
            System.out.println("O numero e menor que 50.");
    }
    scanner.close();
 }
}