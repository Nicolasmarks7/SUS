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
            exibirMensagem("---Menu Inicial---\n1- Login\n2- Registrar\n3- Sair\nDigite a opcão desejada:");
            opcao = scan.nextInt();
            scan.nextLine();
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
            scan.nextLine();
            switch(opcao){
                case 1:
                    return opcao;
                case 2:
                    exibirMensagem("Você precisa de permissão para registrar-se como médico.\nUsuario: ");
                    String usuario = scan.nextLine();
                    exibirMensagem("Senha: ");
                    String senha = scan.nextLine();
                    if(usuario.equals("admin") && senha.equals("admin")){
                        exibirMensagem("Permissão concedida.");
                        return opcao;
                    }else{
                        exibirMensagem("Autenticação falhou.");
                        break;
                    }
                case 3:
                    exibirMensagem("-------------------");
                    break;
                default:
                    exibirMensagem("Digite novamente.");
                    break;
            }
        }while(opcao<1||opcao>3);
        return 3;
    }

    public ArrayList<String> menuLogin(){
        login.clear();
        String nome,email;

        exibirMensagem("---Faça seu login---");
            do{
                exibirMensagem("Digite o nome: ");
                nome = scan.nextLine();
                if(!nome.isEmpty()){
                login.add(nome);
                }else{
                    exibirMensagem("O Nome não pode ser vazio.");
                }
            }while(nome.isEmpty());

            do{
                exibirMensagem("Digite o email: ");
                email = scan.nextLine();
                if(!email.isEmpty()){
                    login.add(email);
                }else{
                exibirMensagem("O E-mail não pode ser vazio.");
                }
            }while(email.isEmpty());

        return login;
    }

    public void menuLogado(boolean isMedico){
        int opcaoMenu;
        if(isMedico){
            do{
                exibirMensagem("---Menu Médico---\n1-Cadastro\n2-Listagem\n3-Alteração\n4-Exclusão\n5-Voltar");
                opcao = scan.nextInt();
                switch(opcao){
                    case 1:
                        exibirMensagem("---Menu Cadastro---\n1-Cadastrar Medicamento\n2-Cadastrar Dispositivo\n3-Cadastrar Monitoramento" +
                                "\n4-Cadastrar Alerta\n5-Criar prescrição\n6- Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<6){
                            Create.cadastros(opcaoMenu);
                        }else if(opcaoMenu==6){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 2:
                        exibirMensagem("---Menu Listagem---\n1-Listar Agendamentos\n2-Listar Medicamento\n3-Listar Dispositivo" +
                                "\n4-Listar Monitoramento\n5-Listar Alerta\n6-Listar Pacientes.\n7-Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<7){
                            Read.listagem(opcaoMenu);
                        }else if(opcaoMenu==7){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 3:
                        exibirMensagem("---Menu Alteração---\n1-Alterar Medicamento\n2-Alterar seus dados\n3-Alterar dados do paciente\n4- Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<4){
                            Update.atualizar(opcaoMenu);
                        }else if(opcaoMenu==4){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 4:
                        exibirMensagem("---Menu Exclusão---\n1-Remover Prescrição \n2-Remover dispositivo do paciente\n3-Excluir Dispositivo" +
                                "\n4-Excluir Alerta\n5-Voltar");
                        opcaoMenu=scan.nextInt();
                        if(opcaoMenu>0&&opcaoMenu<5){
                            Remove.exclusao(opcaoMenu);
                        }else if(opcaoMenu==5){

                        }else{
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 5:
                        exibirMensagem("Voltando.");
                        break;
                    default:
                        exibirMensagem("Opção inválida.");
                        break;
                }
            }while(opcao!=5);
        }else{
            do {
                exibirMensagem("---Menu Paciente---\n1-Cadastrar Agendamento\n2-Listagem\n3-Voltar");
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        Create.cadastros(6);
                        break;
                    case 2:
                        exibirMensagem("---Menu Listagem---\n1-Listar Agendamentos\n2-Listar Medicamento\n3-Listar Dispositivo" +
                                "\n4-Listar Monitoramento\n5- Listar Alerta\n6-Voltar.");
                        opcaoMenu = scan.nextInt();
                        if (opcaoMenu > 0 && opcaoMenu < 6) {
                            Read.listagem(opcaoMenu);
                        } else if (opcaoMenu == 6) {

                        } else {
                            exibirMensagem("Opção inválida");
                        }
                        break;
                    case 3:
                        exibirMensagem("Voltando.");
                        break;
                    default:
                        exibirMensagem("Opção inválida.");
                        break;
                }
            }while(opcao!=3);
        }
    }

    //Metodo para facilitar o sout
    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }

}