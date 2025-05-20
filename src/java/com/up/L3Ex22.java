import java.util.Scanner;

public class L3Ex22 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        int tipoCliente = scanner.nextInt();

        System.out.print("Digite o consumo de energia em kW/h: ");
        double consumo = scanner.nextDouble();

        double valorKw = 0;
        switch (tipoCliente) {
            case 1:
                valorKw = 0.60;
                break;
            case 2:
                valorKw = 0.48;
                break;
            case 3:
                valorKw = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return;
        }

        double valorConta = consumo * valorKw;
        System.out.println("O valor da conta de luz é: R$ " + valorConta);
        scanner.close();
    }
}
