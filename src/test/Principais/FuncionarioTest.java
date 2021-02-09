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


    @Test
    void setEndereco() throws Exception {
        func1.setEndereco("66075-110","123");
        assertEquals("Rua Augusto Corrêa", func1.getEndereco().getLogradouro());
        assertEquals("Guamá", func1.getEndereco().getBairro());
        assertEquals("Belém", func1.getEndereco().getLocalidade());
        assertEquals("123", func1.getEndereco().getNumero());
    }

    @Test
    void getHabilitado() {
        assertFalse(func1.getHabilitado());
    }


    @Test
    void getVallet() {
        assertFalse(func1.getVallet());
    }
}