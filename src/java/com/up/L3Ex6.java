import java.util.Scanner;

public class L3Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preco de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acrescimo (%): ");
        double percentual = scanner.nextDouble();

        double precoVenda = precoCusto + (precoCusto * percentual / 100);

        System.out.println("Preco de venda: R$" + precoVenda);

        scanner.close();
    }
    
}
