package Main;

import Controller.ControllerAlerta;
import Controller.ControllerDispositivo;
import Controller.ControllerPaciente;
import Model.*;

import java.util.List;
import java.util.Scanner;

public class Remove {

    Menu menu = new Menu();
    Scanner scan = new Scanner(System.in);

    public Dispositivo removerDispositivo(){

        List<Dispositivo> dispositivoList = ControllerDispositivo.retornaLista();
        String tipo;

        do{
            menu.exibirMensagem("Digite o tipo do dispositivo: ");
            tipo = scan.nextLine();
            if(tipo.isEmpty())menu.exibirMensagem("Tipo não pode ser vazio.");
        }while(tipo.isEmpty());


        for(Dispositivo dispositivo:dispositivoList){
            if(dispositivo.getTipo().equals(tipo)){
                menu.exibirMensagem("Dispositivo encontrado, removendo.");
                return dispositivo;
            }
        }
        menu.exibirMensagem("Dispositivo não encontrado.");
        return null;
    }

    public Alerta removerAlerta(){

        List<Alerta> alertaList = ControllerAlerta.retornaLista();
        String tipo,cpf;

        do{
            menu.exibirMensagem("Digite o tipo do alerta: ");
            tipo = scan.nextLine();
            if(tipo.isEmpty())menu.exibirMensagem("Tipo não pode ser vazio.");
        }while(tipo.isEmpty());

        do{
            menu.exibirMensagem("Digitge o cpf do paciente que deseja remover o alerta: ");
            cpf = scan.nextLine();
            if(cpf.length()!=11)menu.exibirMensagem("Digite um cpf válido.");
        }while(cpf.length()!=11);

        for(Alerta alerta:alertaList){
            if(alerta.getTipo().equals(tipo) && alerta.getPaciente().getCpf().equals(cpf)){
                menu.exibirMensagem("Alerta encontrado, removendo.");
                return alerta;
            }
        }
        menu.exibirMensagem("Alerta não encontrado.");
        return null;
    }

    public Paciente removerPrescricao(){


        List<Paciente> pacienteList = ControllerPaciente.retornaLista();
        String cpf;

        do{
            menu.exibirMensagem("Digitge o cpf do paciente que deseja remover a prescrição: ");
            cpf = scan.nextLine();
            if(cpf.length()!=11)menu.exibirMensagem("Digite um cpf válido.");
        }while(cpf.length()!=11);

        for(Paciente paciente:pacienteList){
            if(paciente.getCpf().equals(cpf) && paciente.getMedicamento()!=null){
                menu.exibirMensagem("Paciente com prescrição encontrado, removendo prescrição.");
                return paciente;
            }
        }

        menu.exibirMensagem("Paciente não encontrado ou sem prescrição.");
        return null;
    }

    public static void exclusao(int opcao){

        Remove remove = new Remove();

        switch(opcao){
            case 1:
                Paciente paciente = remove.removerPrescricao();
                ControllerPaciente.removePrescricao(paciente);
                break;
            case 2:
                Dispositivo dispositivo = remove.removerDispositivo();
                ControllerDispositivo.removeDispositivo(dispositivo);
                break;
            case 3:
                Alerta alerta = remove.removerAlerta();
                ControllerAlerta.removeAlerta(alerta);
                break;
            default:
                break;
        }
    }

}
