package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.InstituicaoController;

public class InstituicaoView {
    @SuppressWarnings("unused")
    private InstituicaoController controller;
    @SuppressWarnings("unused")
    private Scanner scanner;

    public InstituicaoView(InstituicaoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }
    
}
