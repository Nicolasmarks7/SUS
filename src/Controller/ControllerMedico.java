package Controller;

import Main.Create;
import Model.Medico;
import java.util.ArrayList;
import java.util.List;

public class ControllerMedico {

    private static List<Medico> medicoList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um médico
    public void createMedico (Medico medico){
        medicoList.add(create.criarMedico(medico));
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

    public static boolean checaExistente(ArrayList<String> login){
        boolean check = false;

        return check;
    }

    public static List<Medico> retornaLista(){
        return medicoList;
    }

}