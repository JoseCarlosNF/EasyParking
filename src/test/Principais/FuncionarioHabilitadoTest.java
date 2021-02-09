import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHabilitadoTest {
    FuncionarioHabilitado funcHab1 = new FuncionarioHabilitado("Acerlindo Trindade",
            "67130123",
            "123",
            "B",
            "12345678910",
            true);

    FuncionarioHabilitadoTest() throws Exception {
    }


    @Test
    void getNome() {
        assertEquals("Acerlindo Trindade", funcHab1.getNome());
    }


    @Test
    void getCategoria() {
        assertEquals("B", funcHab1.getCnh().categoria);
    }

}