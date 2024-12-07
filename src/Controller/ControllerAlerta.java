package Controller;


import Main.Create;
import Model.Alerta;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerAlerta {

    private static List<Alerta> alertaList = new ArrayList<>();

    //Adiciona um Alerta
    public static void createAlerta (Alerta alerta){
        Create create = new Create();
        if(create.criarAlerta(alerta)!=null)alertaList.add(alerta);
    }

    //Visualiza/Busca um Alerta
    public static Alerta  readAlerta (String tipo, String cpfPaciente) {
        for (Alerta alerta : alertaList) {
            if (alerta.getTipo().equals(tipo) && alerta.getPaciente().getCpf().equals(cpfPaciente)) {
                return alerta;
            }
        }
        return null;

    }

    public static void readAlertas(){
        View.viewAlertas(alertaList);
    }

    //Atualiza um Alerta
    public static void updateAlerta (Alerta alerta){

    }
    //Remove um Alerta
    public static void removeAlerta (Alerta alerta) {
        alertaList.remove(alerta);
    }

    public static List<Alerta> retornaLista(){
        return alertaList;
    }
}
