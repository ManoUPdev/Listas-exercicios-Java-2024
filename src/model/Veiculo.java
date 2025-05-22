package model;

public class Veiculo {
    private String modelo;
    private String placa;
    private String cor;
    private String periodo;

    public Veiculo(String modelo, String placa, String cor, String periodo) {
         this.modelo = modelo;
         this.placa = placa;
         this.cor = cor;
         this.periodo= periodo;

    }


    public String getPlaca() {
    return placa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String toString() {
        return modelo + " - " + placa + " - " + cor+ " - periodo: " + periodo;
    }


}
