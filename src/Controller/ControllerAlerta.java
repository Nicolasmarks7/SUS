package Controller;


import Model.Alerta;

import java.util.ArrayList;
import java.util.List;

public class ControllerAlerta {

    private static List<Alerta> alertaList = new ArrayList<Alerta>();

    //Adiciona um Alerta
    public static void createAlerta (Alerta alerta){
        alertaList.add(alerta);
    }
    //Visualiza/Busca um Alerta
    public static void readAlerta (Alerta alerta){

    }
    //Atualiza um Alerta
    public static void updateAlerta (Alerta alerta){

    }
    //Remove um Alerta
    public static void removeAlerta (Alerta alerta) {
        alertaList.remove(alerta);
    }
}
