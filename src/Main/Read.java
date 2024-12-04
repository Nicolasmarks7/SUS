package Main;

import Controller.*;
import Model.*;

import java.util.List;
import java.util.Objects;

public class Read {

    public static void listagem(int opcao){
        switch(opcao){
            case 1:
                ControllerAgendamento.readAgendamentos();
                break;
            case 2:
                ControllerMedicamento.readMedicamentos();
                break;
            case 3:
                ControllerDispositivo.readDispositivos();
                break;
            case 4:
                ControllerMonitoramento.readMonitoramentos();
                break;
            case 5:
                ControllerAlerta.readAlertas();
                break;
            default:
                break;
        }
    }

    public static Paciente procuraPaciente(String cpf){

        List<Paciente> pacienteList = ControllerPaciente.retornaLista();

        for(Paciente paciente:pacienteList){
            if(paciente.getCpf().equals(cpf))return paciente;
        }

        return null;
    }

    public static Medico procuraMedico(int crm){

        List<Medico> medicoList = ControllerMedico.retornaLista();

        for(Medico medico:medicoList){
            if(medico.getCRM()==crm)return medico;
        }
        return null;
    }

    public static Dispositivo procuraDispositivo(String tipo){

        List<Dispositivo> dispositivoList = ControllerDispositivo.retornaLista();

        for(Dispositivo dispositivo:dispositivoList){
            if(dispositivo.getTipo().equals(tipo))return dispositivo;
        }
        return null;
    }

    public static Medicamento procuraMedicamento(String nome){

        List<Medicamento> medicamentoList = ControllerMedicamento.retornaLista();

        for(Medicamento medicamento:medicamentoList){
            if(medicamento.getNome().equals(nome)) return medicamento;
        }

        return null;
    }

}
