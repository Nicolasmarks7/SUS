package Controller;

import Main.Create;
import Model.Agendamento;
import Model.Dispositivo;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerAgendamento {

    private static List<Agendamento> agendamentoList = new ArrayList<>();

    static Create create = new Create();
    //Adiciona um agendamento
    public static void createAgendamento (Agendamento agendamento){
        create = new Create();
        if(create.criarAgendamento(agendamento)!=null)agendamentoList.add(agendamento);
    }
    //Visualiza/Busca um Agendamento
    public static void readAgendamento (Agendamento agendamento){

    }

    public static void readAgendamentos(){
        View.viewAgendamentos(agendamentoList);
    }

    //Atualiza um Agendamento
    public static void updateAgendamento (Agendamento agendamento){

    }
    //Remove um Agendamento
    public static void removeAgendamento (Agendamento agendamento) {
        agendamentoList.remove(agendamento);
    }
    public static List<Agendamento> retornaLista(){
        return agendamentoList;
    }
}
