package model;

public class Reserva {
  private String eventoNome;
  private String responsavel;
  private int qtdPessoas;
  private String dataReserva;
  private double valorTotal;

public Reserva(String eventoNome, String resposavel, int qtdPessoas, String dataReserva, double valorTotal) {
   this.eventoNome = eventoNome;
   this.responsavel = resposavel;
   this.qtdPessoas = qtdPessoas;
   this.dataReserva = dataReserva;
   this.valorTotal = valorTotal;

}


public String getEventoNome() {
        return eventoNome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String toString() {
        return "Reserva para: " + eventoNome + " | Responsável: " + responsavel +
               " | Pessoas: " + qtdPessoas + " | Data: " + dataReserva +
               " | Total: R$" + valorTotal;


 }
}