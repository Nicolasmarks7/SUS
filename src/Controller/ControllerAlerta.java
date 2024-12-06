package Controller;


import Main.Create;
import Model.Alerta;
import Model.Dispositivo;
import View.ViewMain;

import java.util.ArrayList;
import java.util.List;

public class ControllerAlerta {

    private static List<Alerta> alertaList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um Alerta
    public void createAlerta (Alerta alerta){
        if(create.criarAlerta(alerta)!=null)alertaList.add(alerta);
    }
    //Visualiza/Busca um Alerta
    public static void readAlerta (Alerta alerta){

    }

    public static void readAlertas(){
        ViewMain.viewAlertas(alertaList);
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
