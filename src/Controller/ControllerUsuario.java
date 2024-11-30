package Controller;

import Main.Menu;
import Model.Usuario;
import View.ViewMain;
import View.ViewUsuario;

import static View.ViewUsuario.scan;

public class ControllerUsuario {

    private final Usuario usuario;
    private final ViewUsuario viewUsuario;
    private final Menu menu;

    public ControllerUsuario(Usuario usuario, ViewUsuario viewUsuario, Menu menu){
        this.usuario = usuario;
        this.viewUsuario = viewUsuario;
        this.menu = menu;
    }

    // Metodo principal para autenticação
    public void iniciarAutenticacao() {

        // Usuário terá 3 tentativas de acerto
        int tentativas = 3;

        while (tentativas > 0) {
            String usuariocontroller = viewUsuario.lerUsuario();
            String senhacontroller = viewUsuario.lerSenha();

            if (usuario.autenticarUsuario(usuariocontroller, senhacontroller)) {
                menu.exibirMensagem("Bem-vindo!\nAcesso concedido.");
                return;
            } else {
                tentativas--;
                menu.exibirMensagem("Usuário ou senha incorretos.");
                if (tentativas > 0) {
                    menu.exibirMensagem("Tentativas restantes: " + tentativas);
                }
            }
        }
        menu.exibirMensagem("Número de tentativas excedido. Acesso bloqueado.");
        scan.close();
    }
}
