import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario func1 = new Funcionario("Francisquinha de Oliveira", "70804-200", "171");

    FuncionarioTest() throws Exception {
    }

    @Test
    void getNome()
    {
        assertEquals("Francisquinha de Oliveira", func1.getNome());
    }

    @Test
    void getEndereco()
    {
        assertEquals("Avenida Central", func1.getEndereco().getLogradouro());
        assertEquals("171", func1.getEndereco().getNumero());
        assertEquals("Vila Planalto", func1.getEndereco().getBairro());
        assertEquals("Brasília", func1.getEndereco().getLocalidade());
    }

}