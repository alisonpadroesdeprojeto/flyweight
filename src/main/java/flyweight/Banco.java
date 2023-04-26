package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(String nomeCliente, Integer numeroAgencia, String banco) {
        Agencia cidade = AgenciaFactory.getAgencia(numeroAgencia, banco);
        Cliente cliente = new Cliente(nomeCliente, cidade);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }


}