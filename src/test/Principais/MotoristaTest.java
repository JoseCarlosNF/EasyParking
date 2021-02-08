import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoristaTest {
    Motorista motora = new Motorista("Genivaldo", "D", "12345678910");

    @Test
    void nomeDoMotora()
    { assertEquals("Genivaldo", motora.getNome()); }

    @Test
    void categoriaMotora()
    { assertEquals("D", motora.getCategoria()); }

    @Test
    void numeroValidoCNH()
    { assertEquals("12345678910", motora.getNumeroCNH()); }

    @Test
    void numeroInvalidoCNH()
    {
        Motorista motora2 = new Motorista("Genivaldo", "D", "1234567891");
        assertEquals(null, motora2.getNumeroCNH());
    }
}