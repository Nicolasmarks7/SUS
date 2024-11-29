package Controller;

import Main.Create;
import Model.Paciente;
import View.ViewPaciente;

import java.util.ArrayList;
import java.util.List;

public class ControllerPaciente {

    private static List<Paciente> pacienteList = new ArrayList<Paciente>();
    Create create = new Create();

    //Adiciona um paciente
    public void createPaciente (Paciente paciente){
        paciente = create.pacienteCriar(paciente);
        pacienteList.add(paciente);
        //for(Paciente paciente1:pacienteList)System.out.println(paciente1.getNome());
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
