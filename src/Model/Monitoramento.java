package Model;

public class Monitoramento {

    private Paciente paciente;
    private Dispositivo dispositivo;
    private String dados;

    public Monitoramento(Paciente paciente, Dispositivo dispositivo, String dados) {
        this.paciente = paciente;
        this.dispositivo = dispositivo;
        this.dados = dados;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
