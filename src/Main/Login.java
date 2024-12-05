package Main;

public class Login {

    private Menu menu = new Menu();
    private boolean isMedico = false;

    public void verificador(boolean verificaMedico, boolean verificaPaciente){
        if(verificaMedico || verificaPaciente){
            menu.exibirMensagem("Login efetuado.");
            if(verificaMedico) isMedico = true;
            menu.menuLogado(isMedico); // se isMedico for true é medico, se não, é paciente
        }else{
            menu.exibirMensagem("Conta não encontrada.");
        }
    }
}
