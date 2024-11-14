package Controller;

import Model.Usuario;
import View.ViewUsuario;

import static View.ViewUsuario.scan;

public class ControllerUsuario {

    private final Usuario usuario;
    private final ViewUsuario viewUsuario;

    public ControllerUsuario(Usuario usuario, ViewUsuario viewUsuario){
        this.usuario = usuario;
        this.viewUsuario = viewUsuario;
    }

    // Método principal para autenticação
    public void iniciarAutenticacao() {

        // Usuário terá 3 tentativas de acerto
        int tentativas = 3;

        while (tentativas > 0) {
            String usuariocontroller = viewUsuario.lerUsuario();
            String senhacontroller = viewUsuario.lerSenha();

            if (usuario.autenticarUsuario(usuariocontroller, senhacontroller)) {
                viewUsuario.exibirMensagem("Bem-vindo!\nAcesso concedido.");
                return;
            } else {
                tentativas--;
                viewUsuario.exibirMensagem("Usuário ou senha incorretos.");
                if (tentativas > 0) {
                    viewUsuario.exibirMensagem("Tentativas restantes: " + tentativas);
                }
            }
        }
        viewUsuario.exibirMensagem("Número de tentativas excedido. Acesso bloqueado.");
        scan.close();
    }
}
