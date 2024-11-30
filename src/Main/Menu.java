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


    //Metodo para facilitar o sout
    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }

}
