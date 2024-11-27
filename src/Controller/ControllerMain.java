package Controller;

import View.ViewMain;

public class ControllerMain {

    ViewMain view = new ViewMain();

    public ControllerMain(){
        int opcao = view.telaInicial();
        view.exibirMensagem(""+opcao);
    }

}
