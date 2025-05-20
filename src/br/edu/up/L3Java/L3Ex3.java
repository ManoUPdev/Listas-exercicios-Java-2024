import java.util.Scanner;

public class L3Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite  o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salario fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Vendedor: " + nome);
        System.out.println("Salario fixo: R$" + salarioFixo);
        System.out.println("Salario com comissao: R$"+ salarioFinal);

        scanner.close();
    }
    
}
