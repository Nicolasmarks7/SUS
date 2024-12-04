package Main;

import Model.*;

import java.util.Scanner;

public class Create {

    Menu menu = new Menu();
    Scanner scan = new Scanner(System.in);

    public Paciente criarPaciente(Paciente paciente){

        menu.exibirMensagem("Digite o nome: ");
        paciente.setNome(scan.nextLine());
        menu.exibirMensagem("Digite o cpf: ");
        paciente.setCpf(scan.nextLine());
        menu.exibirMensagem("Digite o email: ");
        paciente.setEmail(scan.nextLine());
        menu.exibirMensagem("Digite a data de nascimento no formato dd/mm/aaaa: ");
        paciente.setDataNasc(scan.nextLine());
        menu.exibirMensagem("Digite o endereco: ");
        paciente.setEndereco(scan.nextLine());
        menu.exibirMensagem("Digite o historico hospitalar: ");
        paciente.setHistorico(scan.nextLine());
        menu.exibirMensagem("Digite o telefone: ");
        paciente.setTelefone(scan.nextInt());

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

    public Monitoramento criarMonitoramento(Monitoramento monitoramento,
                                            Paciente paciente, Dispositivo dispositivo){

        monitoramento.setPaciente(paciente);
        monitoramento.setDispositivo(dispositivo);
        menu.exibirMensagem("Digite os dados: ");
        monitoramento.setDados(scan.nextLine());

        return monitoramento;
    }

    public Alerta criarAlerta(Alerta alerta, Medico medico, Paciente paciente){

        menu.exibirMensagem("Digite o tipo: ");
        alerta.setTipo(scan.nextLine());
        menu.exibirMensagem("Digite a mensagem: ");
        alerta.setMensagem(scan.nextLine());
        alerta.setPaciente(paciente);
        alerta.setMedico(medico);
        menu.exibirMensagem("Digite a data no formato dd/mm/aaaa: ");
        alerta.setData(scan.nextLine());

        return alerta;
    }

    public Agendamento criarAgendamento(Agendamento agendamento, Paciente paciente,
                                        Medico medico, Medicamento medicamento){

        menu.exibirMensagem("Digite a data no formato dd/mm/aaaa: ");
        agendamento.setData(scan.nextLine());
        menu.exibirMensagem("Digite a hora: ");
        agendamento.setHora(scan.nextLine());
        agendamento.setPaciente(paciente);
        agendamento.setMedico(medico);
        menu.exibirMensagem("Digite o diagnóstico: ");
        agendamento.setDiagnostico(scan.nextLine());
        agendamento.setMedicamento(medicamento);

        return agendamento;
    }

    public static void cadastros(int opcao){

    }

}