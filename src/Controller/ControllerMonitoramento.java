package Controller;

import Model.Monitoramento;

import java.util.ArrayList;
import java.util.List;

public class ControllerMonitoramento {

    private static List<Monitoramento> monitoramentoList = new ArrayList<Monitoramento>();

    //Adiciona um Monitoramento
    public static void createMonitoramento (Monitoramento monitoramento){
        monitoramentoList.add(monitoramento);
    }
    //Visualiza/Busca um Monitoramento
    public static void readMonitoramento (Monitoramento monitoramento){

    }
    //Atualiza um Monitoramento
    public static void updateMonitoramento (Monitoramento monitoramento){

    }
    //Remove um Monitoramento
    public static void removeMonitoramento (Monitoramento monitoramento) {
        monitoramentoList.remove(monitoramento);
    }
}

