package model;
import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Veiculo> vagas;
    @SuppressWarnings("unused")
    private int totalEntradas;
    private int totalSaidas;
    private double totalPagamento;

    public Estacionamento() {
        this.vagas = new ArrayList<>();
        this.totalEntradas = 0;
        this.totalSaidas = 0;
        this.totalPagamento = 0.0;
    }

    public boolean temVaga() {
        return vagas.size() < 10;
    }

    public boolean entrarVeiculo(Veiculo veiculo) {
        if (temVaga()) {
            vagas.add(veiculo);
            totalEntradas++;
            totalPagamento += 5.0;
            return true;
        }
        return false;
    }

    public boolean sairVeiculo(String placa) {
        for (Veiculo v : vagas) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                vagas.remove(v);
                totalSaidas++;
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unused")
    public void gerarRelatorio(String periodo) {
        int entradas = 0, saidas = 0;
        double valor = 0;

        for (Veiculo v : vagas) {
            if (v.getPeriodo().equalsIgnoreCase(periodo)) {
                entradas++;
            }
        }

        // Simulação de entradas/saídas removidas com base no total geral
        // (em um sistema real, entradas/saídas por período seriam melhor controladas)
        System.out.println("=== RELATÓRIO " + periodo.toUpperCase() + " ===");
        System.out.println("Entradas: " + entradas);
        System.out.println("Saídas: " + totalSaidas); // em geral
        System.out.println("Total recebido: R$ " + String.format("%.2f", totalPagamento));
        System.out.println("==============================");
    }
}

