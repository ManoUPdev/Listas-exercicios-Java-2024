import java.util.Scanner;

public class L3Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia total percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o total de combustivel gasto (litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("Consumo medio: " + consumoMedio + "km/l");

        scanner.close();
    }
    
}
