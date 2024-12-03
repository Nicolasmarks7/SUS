package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner scan = new Scanner(System.in);
    private int opcao;
    private ArrayList<String> login = new ArrayList<>();

    //Menu inicial
    public int menuInicial(){
        do{
            exibirMensagem("1- Login\n2- Registrar\n3- Sair\nDigite a opcão desejada:");
            opcao = scan.nextInt();
            switch(opcao){
                case 1,2:
                    return opcao;
                case 3:
                    exibirMensagem("Saindo...");
                    break;
                default:
                    exibirMensagem("Digite novamente.");
                    break;
            }
        }while(opcao<1||opcao>3);
        return opcao;
    }

    public int menuRegistrar(){
        do{
            exibirMensagem("1-Cadastrar paciente\n2-Cadastrar médico\n3-Voltar\nDigite a opção desejada:");
            opcao=scan.nextInt();
            switch(opcao){
                case 1,2:
                    return opcao;
                case 3:
                    exibirMensagem("-------------------");
                    break;
                default:
                    exibirMensagem("Digite novamente.");
                    break;
            }
        }while(opcao<1||opcao>3);
        return opcao;
    }

    public ArrayList<String> menuLogin(){
        login.clear();
        String nome = "";
        String email = "";
        while(nome==null || email==null || nome.isEmpty() || email.isEmpty()){
            exibirMensagem("Digite o nome:");
            nome = scan.next();
            login.add(nome);
            exibirMensagem("Digite o email:");
            email = scan.next();
            login.add(email);
        }

        return login;
    }

    public void menuLogado(boolean isMedico){
        int opcaoMenu;
        if(isMedico){
            do{
                exibirMensagem("---Menu Médico---\n1-Cadastro\n2-Listagem\n3-Alteração\n4-Exclusão");
                opcao = scan.nextInt();
                switch(opcao){
                    case 1:
                        exibirMensagem("---Menu Cadastro---\n1-Cadastrar Medicamento\n2-Cadastrar Dispositivo\n3-Cadastrar Monitoramento" +
                                "\n4-Cadastrar Alerta\n5- Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<5){
                            Create.cadastros(opcaoMenu);
                        }else if(opcao==5){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 2:
                        exibirMensagem("---Menu Listagem---\n1-Listar Medicamento\n2-Listar Dispositivo\n3-Listar Monitoramento" +
                                "\n4-Listar Alerta\n5- Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<5){
                            Read.listagem(opcaoMenu);
                        }else if(opcao==5){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 3:
                        exibirMensagem("---Menu Alteração---\n1-Alterar Medicamento\n2-Alterar Dispositivo\n3-Alterar Monitoramento" +
                                "\n4-Alterar Alerta\n5- Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<5){
                            Update.atualizar(opcaoMenu);
                        }else if(opcao==5){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 4:
                        exibirMensagem("---Menu Exclusão---\n1-Excluir Medicamento\n2-Excluir Dispositivo\n3-Excluir Monitoramento" +
                                "\n4-Excluir Alerta\n5- Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<5){
                            Remove.exclusao(opcaoMenu);
                        }else if(opcao==5){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    default:
                        exibirMensagem("Opção inválida.");
                        break;
                }
            }while(opcao<1||opcao>4);
        }else{

        }
    }


    //Metodo para facilitar o sout
    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }

}