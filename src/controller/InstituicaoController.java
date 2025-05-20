package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.models.Aluno;
import br.edu.up.models.Disciplina;
import br.edu.up.models.Professor;

public class InstituicaoController {
    private List<Professor> professores;
    private List<Aluno> alunos;
    @SuppressWarnings("unused")
    private List<Disciplina> disciplina;


    public InstituicaoController() {
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
        disciplina = new ArrayList<>();
    }
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {

    }

}
