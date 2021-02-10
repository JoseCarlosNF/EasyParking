import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscarFIPETest {

    @Test
    void consultar() throws Exception {
        assertEquals("GM - Chevrolet",
                BuscarFIPE.consultar("Chevrolet Onix").getMarca());
    }

    @Test
    void consultarPreco() throws Exception {
        assertEquals("R$ 11.342,00",
                BuscarFIPE.consultar("Chevrolet Corsa").getPreco());
    }
}