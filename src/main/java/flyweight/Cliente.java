package flyweight;

public class Cliente {

    private String nome;
    private Agencia agenciaResidencia;

    public Cliente(String nome, Agencia agenciaResidencia) {
        this.nome = nome;
        this.agenciaResidencia = agenciaResidencia;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", agencia='" + agenciaResidencia.getNumero() + '\'' +
                ", banco='" + agenciaResidencia.getBanco() + '\'' +
                '}';
    }
}