package Model;

public class Dispositivo {

    private String tipo;
    private String marca;
    private String modelo;
    private String status;
    private int valor;

    public Dispositivo(){

    }

    public Dispositivo(String tipo, String marca, String modelo, String status, int valor) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}