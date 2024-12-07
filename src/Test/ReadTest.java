package Test;

import Controller.*;
import Main.Read;
import Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ReadTest {

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
    public void testListagemAgendamentos() {
        ControllerAgendamento.readAgendamentos();
        Agendamento agendamento = new Agendamento();
        agendamento.setDiagnostico("Consulta de rotina");
        ControllerAgendamento.createAgendamento(agendamento);

        Read.listagem(1);

        List<Agendamento> agendamentos = ControllerAgendamento.retornaLista();
        assertNotNull(agendamentos, "A lista de agendamentos não deve ser nula.");
        assertEquals(1, agendamentos.size(), "A lista de agendamentos deve conter exatamente 1 item.");
        assertEquals(agendamento, agendamentos.get(1), "O agendamento retornado não corresponde ao esperado.");
    }

    @Test
    public void testListagemMedicamentos() {
        ControllerMedicamento.readMedicamentos();
        Medicamento medicamento = new Medicamento();
        medicamento.setNome("Paracetamol");
        ControllerMedicamento.createMedicamento(medicamento);

        Read.listagem(2);


        List<Medicamento> medicamentos = ControllerMedicamento.retornaLista();
        assertNotNull(medicamentos, "A lista de medicamentos não deve ser nula.");
        assertEquals(1, medicamentos.size(), "A lista de medicamentos deve conter exatamente 1 item.");
        assertEquals(medicamento, medicamentos.get(1), "O medicamento retornado não corresponde ao esperado.");
    }

    @Test
    public void testListagemOpcaoInvalida() {
        Read.listagem(0);

        assertDoesNotThrow(() -> Read.listagem(1), "Uma opção inválida não deve causar erros.");
    }

    @Test
    public void testListagemAlertas() {
        ControllerAlerta.readAlertas();
        Alerta alerta = new Alerta();
        alerta.setTipo("Alerta de teste");
        ControllerAlerta.createAlerta(alerta);

        Read.listagem(5);

        List<Alerta> alertas = ControllerAlerta.retornaLista();
        assertNotNull(alertas, "A lista de alertas não deve ser nula.");
        assertEquals(1, alertas.size(), "A lista de alertas deve conter exatamente 1 item.");
        assertEquals(alerta, alertas.get(1), "O alerta retornado não corresponde ao esperado.");
    }
}