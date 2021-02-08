import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHabilitadoTest {
    FuncionarioHabilitado funcHab1 = new FuncionarioHabilitado("Acerlindo Trindade",
            "B",
            "12345678910");

    @Test
    void getNome() {
        assertEquals("Acerlindo Trindade", funcHab1.getNome());
    }

    @Test
    void getCategoria() {
        assertEquals("B", funcHab1.getCategoria());
    }

    @Test
    void getNumeroCNH() {
        assertEquals("12345678910", funcHab1.getNumeroCNH());
    }
}