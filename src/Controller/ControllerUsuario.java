package Controller;

import Model.Usuario;
import View.ViewMain;
import View.ViewUsuario;

import static View.ViewUsuario.scan;

public class ControllerUsuario {

    private final Usuario usuario;
    private final ViewUsuario viewUsuario;
    private final ViewMain viewMain;

    public ControllerUsuario(Usuario usuario, ViewUsuario viewUsuario, ViewMain viewMain){
        this.usuario = usuario;
        this.viewUsuario = viewUsuario;
        this.viewMain = viewMain;
    }

    // Método principal para autenticação
    public void iniciarAutenticacao() {

        // Usuário terá 3 tentativas de acerto
        int tentativas = 3;

        while (tentativas > 0) {
            String usuariocontroller = viewUsuario.lerUsuario();
            String senhacontroller = viewUsuario.lerSenha();

            if (usuario.autenticarUsuario(usuariocontroller, senhacontroller)) {
                viewMain.exibirMensagem("Bem-vindo!\nAcesso concedido.");
                return;
            } else {
                tentativas--;
                viewMain.exibirMensagem("Usuário ou senha incorretos.");
                if (tentativas > 0) {
                    viewMain.exibirMensagem("Tentativas restantes: " + tentativas);
                }
            }
        }
        viewMain.exibirMensagem("Número de tentativas excedido. Acesso bloqueado.");
        scan.close();
    }
}
