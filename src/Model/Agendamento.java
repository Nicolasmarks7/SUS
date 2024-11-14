package Model;

public class Agendamento {

    private String data;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    private String diagnostico;
    private Medicamento medicamento;

    public Agendamento(String data, String hora, Paciente paciente,
                       Medico medico, String diagnostico, Medicamento medicamento) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.medicamento = medicamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}