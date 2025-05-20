package br.edu.up;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.Comercial;
import br.edu.up.models.Compromisso;

public class Agenda {
    private List<Compromisso> compromissos;

    // Construtor
    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    // Método para adicionar um compromisso na agenda
    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos.add(compromisso);
    }

    // Método para listar todos os compromissos
    public void listarCompromissos() {
        for (Compromisso compromisso : compromissos) {
            System.out.println("Assunto: " + compromisso.getAssunto());
            System.out.println("Pessoa: " + compromisso.getPessoa());
            System.out.println("Local: " + compromisso.getLocal());
            System.out.println("Data: " + compromisso.getData() + "/" + compromisso.getClass() + "/" + compromisso.getAssunto());
            System.out.println("Hora: " + compromisso.getHora() + "h");
            System.out.println("-------------------------------------------");
        }
    }

    public void listarContatos() {
        
        throw new UnsupportedOperationException("Unimplemented method 'listarContatos'");
    }

    public void adicionar(Pessoal contato) {
        
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    public void adicionar(Comercial contato) {
        
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    public void excluirContato(int codigo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'excluirContato'");
    }

    public void getContato(int codigo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getContato'");
    }
}
