package Controller;

import Main.Create;
import Model.Medico;
import Model.Paciente;
import View.ViewMain;

import java.util.ArrayList;
import java.util.List;

public class ControllerPaciente {

    private static List<Paciente> pacienteList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um paciente
    public void createPaciente (Paciente paciente){
        pacienteList.add(create.criarPaciente(paciente));
    }
    //Visualiza/Busca um paciente
    public static void readPaciente (Paciente paciente){

    }

    public static void readPacientes(){
        ViewMain.viewPacientes(pacienteList);
    }

    //Atualiza um paciente
    public static void updatePaciente (Paciente paciente){

    }
    //Remove um paciente
    public static void removePaciente (Paciente paciente) {
        pacienteList.remove(paciente);
    }

    public static boolean checaExistente(ArrayList<String> login){
        boolean check = false;

        return check;
    }

    public static List<Paciente> retornaLista(){
        return pacienteList;
    }

}