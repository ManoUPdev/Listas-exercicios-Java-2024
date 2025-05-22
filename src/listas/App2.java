import model.Agenda;
import model.Compromisso;

public class App2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
    
    //Criando  compromissos
    Compromisso c1 = new Compromisso("Joao", "Sala 101", "Reuniao de Projeto", 14,15, 6);
    Compromisso c2 = new Compromisso("Maria", "Escritorio Central", "Entrevista", 9, 15, 6);
    Compromisso c3 = new Compromisso("Fred", "Sala de Reuniao", "Apresentacao de resultados", 11, 20, 7);

// Adicionando a agenda
    agenda.adicionarCompromisso(c1);
    agenda.adicionarCompromisso(c2);
    agenda.adicionarCompromisso(c3);

// Listando compromissos de um dia especifico
    agenda.listarCompromissos(15,6);
    agenda.listarCompromissos(20,7);
    agenda.listarCompromissos(11,20);
    
}}
