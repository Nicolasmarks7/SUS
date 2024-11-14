package Controller;

import Model.Medicamento;

import java.util.ArrayList;
import java.util.List;

public class ControllerMedicamento {

    private static List<Medicamento> medicamentoList = new ArrayList<Medicamento>();

    //Adiciona um Medicamento
    public static void createMedicamento (Medicamento medicamento){
        medicamentoList.add(medicamento);
    }
    //Visualiza/Busca um Medicamento
    public static void readMedicamento (Medicamento medicamento){

    }
    //Atualiza um Medicamento
    public static void updateMedicamento (Medicamento medicamento){

    }
    //Remove um Medicamento
    public static void removeMedicamento (Medicamento medicamento) {
        medicamentoList.remove(medicamento);
    }
}
