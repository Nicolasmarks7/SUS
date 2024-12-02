package Main;

public class Login {

    Menu menu = new Menu();

    public void verificador(boolean verificaMedico, boolean verificaPaciente){
        if(verificaMedico || verificaPaciente){
            menu.exibirMensagem("Login efetuado.");
        }else{
            menu.exibirMensagem("Conta não encontrada.");
        }
    }

}
