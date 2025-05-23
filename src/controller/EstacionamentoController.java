package controller;

import model.Estacionamento;
import model.Veiculo;
import view.Menu0;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private Menu0 menu;

    public EstacionamentoController() {
        this.estacionamento = new Estacionamento();
        this.menu = new Menu0();
    }

    public void iniciar() {
        int opcao;
        do {
            menu.exibirMenu();
            opcao = Integer.parseInt(menu.lerString(""));
            switch (opcao) {
                case 1:
                    entradaVeiculo();
                    break;
                case 2:
                    saidaVeiculo();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void entradaVeiculo() {
        String modelo = menu.lerString("Modelo do veículo: ");
        String placa = menu.lerString("Placa do veículo: ");
        String cor = menu.lerString("Cor do veículo: ");
        String periodo = menu.lerString("Período (manhã/tarde/noite): ");

        Veiculo v = new Veiculo(modelo, placa, cor, periodo);
        if (estacionamento.entrarVeiculo(v)) {
            System.out.println("Veículo adicionado com sucesso.");
        } else {
            System.out.println("Estacionamento cheio!");
        }
    }

    private void saidaVeiculo() {
        String placa = menu.lerString("Placa do veículo para saída: ");
        if (estacionamento.sairVeiculo(placa)) {
            System.out.println("Veículo removido com sucesso.");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private void gerarRelatorio() {
        String periodo = menu.lerString("Informe o período (manhã/tarde/noite): ");
        estacionamento.gerarRelatorio(periodo);
    }
}
