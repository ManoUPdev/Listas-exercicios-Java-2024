import java.util.Scanner;

public class L3Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotacao do dolar: ");
        double cotacao = scanner.nextDouble();

        System.out.println("Digite a quantidade de dolares: ");
        double dolares = scanner.nextDouble();

        double reais = dolares * cotacao;

        System.out.println("Valor em reais: R$" + reais);

        scanner.close();
    }
    
}
