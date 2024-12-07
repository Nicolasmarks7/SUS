package Controller;

import Main.Create;
import Model.Medico;
import Model.Monitoramento;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerMonitoramento {

    private static List<Monitoramento> monitoramentoList = new ArrayList<>();

    //Adiciona um Monitoramento
    public static void createMonitoramento (Monitoramento monitoramento){
        Create create = new Create();
        if(create.criarMonitoramento(monitoramento)!=null){
            monitoramentoList.add(monitoramento);
            ControllerPaciente.addDispositivo(monitoramento);
        }

    }
    //Visualiza/Busca um Monitoramento
    public static void readMonitoramento (Monitoramento monitoramento){

    }

    public static void readMonitoramentos(){
        View.viewMonitoramentos(monitoramentoList);
    }

    //Atualiza um Monitoramento
    public static void updateMonitoramento (Monitoramento monitoramento){

    }
    //Remove um Monitoramento
    public static void removeMonitoramento (String cpf) {
        monitoramentoList.removeIf(monitoramento -> monitoramento.getPaciente().getCpf().equals(cpf));
    }
    public static List<Monitoramento> retornaLista(){
        return monitoramentoList;
    }
}