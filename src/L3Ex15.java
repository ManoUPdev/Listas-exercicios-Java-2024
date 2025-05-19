import java.util.Scanner;

public class L3Ex15 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double totalDesconto = 0, totalPago = 0;
       
       while(true) {
           System.out.println("Digite o valor do carro (ou 0 para sair): ");
           double valorCarro = scanner.nextDouble();
           if (valorCarro == 0) break;

           System.out.println("Digite o tipo de combustível (alcool/gasolina/diesel): ");
           String combustivel = scanner.next().toLowerCase();

           double desconto;
           switch (combustivel) {
               case "alcool":
                   desconto = valorCarro * 0.25;
                   break;
               case "gasolina":
                   desconto = valorCarro * 0.21;
                   break;
               case "diesel":
                   desconto = valorCarro * 0.14;
                   break;
               default:
                   desconto = 0;
                   System.out.println("Combustível inválido.");
           }

           double valorFinal = valorCarro - desconto;
           totalDesconto += desconto;
           totalPago += valorFinal;

           System.out.println("Valor do desconto: R$ " + desconto);
           System.out.println("Valor a ser pago: R$ " + valorFinal);
       }

       System.out.println("Total de desconto concedido: R$ " + totalDesconto);
       System.out.println("Total pago pelos clientes: R$ " + totalPago); // Aqui estava o erro, faltava exibir totalPago
       scanner.close();
    }
}
