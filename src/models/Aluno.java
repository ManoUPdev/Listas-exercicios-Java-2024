package br.edu.up.models;

public class Aluno extends Pessoa {
    @SuppressWarnings("unused")
    private int anoIngresso;
    @SuppressWarnings("unused")
    private String nomeCurso;
    @SuppressWarnings("unused")
    private String turno;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String nomeCurso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }
    
}
