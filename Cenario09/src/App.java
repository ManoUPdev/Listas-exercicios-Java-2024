import br.edu.up.controller.ClienteController;
import br.edu.up.view.ClienteView;


public class App {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();
        ClienteView view = new ClienteView(controller);

        while (true) {
            view.exibirMenu();
            System.out.println("Digite a opção desejada:");
            int opcao = Integer.parseInt(ClienteView.Scanner.nextLine());
            view.processarOpcao(opcao);
        }
    }
}
