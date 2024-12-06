package Main;

import Controller.*;
import Model.*;

import java.util.List;

public class Read {

    public static void listagem(int opcao){
        switch(opcao){
            case 1:
                ControllerAgendamento.readAgendamentos();
                break;
            case 2:
                ControllerMedicamento.readMedicamentos();
                break;
            case 3:
                ControllerDispositivo.readDispositivos();
                break;
            case 4:
                ControllerMonitoramento.readMonitoramentos();
                break;
            case 5:
                ControllerAlerta.readAlertas();
                break;
            case 6:
                ControllerPaciente.readPacientes();
                break;
            default:
                break;
        }
    }
}
