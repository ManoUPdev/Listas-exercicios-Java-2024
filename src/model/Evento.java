package model;

public class Evento {
    private String  Nome;
    private String Data;
    private String Local;
    private int lotacao;
    private int IngressosVendidos;
    private double PrecoIngresso;

    public Evento(String Nome, String Data, String Local, int lotacao, int IngressosVendidos, double PrecoIngresso) {
       this.Nome = Nome;
       this.Data = Data;
       this.Local = Local;
       this.IngressosVendidos = IngressosVendidos;
       this.PrecoIngresso = PrecoIngresso;
}
    public String getNome() {
        return Nome;
    }   
    
    public String getData() {
        return Data;
    }

    public String getLocal() {
        return Local;
    }

    public int getlotacao() {
        return lotacao;
    }

    public int getIngressosVendidos() {
        return IngressosVendidos;
    }

    public double PrecoIngresso() {
        return PrecoIngresso;
    }

    public void venderIngressos(int quantidade) {
        IngressosVendidos += quantidade;
    }

    public boolean temIngressosDisponiveis(int quantidade) {
        return (IngressosVendidos + quantidade) <= lotacao;
    }

    public void  setPrecoIngresso (double preco) {
        this.PrecoIngresso = preco;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

  public String toString() {
        return Nome + " | Data: " + Data + " | Local: " + Local + 
               " | Vendidos: " + IngressosVendidos + "/" + lotacao +
               " | Preço: R$" + PrecoIngresso;
    }


}
