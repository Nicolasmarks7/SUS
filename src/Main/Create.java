package Main;

import Model.Paciente;
import View.ViewMain;

import java.util.Scanner;

public class Create {

    ViewMain view = new ViewMain();
    Scanner scan = new Scanner(System.in);

    public Paciente pacienteCriar(Paciente paciente){

        view.exibirMensagem("Digite o nome: ");
        paciente.setNome(scan.nextLine());
        view.exibirMensagem("Digite o cpf: ");
        paciente.setCpf(scan.nextLine());
        view.exibirMensagem("Digite a data de nascimento no formato dd/mm/aaaa: ");
        paciente.setDataNasc(scan.nextLine());
        view.exibirMensagem("Digite o endereco: ");
        paciente.setEndereco(scan.nextLine());
        view.exibirMensagem("Digite o telefone: ");
        paciente.setTelefone(scan.nextInt());
        view.exibirMensagem("Digite o email: ");
        paciente.setEmail(scan.nextLine());
        view.exibirMensagem("Digite o historico hospitalar: ");
        paciente.setHistorico(scan.nextLine());

        return paciente;
    }

}
