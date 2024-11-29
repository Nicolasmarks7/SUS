package View;

import Model.Paciente;

import javax.swing.text.View;
import java.util.Scanner;

public class ViewPaciente {

    ViewMain view = new ViewMain();
    Scanner scan = new Scanner(System.in);

    public Paciente pacienteCriado(){

        view.exibirMensagem("Digite o nome: ");
        String nome = scan.nextLine();
        view.exibirMensagem("Digite o cpf: ");
        String cpf = scan.nextLine();
        view.exibirMensagem("Digite a data de nascimento no formato dd/mm/aaaa: ");
        String dataNasc = scan.nextLine();
        view.exibirMensagem("Digite o endereco: ");
        String endereco = scan.nextLine();
        view.exibirMensagem("Digite o telefone: ");
        int telefone = scan.nextInt();
        view.exibirMensagem("Digite o email: ");
        String email = scan.nextLine();
        view.exibirMensagem("Digite o historico hospitalar: ");
        String historico = scan.nextLine();

        return new Paciente(nome,cpf,dataNasc,endereco,telefone,email,historico);
    }

}
//String nome, String cpf, String dataNasc, String endereco, int telefone, String email, String historico