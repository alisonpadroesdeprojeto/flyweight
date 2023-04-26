package flyweight;

public class Agencia {

    private Integer numero;
    private String banco;

    public Agencia(Integer nome, String banco) {
        this.numero = nome;
        this.banco = banco;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBanco() {
        return banco;
    }
}
