package Main;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class Create {

    Menu menu = new Menu();
    Scanner scan = new Scanner(System.in);

    public Paciente criarPaciente(Paciente paciente){

        String nome,cpf,email,data,endereco,historico,telefone;

        do{
            menu.exibirMensagem("Digite o nome: ");
            nome = scan.nextLine();
            if(!nome.isEmpty()){
                paciente.setNome(nome);
            }else{
                menu.exibirMensagem("Nome não pode ser vazio.");
            }
        }while(nome.isEmpty());

        do{
            menu.exibirMensagem("Digite o cpf: ");
            cpf = scan.nextLine();
            if(cpf.length()==11){
                paciente.setCpf(cpf);
            }else{
                menu.exibirMensagem("CPF precisa ter 11 dígitos.");
            }
        }while(cpf.length()!=11);

        do{
            menu.exibirMensagem("Digite o email: ");
            email = scan.nextLine();
            if(!email.isEmpty()){
                paciente.setEmail(email);
            }else{
                menu.exibirMensagem("E-mail não pode ser vazio.");
            }
        }while(email.isEmpty());

        do{
            menu.exibirMensagem("Digite a data de nascimento no formato dd/mm/aaaa: ");
            data = scan.nextLine();
            if(!data.isEmpty()){
                paciente.setDataNasc(data);
            }else{
                menu.exibirMensagem("Data não pode ser vazio.");
            }
        }while(data.isEmpty());

        do{
            menu.exibirMensagem("Digite o endereco: ");
            endereco = scan.nextLine();
            if(!endereco.isEmpty()){
                paciente.setEndereco(endereco);
            }else{
                menu.exibirMensagem("Endereço não pode ser vazio.");
            }
        }while(endereco.isEmpty());

        do{
            menu.exibirMensagem("Digite o histórico hospitalar: ");
            historico = scan.nextLine();
            if(!historico.isEmpty()){
                paciente.setHistorico(historico);
            }else{
                menu.exibirMensagem("Histórico não pode ser vazio.");
            }
        }while(historico.isEmpty());

        do{
            menu.exibirMensagem("Digite o telefone: ");
            telefone = scan.nextLine();
            if(telefone.length()==9){
                paciente.setTelefone(Integer.parseInt(telefone));
            }else{
                menu.exibirMensagem("Telefone precisa ter 9 dígitos.");
            }

        }while(telefone.length()!=9);

        return paciente;
    }

    public Medico criarMedico(Medico medico){

        menu.exibirMensagem("Digite o nome: ");
        medico.setNome(scan.nextLine());
        menu.exibirMensagem("Digite o email: ");
        medico.setEmail(scan.nextLine());
        menu.exibirMensagem("Digite a especialidade: ");
        medico.setEspecialidade(scan.nextLine());
        menu.exibirMensagem("Digite o CRM: ");
        medico.setCRM(scan.nextInt());
        menu.exibirMensagem("Digite o telefone: ");
        medico.setTelefone(scan.nextInt());

        return medico;
    }

    public Medicamento criarMedicamento(Medicamento medicamento){

        menu.exibirMensagem("Digite o nome: ");
        medicamento.setNome(scan.nextLine());
        menu.exibirMensagem("Digite a dosagem: ");
        medicamento.setDosagem(scan.nextInt());
        scan.nextLine();
        menu.exibirMensagem("Digite a frequência em horas: ");
        medicamento.setFrequencia(scan.nextInt());
        scan.nextLine();
        menu.exibirMensagem("Digite a descrição: ");
        medicamento.setDescricao(scan.nextLine());
        menu.exibirMensagem("Digite a data de vencimento no formato dd/mm/aaaa: ");
        medicamento.setDataVenc(scan.nextLine());
        menu.exibirMensagem("Digite a prescrição: ");
        medicamento.setPrescricao(scan.nextLine());

        return medicamento;
    }

    public Dispositivo criarDispositivo(Dispositivo dispositivo){

        menu.exibirMensagem("Digite o tipo: ");
        dispositivo.setTipo(scan.nextLine());
        menu.exibirMensagem("Digite a marca: ");
        dispositivo.setMarca(scan.nextLine());
        menu.exibirMensagem("Digite o modelo: ");
        dispositivo.setModelo(scan.nextLine());
        menu.exibirMensagem("Digite o status: ");
        dispositivo.setStatus(scan.nextLine());
        menu.exibirMensagem("Digite o valor: ");
        dispositivo.setValor(scan.nextInt());

        return dispositivo;
    }

    public Monitoramento criarMonitoramento(Monitoramento monitoramento){

        int tentativas = 0;
        int tentativas2 = 0;

        do{
            menu.exibirMensagem("Digite o CPF do paciente: ");
            Paciente paciente = Read.procuraPaciente(scan.nextLine());
            if(paciente!=null){
                monitoramento.setPaciente(paciente);
                break;
            }else{
                menu.exibirMensagem("Paciente não encontrado com esse CPF.");
                tentativas++;
            }
        }while(tentativas<3);

        if(monitoramento.getPaciente()==null){
            menu.exibirMensagem("Não foi possível criar um monitoramento.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o tipo do dispositivo: ");
            Dispositivo dispositivo = Read.procuraDispositivo(scan.nextLine());
            if(dispositivo!=null){
                monitoramento.setDispositivo(dispositivo);
                break;
            }else{
                menu.exibirMensagem("Dispositivo não encontrado.");
                tentativas2++;
            }
        }while(tentativas2<3);

        if(monitoramento.getDispositivo()==null){
            menu.exibirMensagem("Não foi possível criar um monitoramento.");
            return null;
        }

        menu.exibirMensagem("Digite os dados: ");
        monitoramento.setDados(scan.nextLine());

        return monitoramento;
    }

    public Alerta criarAlerta(Alerta alerta){

        int tentativas = 0;
        int tentativas2 = 0;

        menu.exibirMensagem("Digite o tipo: ");
        alerta.setTipo(scan.nextLine());
        menu.exibirMensagem("Digite a mensagem: ");
        alerta.setMensagem(scan.nextLine());

        do{
            menu.exibirMensagem("Digite o CPF do paciente: ");
            Paciente paciente = Read.procuraPaciente(scan.nextLine());
            if(paciente!=null){
                alerta.setPaciente(paciente);
                break;
            }else{
                menu.exibirMensagem("Paciente não encontrado com esse CPF.");
                tentativas++;
            }
        }while(tentativas<3);

        if(alerta.getPaciente()==null){
            menu.exibirMensagem("Não foi possível criar um alerta.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o CRM do médico: ");
            Medico medico = Read.procuraMedico(scan.nextInt());
            if(medico!=null){
                alerta.setMedico(medico);
                break;
            }else{
                menu.exibirMensagem("Médico não encontrado com esse CRM.");
                tentativas2++;
            }
        }while(tentativas2<3);

        if(alerta.getMedico()==null){
            menu.exibirMensagem("Não foi possível criar um alerta.");
            return null;
        }

        menu.exibirMensagem("Digite a data no formato dd/mm/aaaa: ");
        alerta.setData(scan.nextLine());

        return alerta;
    }

    public Agendamento criarAgendamento(Agendamento agendamento){

        int tentativas = 0;
        int tentativas2 = 0;
        int tentativas3 = 0;

        menu.exibirMensagem("Digite a data no formato dd/mm/aaaa: ");
        agendamento.setData(scan.nextLine());
        menu.exibirMensagem("Digite a hora: ");
        agendamento.setHora(scan.nextLine());

        do{
            menu.exibirMensagem("Digite o CPF do paciente: ");
            Paciente paciente = Read.procuraPaciente(scan.nextLine());
            if(paciente!=null){
                agendamento.setPaciente(paciente);
                break;
            }else{
                menu.exibirMensagem("Paciente não encontrado com esse CPF.");
                tentativas++;
            }
        }while(tentativas<3);

        if(agendamento.getPaciente()==null){
            menu.exibirMensagem("Não foi possível criar um agendamento.");
            return null;
        }

        do{
            menu.exibirMensagem("Digite o CRM do médico: ");
            Medico medico = Read.procuraMedico(scan.nextInt());
            if(medico!=null){
                agendamento.setMedico(medico);
                break;
            }else{
                menu.exibirMensagem("Médico não encontrado com esse CRM.");
                tentativas2++;
            }
        }while(tentativas2<3);

        if(agendamento.getMedico()==null){
            menu.exibirMensagem("Não foi possível criar um agendamento.");
            return null;
        }


        menu.exibirMensagem("Digite o diagnóstico: ");
        agendamento.setDiagnostico(scan.nextLine());

        do{
            menu.exibirMensagem("Digite o nome do medicamento: ");
            Medicamento medicamento = Read.procuraMedicamento(scan.nextLine());
            if(medicamento!=null){
                agendamento.setMedicamento(medicamento);
                break;
            }else{
                menu.exibirMensagem("Medicamento não encontrado com esse nome.");
                tentativas3++;
            }
        }while(tentativas3<3);

        if(agendamento.getMedicamento()==null){
            menu.exibirMensagem("Não foi possível criar um agendamento.");
            return null;
        }

        return agendamento;
    }

    public static void cadastros(int opcao){
        switch(opcao){
            case 1:
                Medicamento medicamento = new Medicamento();
                ControllerMedicamento controllerMedicamento = new ControllerMedicamento();
                controllerMedicamento.createMedicamento(medicamento);
                break;
            case 2:
                Dispositivo dispositivo = new Dispositivo();
                ControllerDispositivo controllerDispositivo = new ControllerDispositivo();
                controllerDispositivo.createDispositivo(dispositivo);
                break;
            case 3:
                Monitoramento monitoramento = new Monitoramento();
                ControllerMonitoramento controllerMonitoramento = new ControllerMonitoramento();
                controllerMonitoramento.createMonitoramento(monitoramento);
                break;
            case 4:
                Alerta alerta = new Alerta();
                ControllerAlerta controllerAlerta = new ControllerAlerta();
                controllerAlerta.createAlerta(alerta);
                break;
            case 5:
                Agendamento agendamento = new Agendamento();
                ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
                controllerAgendamento.createAgendamento(agendamento);
                break;
            default:
                break;
        }
    }
}