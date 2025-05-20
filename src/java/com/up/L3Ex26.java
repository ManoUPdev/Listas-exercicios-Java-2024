import java.util.Scanner;

public class L3Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println(nome + " não se enquadra em nenhuma das categorias ofertadas.");
            scanner.close();
            return;
        }

        System.out.print("Digite o grupo de risco (1 - Baixo, 2 - Médio, 3 - Alto): ");
        int grupoRisco = scanner.nextInt();

        int categoria = 0;
        if (idade >= 17 && idade <= 20) {
            if (grupoRisco == 1) categoria = 1;
            else if (grupoRisco == 2) categoria = 2;
            else if (grupoRisco == 3) categoria = 3;
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco == 1) categoria = 2;
            else if (grupoRisco == 2) categoria = 3;
            else if (grupoRisco == 3) categoria = 4;
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco == 1) categoria = 3;
            else if (grupoRisco == 2) categoria = 4;
            else if (grupoRisco == 3) categoria = 5;
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco == 1) categoria = 4;
            else if (grupoRisco == 2) categoria = 5;
            else if (grupoRisco == 3) categoria = 6;
        } else if (idade >= 65 && idade <= 70) {
            if (grupoRisco == 1) categoria = 7;
            else if (grupoRisco == 2) categoria = 8;
            else if (grupoRisco == 3) categoria = 9;
        }

        if (categoria != 0) {
            System.out.println(nome + " está na categoria: " + categoria);
        } else {
            System.out.println("Dados inválidos.");
        }

        scanner.close();
    }
}