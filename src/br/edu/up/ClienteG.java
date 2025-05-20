package br.edu.up;

import br.edu.up.controller.ClienteController;
import br.edu.up.view.ClienteView;


public class ClienteG {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();
        ClienteView view = new ClienteView(controller);

        while (true) {
            view.exibirMenu();
            System.out.println("Digite a opção desejada:");
            int opcao = 0;
            view.processarOpcao(opcao);
        }
    }
}
