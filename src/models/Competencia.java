package br.edu.up.models;

    
public class Competencia {
    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private TipoCompetencia tipo;

    public Competencia(String nome, TipoCompetencia tipo) {
        this.nome = nome;
        this.tipo = tipo;

    }
}
