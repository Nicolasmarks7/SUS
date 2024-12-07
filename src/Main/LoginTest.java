package Main;

import Controller.*;
import Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @BeforeEach
    public void setUp() {
        Paciente paciente1 = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        Paciente paciente2 = new Paciente("nome2", "cpf2", "dataNasc2", "endereco2", 985600002, "email2", "historico2");
        ControllerPaciente.retornaLista().add(paciente1);
        ControllerPaciente.retornaLista().add(paciente2);

        Medico medico1 = new Medico("nome1", "especialidade1", 123456, "email1", 985600001);
        Medico medico2 = new Medico("nome2", "especialidade2", 654321, "email2", 985600002);
        ControllerMedico.retornaLista().add(medico1);
        ControllerMedico.retornaLista().add(medico2);
    }

    @Test
    public void testLoginComoMedico() {
        Login login = new Login();
        login.verificador(true, false);
        assertTrue(login.isMedico(), "O login como médico não configurou corretamente o estado.");
    }

    @Test
    public void testLoginComoPaciente() {
        Login login = new Login();
        login.verificador(false, true);
        assertFalse(login.isMedico(), "O login como paciente configurou erroneamente como médico.");
    }

    @Test
    public void testLoginContaNaoEncontrada() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Login login = new Login();
        login.verificador(false, false);

        String mensagem = outputStream.toString();

        assertTrue(mensagem.contains("Conta não encontrada."),
                "A mensagem 'Conta não encontrada.' não foi exibida corretamente.");
    }
}