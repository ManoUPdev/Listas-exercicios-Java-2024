package controller;

import java.util.ArrayList;
import model.Evento;
import model.Reserva;
import view.Menu1;

public class SistemaController {
    private ArrayList<Evento> eventos;
    private ArrayList<Reserva> reservas;
    private Menu1 menu;

    public SistemaController() {
        eventos = new ArrayList<>();
        reservas = new ArrayList<>();
        menu = new Menu1();
    }

    public void iniciar() {
        int opcao;
        do {
            menu.exibirMenu();
            opcao = menu.LerInt("");
            switch (opcao) {
                case 1: incluirEvento(); break;
                case 2: alterarEvento(); break;
                case 3: listarEventos(); break;
                case 4: excluirEvento(); break;
                case 5: realizarReserva(); break;
                case 6: listarReservas(); break;
                case 7: excluirReserva(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void incluirEvento() {
        String nome = menu.lerString("Nome do evento: ");
        String data = menu.lerString("Data: ");
        String local = menu.lerString("Local: ");
        int lotacao = menu.LerInt("Lotação máxima: ");
        double preco = menu.lerDouble("Preço do ingresso: ");

        eventos.add(new Evento(nome, data, local, LotacaoMaxima, preco));
        System.out.println("Evento incluído com sucesso.");
    }

    private void alterarEvento() {
        String nome = menu.lerString("Nome do evento a alterar: ");
        for (Evento e : eventos) {
            if (e.getNome().equalsIgnoreCase(nome)) {
                String novoLocal = menu.lerString("Novo local: ");
                double novoPreco = menu.lerDouble("Novo preço: ");
                e.setLocal(novoLocal);
                e.setPrecoIngresso(novoPreco);
                System.out.println("Evento alterado.");
                return;
            }
        }
        System.out.println("Evento não encontrado.");
    }

    private void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (Evento e : eventos) {
                System.out.println(e);
            }
        }
    }

    private void excluirEvento() {
        String nome = menu.lerString("Nome do evento a excluir: ");
        eventos.removeIf(e -> e.getNome().equalsIgnoreCase(nome));
        reservas.removeIf(r -> r.getEventoNome().equalsIgnoreCase(nome));
        System.out.println("Evento e reservas associadas excluídos.");
    }

    private void realizarReserva() {
        String nomeEvento = menu.lerString("Nome do evento: ");
        for (Evento e : eventos) {
            if (e.getNome().equalsIgnoreCase(nomeEvento)) {
                int qtd = menu.LerInt("Quantidade de pessoas: ");
                if (e.temIngressosDisponiveis(qtd)) {
                    String responsavel = menu.lerString("Nome do responsável: ");
                    String dataReserva = menu.lerString("Data da reserva: ");
                    double total = qtd * e.PrecoIngresso();
                    reservas.add(new Reserva(nomeEvento, responsavel, qtd, dataReserva, total));
                    e.venderIngressos(qtd);
                    System.out.println("Reserva realizada.");
                } else {
                    System.out.println("Ingressos insuficientes.");
                }
                return;
            }
        }
        System.out.println("Evento não encontrado.");
    }

    private void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }

    private void excluirReserva() {
        String nomeResponsavel = menu.lerString("Nome do responsável pela reserva: ");
        reservas.removeIf(r -> r.getResponsavel().equalsIgnoreCase(nomeResponsavel));
        System.out.println("Reserva(s) excluída(s).");
    }
}
