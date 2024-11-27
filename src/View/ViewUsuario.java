package View;

import java.util.Scanner;

public class ViewUsuario {

    public static Scanner scan = new Scanner(System.in);


    public String lerUsuario(){
        System.out.println("Digite o usuário: ");
        return scan.nextLine();
    }
    public String lerSenha(){
        System.out.println("Digite a senha: ");
        return scan.nextLine();
    }
}
