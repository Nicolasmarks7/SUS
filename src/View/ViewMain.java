package View;

import Main.Menu;
import Model.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewMain {

    private static Menu menu = new Menu();

    public static void viewAgendamentos(List<Agendamento> agendamentos){

        if(!agendamentos.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Agendamentos---");
            for(Agendamento agendamento:agendamentos){
                menu.exibirMensagem("Agendamento: "+ cont +"\nData: " + agendamento.getData() +
                        "\nHora: " + agendamento.getHora() + "\nNome do paciente: " + agendamento.getPaciente().getNome() +
                        "\nNome do médico: " + agendamento.getMedico().getNome() + "\nDiagnóstico: " + agendamento.getDiagnostico() +
                        "\nMedicamento: " + agendamento.getMedicamento().getNome());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

    public static void viewAlertas(List<Alerta> alertas){

        if(!alertas.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Alertas---");
            for(Alerta alerta:alertas){
                menu.exibirMensagem("Alerta: " + cont + "\nTipo: " + alerta.getTipo() +
                        "\nMensagem: " + alerta.getMensagem() +
                        "\nNome do paciente: " + alerta.getPaciente().getNome() + "\nNome do médico: " + alerta.getMedico().getNome() +
                        "\nData: " + alerta.getData());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

    public static void viewDispositivos(List<Dispositivo> dispositivos){

        if(!dispositivos.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Dispositivos---");
            for(Dispositivo dispositivo:dispositivos){
                menu.exibirMensagem("Dispositivo: " + cont + "\nTipo: " + dispositivo.getTipo() +
                        "\nMarca: " + dispositivo.getMarca() + "\nModelo: " + dispositivo.getModelo() +
                        "\nStatus: " + dispositivo.getStatus() + "\nValor: " + dispositivo.getValor());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

    public static void viewMedicamentos(List<Medicamento> medicamentos){

        if(!medicamentos.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Medicamentos---");
            for(Medicamento medicamento:medicamentos){
                menu.exibirMensagem("Medicamento: " + cont + "\nNome: " + medicamento.getNome() +
                        "\nDosagem: " + medicamento.getDosagem() + "\nFrequência: " + medicamento.getFrequencia() +
                        "\nDescrição: " + medicamento.getDescricao() + "\nData de vencimento: " + medicamento.getDataVenc() +
                        "\nPrescrição: " + medicamento.getPrescricao());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

    public static void viewMedicos(List<Medico> medicos){

        if(!medicos.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Médicos---");
            for(Medico medico:medicos){
                menu.exibirMensagem("Médico: " + cont + "\nNome: " + medico.getNome() +
                        "\nEspecialidade: " + medico.getEspecialidade() + "\nCRM: " + medico.getCRM() +
                        "\nE-mail: " + medico.getEmail() + "\nTelefone: " + medico.getTelefone());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

    public static void viewMonitoramentos(List<Monitoramento> monitoramentos){

        if(!monitoramentos.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Monitoramentos---");
            for(Monitoramento monitoramento:monitoramentos){
                menu.exibirMensagem("Monitoramento: " + cont + "\nNome do paciente: " + monitoramento.getPaciente().getNome() +
                        "\nDispositivo: " + monitoramento.getDispositivo().getTipo() + "\nDados: " + monitoramento.getDados());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

    public static void viewPacientes(List<Paciente> pacientes){

        if(!pacientes.isEmpty()){
            int cont=1;
            menu.exibirMensagem("---Pacientes---");
            for(Paciente paciente:pacientes){
                menu.exibirMensagem("Paciente: " + cont + "\nNome: " + paciente.getNome() +
                        "\nCPF: " + paciente.getCpf() + "\nData de nascimento: " + paciente.getDataNasc() +
                        "\nEndereço: " + paciente.getEndereco() + "\nTelefone: " + paciente.getTelefone() +
                        "\nE-mail: " + paciente.getEmail() + "\nHistórico hospitalar: " + paciente.getHistorico() +
                        "\nMedicamento: " + paciente.getMedicamento().getNome() + "\nDispositivo: " + paciente.getDispositivo().getTipo());
                cont++;
            }
        }else{
            menu.exibirMensagem("Lista vazia");
        }

    }

}