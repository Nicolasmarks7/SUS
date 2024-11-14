package Model;

public class Usuario {

    //Usuario e senha para entrar no app
    private static final String usuariopadrao = "admin";
    private static final String senhapadrao = "admin";

    // Método para autenticar
    public boolean autenticarUsuario(String usuario, String senha) {
        return usuariopadrao.equals(usuario) && senhapadrao.equals(senha);
    }
}
