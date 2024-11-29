package Controller;

import Model.Paciente;
import View.ViewMain;

import java.util.ArrayList;

public class ControllerMain {

    ViewMain view = new ViewMain();

    public ControllerMain(){

        int opcao;
        //view.exibirMensagem(""+opcao);

        do{
            opcao = view.telaInicial();
            switch(opcao){
                case 1:
                    ArrayList<String> login = view.telaLogin();
                    for(int i=0;i<login.size();i++)view.exibirMensagem(""+ login.get(i));
                    //login.clear();
                    break;
                case 2:
                    ControllerPaciente controllerPaciente = new ControllerPaciente();
                    Paciente paciente = new Paciente();
                    controllerPaciente.createPaciente(paciente);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(opcao!=3);

    }

}
