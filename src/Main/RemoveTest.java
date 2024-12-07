package Main;

import Model.*;
import Controller.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


public class RemoveTest {

    Remove remove = new Remove();

    @BeforeEach
    public void setUp() {

        // Inicializar dados fictícios
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
    public void testExclusaoRemoverPrescricao() {
        // Adicionar um paciente com prescrição
        Paciente paciente = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        Medicamento medicamento = new Medicamento("nomemedicamento", 50, 20, "descricao", "dataVenc", "prescricao");
        paciente.setMedicamento(medicamento);
        ControllerPaciente.retornaLista().add(paciente);

        // Verificar que o paciente tem prescrição antes
        Assertions.assertNotNull(ControllerPaciente.readPaciente("cpf1"));

        // Executar a exclusão de prescrição
        remove.exclusao(1);

        // Verificar que a prescrição foi removida
        assertNull(Objects.requireNonNull(ControllerPaciente.readPaciente("cpf1")).getMedicamento());
    }

    @Test
    public void testExclusaoRemoverDispositivoPaciente() {
        // Adicionar um dispositivo a um paciente
        Paciente paciente = ControllerPaciente.readPaciente("cpf1");
        Dispositivo dispositivo = new Dispositivo("tipo1", "marca1", "modelo1", "status1", 50);

        assert paciente != null;
        paciente.setDispositivo(dispositivo);
        // Verificar que o paciente tem um dispositivo
        assertNotNull(paciente.getDispositivo());
        // Executar a exclusão de dispositivo do paciente
        remove.exclusao(2);
        // Verificar que o dispositivo foi removido
        assertNull(paciente.getDispositivo());
    }

    @Test
    public void testExclusaoRemoverDispositivo() {
        // Verificar que o dispositivo existe na lista
        assertNotNull(ControllerDispositivo.readDispositivo("tipo1"));
        // Executar a exclusão de dispositivo
        remove.exclusao(3);
        // Verificar que o dispositivo foi removido
        assertNull(ControllerDispositivo.readDispositivo("tipo1"));
    }

    @Test
    public void testExclusaoRemoverAlerta() {
        // Adicionar um alerta na lista
        Paciente paciente = new Paciente("nome1", "cpf1", "dataNasc1", "endereco1", 985600001, "email1", "historico1");
        ControllerPaciente.retornaLista().add(paciente);
        ControllerAlerta.retornaLista().add(new Alerta("tipo1", "mensagem1", paciente, new Medico(), "data1"));
        // Verificar que o alerta existe
        Alerta alerta = ControllerAlerta.readAlerta("tipo1", "cpf1");
        assertNotNull(alerta);
        // Executar a exclusão do alerta
        remove.exclusao(4);
        // Verificar que o alerta foi removido
        alerta = ControllerAlerta.readAlerta("tipo1", "cpf2");
        assertNull(alerta);
    }

    @Test
    public void testExclusaoOpcaoInvalida() {
        // Executar a exclusão com uma opção inválida
        remove.exclusao(99);
        // Verificar que nenhuma lista foi alterada
        assertEquals(2, ControllerDispositivo.retornaLista().size());
        assertEquals(2, ControllerPaciente.retornaLista().size());
        assertEquals(2, ControllerAlerta.retornaLista().size());
    }
}