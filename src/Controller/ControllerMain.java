package Controller;

import Main.Login;
import Main.Menu;
import Model.Medico;
import Model.Paciente;

import java.util.ArrayList;

public class ControllerMain {

    private Menu menu = new Menu();

    public ControllerMain(){

        int opcao;

        do{
            opcao = menu.menuInicial();
            switch(opcao){
                case 1:
                    ArrayList<String> login = menu.menuLogin(); //Array esta recebendo o nome e email de login
                    boolean checkMedico = ControllerMedico.checaExistente(login);
                    boolean checkPaciente = ControllerPaciente.checaExistente(login);
                    Login entrar = new Login();
                    entrar.verificador(checkMedico,checkPaciente);
                    break;
                case 2:
                    int opcaoRegistro = menu.menuRegistrar();
                    switch(opcaoRegistro){
                        case 1:
                            ControllerPaciente controllerPaciente = new ControllerPaciente();
                            Paciente paciente = new Paciente();
                            controllerPaciente.createPaciente(paciente);
                            break;
                        case 2:
                            ControllerMedico controllerMedico = new ControllerMedico();
                            Medico medico = new Medico();
                            controllerMedico.createMedico(medico);
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(opcao!=3);

    }

}
