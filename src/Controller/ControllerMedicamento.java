package Controller;

import Main.Create;
import Model.Medicamento;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerMedicamento {

    private static List<Medicamento> medicamentoList = new ArrayList<>();

    //Adiciona um Medicamento
    public static void createMedicamento (Medicamento medicamento){
        Create create = new Create();
        medicamentoList.add(create.criarMedicamento(medicamento));
    }
    //Visualiza/Busca um Medicamento
    public static Medicamento readMedicamento (String nome){

        for(Medicamento medicamento:medicamentoList){
            if(medicamento.getNome().equals(nome)) return medicamento;
        }

        return null;

    }

    public static void readMedicamentos(){
        View.viewMedicamentos(medicamentoList);
    }

    //Atualiza um Medicamento
    public static void updateMedicamento (Medicamento medicamento){

    }
    //Remove um Medicamento
    public static void removeMedicamento (Medicamento medicamento) {
        medicamentoList.remove(medicamento);
    }

    public static List<Medicamento> retornaLista(){
        return medicamentoList;
    }

}
