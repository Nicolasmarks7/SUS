package Controller;

import Main.Login;
import Main.Menu;
import Model.Medico;
import Model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class ControllerMain {

    private Menu menu = new Menu();

    public ControllerMain(){

        int opcao;
        ArrayList<String> login = new ArrayList<>();

        do{
            opcao = menu.menuInicial();
            boolean checkMedico = false;
            boolean checkPaciente = false;
            switch(opcao){
                case 1:
                    login.clear();
                    login = menu.menuLogin(); //Array esta recebendo o nome e email de login
                    List<Medico> medicoList = ControllerMedico.retornaLista();
                    for(Medico medico: medicoList){
                        if(medico.getNome().equals(login.get(0)) && medico.getEmail().equals(login.get(1))) {
                            checkMedico = true;
                            break;
                        }
                    }
                    if(!checkMedico){
                        List<Paciente> pacienteList = ControllerPaciente.retornaLista();
                        for (Paciente paciente:pacienteList){
                            if(paciente.getNome().equals(login.get(0)) && paciente.getEmail().equals(login.get(1))) {
                                checkPaciente = true;
                                break;
                            }
                        }
                    }
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
