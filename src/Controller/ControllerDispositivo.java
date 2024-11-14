package Controller;

import Model.Dispositivo;

import java.util.ArrayList;
import java.util.List;

public class ControllerDispositivo {

    private static List<Dispositivo> dispositivoList = new ArrayList<Dispositivo>();

    //Adiciona um Dispositivo
    public static void createDispositivo (Dispositivo dispositivo){
        dispositivoList.add(dispositivo);
    }
    //Visualiza/Busca um Dispositivo
    public static void readDispositivo (Dispositivo dispositivo){

    }
    //Atualiza um Dispositivo
    public static void updateDispositivo (Dispositivo dispositivo){

    }
    //Remove um Dispositivo
    public static void removeDispositivo (Dispositivo dispositivo) {
        dispositivoList.remove(dispositivo);
    }
}

