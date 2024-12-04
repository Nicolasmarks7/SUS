package Controller;

import Main.Create;
import Model.Medicamento;
import Model.Medico;
import View.ViewMain;

import java.util.ArrayList;
import java.util.List;

public class ControllerMedicamento {

    private static List<Medicamento> medicamentoList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um Medicamento
    public void createMedicamento (Medicamento medicamento){
        medicamentoList.add(create.criarMedicamento(medicamento));
    }
    //Visualiza/Busca um Medicamento
    public static void readMedicamento (Medicamento medicamento){

    }

    public static void readMedicamentos(){
        ViewMain.viewMedicamentos(medicamentoList);
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
