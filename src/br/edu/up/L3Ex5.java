import java.util.Scanner;

public class L3Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double prestacao = valorCompra / 5;

        System.out.println("Valor de cada prestacao: R$" + prestacao);

        scanner.close();
    }
    
}
