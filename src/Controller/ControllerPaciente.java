package Controller;

import Model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class ControllerPaciente {

    private static List<Paciente> pacienteList = new ArrayList<Paciente>();

    //Adiciona um paciente
    public static void createPaciente (Paciente paciente){
        pacienteList.add(paciente);
    }
    //Visualiza/Busca um paciente
    public static void readPaciente (Paciente paciente){

    }
    //Atualiza um paciente
    public static void updatePaciente (Paciente paciente){

    }
    //Remove um paciente
    public static void removePaciente (Paciente paciente) {
        pacienteList.remove(paciente);
    }
}
