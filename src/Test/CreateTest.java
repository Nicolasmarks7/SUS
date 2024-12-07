package Test;

import Controller.*;
import Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CreateTest {

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
    public void testCreateAgendamento() {
        Agendamento agendamento = new Agendamento();
        agendamento.setPaciente(new Paciente());
        agendamento.setDiagnostico("Consulta de rotina");

        ControllerAgendamento.createAgendamento(agendamento);
        List<Agendamento> agendamentos = ControllerAgendamento.retornaLista();

        assertNotNull(agendamentos, "A lista de agendamentos deve existir.");
        assertEquals(1, agendamentos.size(), "A lista deve conter exatamente 1 agendamento.");
        assertEquals(agendamento, agendamentos.get(1), "O agendamento adicionado não é igual ao esperado.");
    }

    @Test
    public void testCreateAlerta() {
        Alerta alerta = new Alerta();
        alerta.setTipo("Bateria");
        alerta.setMensagem("Alerta de baixo nível de bateria");

        ControllerAlerta.createAlerta(alerta);
        List<Alerta> alertas = ControllerAlerta.retornaLista();

        assertEquals(1, alertas.size(), "A lista de alertas deve ter 1 item.");
        assertEquals(alerta, alertas.get(1), "O alerta adicionado não corresponde ao esperado.");
    }

    @Test
    public void testCreateDispositivo() {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setTipo("Termômetro");
        dispositivo.setModelo("Digital");

        ControllerDispositivo.createDispositivo(dispositivo);
        List<Dispositivo> dispositivos = ControllerDispositivo.retornaLista();

        assertEquals(1, dispositivos.size(), "A lista de dispositivos deve ter 1 item.");
        assertEquals(dispositivo, dispositivos.get(1), "O dispositivo adicionado não corresponde ao esperado.");
    }

    @Test
    public void testCreateMedicamento() {
        Medicamento medicamento = new Medicamento();
        medicamento.setDescricao("Paracetamol");
        medicamento.setDosagem(500);

        ControllerMedicamento.createMedicamento(medicamento);
        List<Medicamento> medicamentos = ControllerMedicamento.retornaLista();

        assertEquals(1, medicamentos.size(), "A lista de medicamentos deve ter 1 item.");
        assertEquals(medicamento, medicamentos.get(1), "O medicamento adicionado não corresponde ao esperado.");
    }

    @Test
    public void testCreateMedico() {
        Medico medico = new Medico();
        medico.setNome("Medico bizonho");
        medico.setCRM(123456);

        ControllerMedico.createMedico(medico);
        List<Medico> medicamentos = ControllerMedico.retornaLista();

        assertEquals(1, medicamentos.size(), "A lista de médicos deve ter 1 item.");
        assertEquals(medico, medicamentos.get(1), "O médico adicionado não corresponde ao esperado.");
    }

    @Test
    public void testCreateMonitoramento() {
        Monitoramento monitoramento = new Monitoramento();
        monitoramento.setPaciente(new Paciente());
        monitoramento.setDados("Estável");

        ControllerMonitoramento.createMonitoramento(monitoramento);
        List<Monitoramento> monitoramentos = ControllerMonitoramento.retornaLista();

        assertEquals(1, monitoramentos.size(), "A lista de monitoramentos deve ter 1 item.");
        assertEquals(monitoramento, monitoramentos.get(1), "O monitoramento adicionado não corresponde ao esperado.");
    }

    @Test
    public void testCreatePaciente() {
        Paciente paciente = new Paciente();
        paciente.setNome("Zézinho");
        paciente.setCpf("123456789");

        ControllerPaciente.createPaciente(paciente);
        List<Paciente> pacientes = ControllerPaciente.retornaLista();

        assertEquals(1, pacientes.size(), "A lista de pacientes deve ter 1 item.");
        assertEquals(paciente, pacientes.get(1), "O paciente adicionado não corresponde ao esperado.");
    }
}