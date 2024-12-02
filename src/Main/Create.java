package Main;

import Model.Medico;
import Model.Paciente;

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

}