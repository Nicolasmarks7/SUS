package Controller;

import Model.Agendamento;

import java.util.ArrayList;
import java.util.List;

public class ControllerAgendamento {

    private static List<Agendamento> agendamentoList = new ArrayList<Agendamento>();

    //Adiciona um agendamento
    public static void createAgendamento (Agendamento agendamento){
        agendamentoList.add(agendamento);
    }
    //Visualiza/Busca um Agendamento
    public static void readAgendamento (Agendamento agendamento){

    }
    //Atualiza um Agendamento
    public static void updateAgendamento (Agendamento agendamento){

    }
    //Remove um Agendamento
    public static void removeAgendamento (Agendamento agendamento) {
        agendamentoList.remove(agendamento);
    }
}
