package Controller;

import Main.Create;
import Model.Dispositivo;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerDispositivo {

    private static List<Dispositivo> dispositivoList = new ArrayList<>();

    //Adiciona um Dispositivo
    public static void createDispositivo (Dispositivo dispositivo){
        Create create = new Create();
        dispositivoList.add(create.criarDispositivo(dispositivo));
    }
    //Visualiza/Busca um Dispositivo
    public static Dispositivo readDispositivo (String tipo){

        for(Dispositivo dispositivo:dispositivoList){
            if(dispositivo.getTipo().equals(tipo))return dispositivo;
        }
        return null;

    }

    public static void readDispositivos(){
        View.viewDispositivos(dispositivoList);
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

