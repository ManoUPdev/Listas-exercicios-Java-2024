import java.util.Scanner;

public class L3Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionario: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Digite o salario fixo: ");
        double salario = scanner.nextDouble();

        double abono;
        if(sexo == 'M') {
            abono = (idade >= 30) ? 100 : 50;
        } else {
            abono = (idade >= 30) ? 200 : 80;
    }

    double salarioFinal = salario + abono;

    System.out.println("Funcionario: " + nome);
    System.out.println("Salario liquido com abono: R$ " + salarioFinal);
    scanner.close();

 }
}
