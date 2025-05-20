package br.edu.up;

import br.edu.up.controller.EmpresaDeEventosController;
import br.edu.up.models.EmpresaDeEventosModel;
import br.edu.up.view.EmpresaDeEventosView;

public class EventoG {
    public static void main(String[] args) {
        EmpresaDeEventosModel model = new EmpresaDeEventosModel();
        EmpresaDeEventosView view = new EmpresaDeEventosView();
        EmpresaDeEventosController controller = new EmpresaDeEventosController(model, view);
        controller.iniciar();
    }
}
