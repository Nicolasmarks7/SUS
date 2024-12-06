package Controller;

import Main.Create;
import Model.*;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class ControllerPaciente {

    private static List<Paciente> pacienteList = new ArrayList<>();
    Create create = new Create();

    //Adiciona um paciente
    public void createPaciente (Paciente paciente){
        pacienteList.add(create.criarPaciente(paciente));
    }
    //Visualiza/Busca um paciente
    public static void readPaciente (Paciente paciente){

    }

    public static void criaPrescricao(Paciente paciente, Medicamento medicamento){

        for(Paciente p:pacienteList){
            if(p.getCpf().equals(paciente.getCpf())){
                paciente.setMedicamento(medicamento);
                pacienteList.remove(p);
                pacienteList.add(paciente);
            }
        }
    }

    //Visualiza/Busca um Paciente
    public static Paciente readPaciente(String cpf){
        for(Paciente paciente:pacienteList){
            if(paciente.getCpf().equals(cpf))return paciente;
        }

        return null;
    }

    public static void readPacientes(){
        View.viewPacientes(pacienteList);
    }

    //Atualiza um paciente
    public static void updatePaciente (Paciente paciente){

    }
    //Remove um paciente
    public static void removePaciente (Paciente paciente) {
        pacienteList.remove(paciente);
    }

    public static void removePrescricao(String cpf){

        for(Paciente paciente:pacienteList){
            if(paciente.getCpf().equals(cpf)){
                Medicamento novoMedicamento = new Medicamento();
                paciente.setMedicamento(novoMedicamento);
                break;
            }
        }

    }

    public static void addDispositivo(Monitoramento monitoramento){
        Dispositivo dispositivo = monitoramento.getDispositivo();
        Paciente paciente = monitoramento.getPaciente();
        for(Paciente p:pacienteList){
            if(p.getCpf().equals(paciente.getCpf())){
                p.setDispositivo(dispositivo);
            }
        }
    }

    public static void removeDispositivo(String cpf){

        for(Paciente paciente:pacienteList){
            if(paciente.getCpf().equals(cpf)){
                Dispositivo novoDispositivo = new Dispositivo();
                paciente.setDispositivo(novoDispositivo);
            }
        }

    }

    public static boolean checaExistente(ArrayList<String> login){
        boolean check = false;

        return check;
    }

    public static List<Paciente> retornaLista(){
        return pacienteList;
    }

}