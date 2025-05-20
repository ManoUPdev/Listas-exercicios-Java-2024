import java.util.Scanner;

public class L1Ex7 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();


        if(numero >= 100 && numero <= 200) {
            System.out.println("O numero esta no intervalo entre 100 e 200.");
        } else {
            System.out.println("O numero esta fora do intervalo entre 100 e 200.");
       }
    scanner.close();
}

}