package br.edu.up.controller;

import br.edu.up.models.EmpresaDeEventosModel;
import br.edu.up.view.EmpresaDeEventosView;

public class EmpresaDeEventosController {
    @SuppressWarnings("unused")
    private EmpresaDeEventosModel model;
    private EmpresaDeEventosView view;

    public EmpresaDeEventosController(EmpresaDeEventosModel model, EmpresaDeEventosView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    // Adicionar evento
                    break;
                case 2:
                    // Listar eventos
                    break;
                case 3:
                    // Adicionar reserva
                    break;
                case 4:
                    // Listar reservas
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }
}
