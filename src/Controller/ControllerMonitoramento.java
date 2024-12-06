package Controller;

import Main.Create;
import Model.Monitoramento;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerMonitoramento {

    private static List<Monitoramento> monitoramentoList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um Monitoramento
    public void createMonitoramento (Monitoramento monitoramento){
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
}