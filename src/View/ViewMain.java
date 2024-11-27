package View;

import java.util.Scanner;

public class ViewMain {

    private Scanner scan = new Scanner(System.in);
    private int opcao;

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


    //Metodo para facilitar o sout
    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }

}
