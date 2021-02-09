import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoristaTest {
    Motorista motora = new Motorista("Genivaldo", "D", "12345678910");

    @Test
    void getNome()
    { assertEquals("Genivaldo", motora.getNome()); }

    @Test
    void getCategoria()
    { assertEquals("D", motora.getCategoria()); }

    @Test
    void getNumeroCNH()
    { assertEquals("12345678910", motora.getNumeroCNH()); }

    @Test
    void numeroInvalidoCNH()
    {
        Motorista motora2 = new Motorista("Genivaldo", "D", "1234567891");
        assertEquals(null, motora2.getNumeroCNH());
    }

}