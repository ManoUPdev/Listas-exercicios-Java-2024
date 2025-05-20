package br.edu.up.models;
import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private String identificador;
    @SuppressWarnings("unused")
    private String curriculo;
    @SuppressWarnings("unused")
    private Professor professor;
    @SuppressWarnings("unused")
    private Set<Aluno> alunosMatriculados;
    @SuppressWarnings("unused")
    private Set<Competencia>competencias;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunosMatriculados = new HashSet<>();
        this.competencias = new HashSet<>();
        
    }
    
}
