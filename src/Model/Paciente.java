package Model;

public class Paciente {

    private String nome;
    private String cpf;
    private String dataNasc;
    private String endereco;
    private int telefone;
    private String email;
    private String historico;
    private Medicamento medicamento;
    private Dispositivo dispositivo;

    //construtor sem medicamento e dispositivo caso não precise
    public Paciente(String nome, String cpf, String dataNasc, String endereco, int telefone, String email, String historico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.historico = historico;
    }

    public Paciente(String nome, String cpf, String dataNasc,
                    String endereco, int telefone, String email,
                    String historico, Medicamento medicamento,
                    Dispositivo dispositivo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.historico = historico;
        this.medicamento = medicamento;
        this.dispositivo = dispositivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
}