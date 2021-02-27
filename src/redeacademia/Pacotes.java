package redeacademia;

public class Pacotes {
    private String plano;
    private String tipo;
    private float valor;


    public Pacotes(String plano, String tipo, float valor) {
        this.plano = plano;
        this.tipo = tipo;
        this.valor = valor;

    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;            
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    } 

}
