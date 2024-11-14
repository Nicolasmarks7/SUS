package Controller;

import Model.Medico;

import java.util.ArrayList;
import java.util.List;

public class ControllerMedico {

    private static List<Medico> medicoList = new ArrayList<Medico>();

    //Adiciona um médico
    public static void createMedico (Medico medico){
        medicoList.add(medico);
    }
    //Visualiza/Busca um médico
    public static void readMedico (Medico medico){

    }
    //Atualiza um médico
    public static void updateMedico (Medico medico){

    }
    //Remove um médico
    public static void removeMedico (Medico medico) {
        medicoList.remove(medico);
    }
}
