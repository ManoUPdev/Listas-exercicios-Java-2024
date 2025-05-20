package br.edu.up.models;

public class Titulacao {
    @SuppressWarnings("unused")
    private String nomeInstituicao;
    @SuppressWarnings("unused")
    private int anoConclusao;
    @SuppressWarnings("unused")
    private String nomeTitulo;
    @SuppressWarnings("unused")
    private String tituloTrabalho;

    public Titulacao (String nomeInstituicao, int anoConclusao, String nomeTitulo, String tituloTrabalho) {
        this.nomeInstituicao = nomeInstituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTrabalho = tituloTrabalho;
    }

}
