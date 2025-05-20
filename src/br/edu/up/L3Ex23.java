import java.util.Scanner;

public class L3Ex23 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a altura(em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite  a idade: ");
        int idade = scanner.nextInt();

        double pesoIdeal = 0;
        if (sexo == 'M') {
            if(altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
            }
        } else {
            if (idade <= 40) {
                pesoIdeal = (72.7 * altura) -50;
            } else {
                pesoIdeal = (72.7 * altura) - 58;
         }

        }
        
        } else if (sexo == 'F') {
        if (altura > 1.50) {
        pesoIdeal = (62.1 * altura) - 44.7;
        } else {
        if (idade >= 35) {
            pesoIdeal = (62.1 * altura) - 45;
        } else {
            pesoIdeal = (62.1 * altura) - 49;
        }
    }

        } else {
        System.out.println("Sexo invalido.");
        return;

    }
        System.out.println("Nome: " + nome);
        System.out.println("Peso ideal: " + pesoIdeal + "kg");
        scanner.close();
  }
}