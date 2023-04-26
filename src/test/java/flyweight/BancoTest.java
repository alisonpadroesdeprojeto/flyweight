package flyweight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BancoTest {

    @Test
    void deveRetornarClientes() {
        Banco banco = new Banco();
        banco.cadastrar("Carla", 123, "Banco A");
        banco.cadastrar("Jean", 123, "Banco A");
        banco.cadastrar("Patrick", 123, "Banco A");
        banco.cadastrar("James", 123, "Banco A");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Carla', agencia='123', banco='Banco A'}",
                "Cliente{nome='Jean', agencia='123', banco='Banco A'}",
                "Cliente{nome='Patrick', agencia='123', banco='Banco A'}",
                "Cliente{nome='James', agencia='123', banco='Banco A'}");

        assertEquals(saida, banco.obterClientes());
    }

    @Test
    void deveRetornarTotalAgencias() {
        Banco banco = new Banco();
        banco.cadastrar("Augusto", 123, "Banco A");
        banco.cadastrar("Marcelo", 123, "Banco A");
        banco.cadastrar("Paula", 123, "Banco A");
        banco.cadastrar("Lucas", 222, "Banco B");

        assertEquals(2, AgenciaFactory.getTotalAgencias());
    }

}