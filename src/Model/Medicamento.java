package Model;

public class Medicamento {

    private String nome;
    private int dosagem;
    private int frequencia;
    private String descricao;
    private String dataVenc;
    private String prescricao;

    public Medicamento(){

    }

    public Medicamento(String nome, int dosagem, int frequencia,
                       String descricao, String dataVenc, String prescricao) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.descricao = descricao;
        this.dataVenc = dataVenc;
        this.prescricao = prescricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDosagem() {
        return dosagem;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
}