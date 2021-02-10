import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    Motorista mot1 = new Motorista("Claudeci",
            "B",
            "12345678910");

    Veiculo vec1 = new Veiculo("JJJ-1234",
            BuscarFIPE.consultar("Fiat Marea"),
            "B",
            mot1);

    VeiculoTest() throws Exception {
    }

    @Test
    void getMarca() {
        assertEquals("Fiat", vec1.getMarca());
    }

    @Test
    void getName() {
        assertEquals("Marea City", vec1.getName());
    }

    @Test
    void getPreco() {
        assertEquals("R$ 9.091,00", vec1.getPreco());
    }

    @Test
    void getPlaca() {
        assertEquals("JJJ-1234", vec1.getPlaca());
    }

    @Test
    void getCategoria() {
        assertEquals("B", vec1.getCategoria());
    }

    @Test
    void getMotorista() {
        assertEquals(mot1, vec1.getMotorista());
    }

    @Test
    void entrar() {
        vec1.entrar();
        Date horario = Calendar.getInstance().getTime();
        assertEquals(horario, vec1.getHorarioEntrada());
    }

    @Test
    void sair() {
        vec1.sair();
        Date horario = Calendar.getInstance().getTime();
        assertEquals(horario, vec1.getHorarioSaida());
    }
}