import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario func1 = new Funcionario("Francisquinha de Oliveira");

    @Test
    void getNome()
    {
        assertEquals("Francisquinha de Oliveira", func1.getNome());
    }

}