package model;

import java.util.ArrayList;


public class Agenda {
     private ArrayList<Compromisso> compromissos;


public Agenda() {
    compromissos = new ArrayList<>();
}

public void adicionarCompromisso(Compromisso c) {
    compromissos.add(c);
}

public void listarCompromissos(int dia, int mes) {
    System.out.println("Compromissos em " + dia + "/" + mes + ":");
    boolean encontrado = false;

    for (Compromisso c : compromissos) {
        if(c.ocorreEm(dia, mes)) {
            c.exibir();
            encontrado = true;
        }
    }

    if(!encontrado){
        System.out.println("Nenhum compromisso encontrado");
    
     }

   }
}