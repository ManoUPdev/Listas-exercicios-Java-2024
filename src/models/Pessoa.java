package br.edu.up.models;

public class Pessoa {
    private String nome;
    private char rg;

    public Pessoa(String nome, char rg, String matricula) {
        this.nome = nome;
        this.rg = rg;
    }

    public Pessoa(String nome2, String rg2, String matricula) {
        
    }

    public String getNome() {
        return nome;
    }

    public char getRg() {
        return rg;
    }
}
