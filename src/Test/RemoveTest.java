package Test;

import Model.*;
import Controller.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class RemoveTest {

    @BeforeEach
    public void setUp() {

        ControllerDispositivo.retornaLista().add(new Dispositivo("tipo1", "marca1", "modelo1", "status1", 50));
        ControllerDispositivo.retornaLista().add(new Dispositivo("tipo2", "marca2", "modelo2", "status2", 50));

        Paciente paciente1 = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        Paciente paciente2 = new Paciente("nome2", "cpf2", "dataNasc2", "endereco2", 985600002, "email2", "historico2");
        ControllerPaciente.retornaLista().add(paciente1);
        ControllerPaciente.retornaLista().add(paciente2);

        ControllerAlerta.retornaLista().add(new Alerta("tipo1", "mensagem1", paciente1, new Medico(), "data1"));
        ControllerAlerta.retornaLista().add(new Alerta("tipo2", "mensagem2", paciente2, new Medico(), "data2"));
    }

    @Test
    public void testRemoverPaciente(){
        Paciente paciente1 = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        ControllerPaciente.retornaLista().add(paciente1);
        ControllerPaciente.removePaciente(paciente1);

        Assertions.assertNotNull(ControllerPaciente.readPaciente("cpf1"));
    }

    @Test
    public void testRemoverPrescricao() {
        Paciente paciente = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        Medicamento medicamento = new Medicamento("nomemedicamento", 50, 20, "descricao", "dataVenc", "prescricao");
        paciente.setMedicamento(medicamento);
        ControllerPaciente.retornaLista().add(paciente);
        ControllerPaciente.removePrescricao("cpf1");

        Assertions.assertNotNull(ControllerPaciente.readPaciente("cpf1"));
    }

    @Test
    public void testRemoverDispositivoPaciente() {
        Paciente paciente = ControllerPaciente.readPaciente("cpf1");
        Dispositivo dispositivo = new Dispositivo("tipo1", "marca1", "modelo1", "status1", 50);

        assert paciente != null;
        paciente.setDispositivo(dispositivo);
        ControllerPaciente.removeDispositivo("cpf1");

        assertNotNull(paciente.getDispositivo());
    }

    @Test
    public void testRemoverDispositivo() {
        ControllerPaciente.removeDispositivo("cpf1");

        assertNotNull(ControllerDispositivo.readDispositivo("tipo1"));
    }

    @Test
    public void testRemoverAlertaPaciente() {
        Paciente paciente = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        ControllerPaciente.retornaLista().add(paciente);
        ControllerAlerta.retornaLista().add(new Alerta("tipo1", "mensagem1", paciente, new Medico(), "data1"));
        Alerta alerta = ControllerAlerta.readAlerta("tipo1", "cpf1");

        ControllerAlerta.removeAlerta(alerta);
        assertNotNull(alerta);
        alerta = ControllerAlerta.readAlerta("tipo1", "cpf2");
        assertNull(alerta);
    }

    // Rodar_com_todo_test.
    @Test
    public void testOpcaoInvalida() {
        assertEquals(5, ControllerPaciente.retornaLista().size());
        assertEquals(4, ControllerDispositivo.retornaLista().size());
        assertEquals(5, ControllerPaciente.retornaLista().size());
        assertEquals(4, ControllerAlerta.retornaLista().size());
    }
}