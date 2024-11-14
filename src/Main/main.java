package Main;

import Controller.ControllerUsuario;
import Model.Usuario;
import View.ViewUsuario;

public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        ViewUsuario viewUsuario = new ViewUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario(usuario,viewUsuario);
        
        controllerUsuario.iniciarAutenticacao();
    }
}
