package flyweight;

import java.util.HashMap;
import java.util.Map;

public class AgenciaFactory {
    private static Map<Integer, Agencia> agencias = new HashMap<>();

    public static Agencia getAgencia(Integer numero, String banco) {
        Agencia agencia = agencias.get(numero);
        if (agencia == null) {
            agencia = new Agencia(numero, banco);
            agencias.put(numero, agencia);
        }
        return agencia;
    }

    public static int getTotalAgencias() {
        return agencias.size();
    }

}