package br.edu.up.models;

public class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg, matriculaFuncionario);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    @Override
    public String toString() {
        return "Tripulacao{" + "nome='" + getNome() + "'" + ", rg='" + getRg() + "'" + ", identificacaoAeronautica='"
                + identificacaoAeronautica + "'" + ", matriculaFuncionario='" + matriculaFuncionario + "'" + '}';
    }

    public char getRg() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getRg'");
    }

    public String getNome() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}
