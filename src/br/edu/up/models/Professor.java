package br.edu.up.models;


public class Professor extends Pessoa {
    @SuppressWarnings("unused")
    private String lattes;
    @SuppressWarnings("unused")
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String lattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.lattes = lattes;
        this.titulacao = titulacao;
    }
    
}
