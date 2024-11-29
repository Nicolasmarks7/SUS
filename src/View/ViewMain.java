package View;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewMain {

    private Scanner scan = new Scanner(System.in);
    private int opcao;
    private ArrayList<String> login = new ArrayList<>();

    //menu inicial
    public int telaInicial(){
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

    public ArrayList<String> telaLogin(){
        String email = "";
        String senha = "";
        while(email==null || senha==null || email.isEmpty() || senha.isEmpty()){
            exibirMensagem("Digite o email:");
            email = scan.next();
            login.add(email);
            exibirMensagem("Digite a senha:");
            senha = scan.next();
            login.add(senha);
        }

        return login;
    }


    //Metodo para facilitar o sout
    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }

}
