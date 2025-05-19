import java.util.Scanner;

public class L3Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double impostos = custoFabrica * 0.45;
        double distribuidor = (custoFabrica + impostos) * 0.28;

        double custoConsumidor = custoFabrica + impostos + distribuidor;

        System.out.println("Custo ao consumidor: R$" + custoConsumidor);

        scanner.close();
    }
    
}
