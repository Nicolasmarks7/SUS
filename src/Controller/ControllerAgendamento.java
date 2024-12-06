package Controller;

import Main.Create;
import Model.Agendamento;
import View.ViewMain;

import java.util.ArrayList;
import java.util.List;

public class ControllerAgendamento {

    private static List<Agendamento> agendamentoList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um agendamento
    public void createAgendamento (Agendamento agendamento){
        if(create.criarAgendamento(agendamento)!=null)agendamentoList.add(agendamento);
    }
    //Visualiza/Busca um Agendamento
    public static void readAgendamento (Agendamento agendamento){

    }

    public static void readAgendamentos(){
        ViewMain.viewAgendamentos(agendamentoList);
    }

    //Atualiza um Agendamento
    public static void updateAgendamento (Agendamento agendamento){

    }
    //Remove um Agendamento
    public static void removeAgendamento (Agendamento agendamento) {
        agendamentoList.remove(agendamento);
    }
}
