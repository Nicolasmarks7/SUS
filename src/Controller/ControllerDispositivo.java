package Controller;

import Main.Create;
import Model.Dispositivo;
import Model.Medico;
import View.ViewMain;

import java.util.ArrayList;
import java.util.List;

public class ControllerDispositivo {

    private static List<Dispositivo> dispositivoList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um Dispositivo
    public void createDispositivo (Dispositivo dispositivo){
        dispositivoList.add(create.criarDispositivo(dispositivo));
    }
    //Visualiza/Busca um Dispositivo
    public static void readDispositivo (Dispositivo dispositivo){

    }

    public static void readDispositivos(){
        ViewMain.viewDispositivos(dispositivoList);
    }

    //Atualiza um Dispositivo
    public static void updateDispositivo (Dispositivo dispositivo){

    }
    //Remove um Dispositivo
    public static void removeDispositivo (Dispositivo dispositivo) {
        dispositivoList.remove(dispositivo);
    }

    public static List<Dispositivo> retornaLista(){
        return dispositivoList;
    }
}

