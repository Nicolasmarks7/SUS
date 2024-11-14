package Model;

public class Medico {

    private String nome;
    private String especialidade;
    private int CRM;
    private String email;
    private int telefone;

    public Medico(String nome, String especialidade,
                  int CRM, String email, int telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.CRM = CRM;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}