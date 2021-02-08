import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BuscarCEPTest {

    @Test
    void buscaEnderecoPeloCEP() throws Exception {
        Endereco end1 = BuscarCEP.buscaEnderecoPeloCEP("66075-110");
        assertEquals("Rua Augusto Corrêa", end1.getLogradouro());
        assertEquals("Guamá", end1.getBairro());
        assertEquals("Belém", end1.getLocalidade());
    }

    @Test
    void settarNumero() throws Exception {
        Endereco end1 = BuscarCEP.buscaEnderecoPeloCEP("66075-110");
        end1.setNumero("123A");
        assertEquals("123A", end1.getNumero());
    }

    @Test
    void settarNovoEnderecoPeloCEP() throws Exception {
        Endereco end1 = BuscarCEP.buscaEnderecoPeloCEP("66075-110");
        assertEquals("Rua Augusto Corrêa", end1.getLogradouro());
        assertEquals("Guamá", end1.getBairro());
        assertEquals("Belém", end1.getLocalidade());

        end1 = BuscarCEP.buscaEnderecoPeloCEP("68746-630");
        assertEquals("Rua Cristóvão Colombo", end1.getLogradouro());
        assertEquals("Jaderlândia", end1.getBairro());
        assertEquals("Castanhal", end1.getLocalidade());
    }
}