import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EstabelecimentoTest {

        Funcionario func1 = new Funcionario("Francisquinha de Oliveira",
            "70804-200",
            "171");
        Funcionario func2HabNoVallet= new FuncionarioHabilitado("Claudeci de Andrade",
            "70804-200",
            "171",
            "B",
            "12345678910",
            false);
        Funcionario func3HabVallet= new FuncionarioHabilitado("Adagoberto da Silva",
            "67123100",
            "123",
            "D",
            "16521426512",
            true);

        Motorista mot1 = new Motorista("Genivaldo Aparecido",
                "B",
                "12345678910");
        Veiculo vec1 = new Veiculo("JJJ-1234",
                BuscarFIPE.consultar("Fiat Marea"),
                "B",
                mot1);

        Motorista mot2 = new Motorista("João Demilson",
                "B",
                "14325132541");
        Veiculo vec2 = new Veiculo("QHN-6543",
                BuscarFIPE.consultar("Chevrolet Onix"),
                "B",
                mot2);

        Estabelecimento estab1 = new Estabelecimento("68721-000", "1892", 10);

    EstabelecimentoTest() throws Exception {
    }

    @Test
    @DisplayName("Método para indisponibilizar vaga")
    void ocuparVaga() {
        assertTrue(estab1.ocuparVaga(vec1));
        assertEquals(9, estab1.getVagasDisponiveis());

        assertTrue(estab1.ocuparVaga(vec2));
        assertEquals(8, estab1.getVagasDisponiveis());
    }

    @Test
    @DisplayName("Método para desocupar vagas")
    void desocuparVaga() {
        assertTrue(estab1.ocuparVaga(vec1));
        assertTrue(estab1.ocuparVaga(vec2));

        assertTrue(estab1.desocuparVaga(vec1));
        assertEquals(9, estab1.getVagasDisponiveis());
    }

    @Test
    @DisplayName("Inteiro: quantidade de vagas disponíveis")
    void getVagasDisponiveis() {
        assertTrue(estab1.ocuparVaga(vec1));
        assertEquals(9, estab1.getVagasDisponiveis());
    }

    @Test
    @DisplayName("Lista: listagem de funcionários")
    void getFuncionarios() {
        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(func1);
        listaFuncionarios.add(func2HabNoVallet);
        listaFuncionarios.add(func3HabVallet);

        estab1.addFuncionario(func1);
        estab1.addFuncionario(func2HabNoVallet);
        estab1.addFuncionario(func3HabVallet);

        assertEquals(listaFuncionarios, estab1.getFuncionarios());
    }

    @Test
    @DisplayName("Lista: adição de funcionários")
    void addFuncionario() {
        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(func1);
        listaFuncionarios.add(func2HabNoVallet);
        listaFuncionarios.add(func3HabVallet);

        estab1.addFuncionario(func1);
        estab1.addFuncionario(func2HabNoVallet);
        estab1.addFuncionario(func3HabVallet);

        assertEquals(listaFuncionarios, estab1.getFuncionarios());
    }

    @Test
    @DisplayName("Lista: remoção de funcionários")
    void removerFuncionario() {
        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(func2HabNoVallet);
        listaFuncionarios.add(func3HabVallet);

        estab1.addFuncionario(func1);
        estab1.addFuncionario(func2HabNoVallet);
        estab1.addFuncionario(func3HabVallet);

        estab1.removerFuncionario(func1);

        assertEquals(listaFuncionarios, estab1.getFuncionarios());
    }

    @Test
    @DisplayName("Inteiro: quantidade de funcionários")
    void getQtdeFuncionarios() {
        estab1.addFuncionario(func1);
        estab1.addFuncionario(func2HabNoVallet);
        estab1.addFuncionario(func3HabVallet);

        assertEquals(3, estab1.getQtdeFuncionarios());
    }

    @Test
    @DisplayName("Inteiro: quantidade de funcionários que são vallets")
    void getQtdeVallets() {
        estab1.addFuncionario(func1);
        estab1.addFuncionario(func2HabNoVallet);
        estab1.addFuncionario(func3HabVallet);

        assertEquals(1, estab1.getQtdeVallets());
    }

    @Test
    @DisplayName("Lista: lista de todos os funcionarios que são vallets")
    void getVallets() {
        List<Funcionario> listaVallets = new ArrayList<>();

        listaVallets.add(func3HabVallet);

        estab1.addFuncionario(func1);
        estab1.addFuncionario(func2HabNoVallet);
        estab1.addFuncionario(func3HabVallet);

        assertEquals(listaVallets, estab1.getVallets());
    }
}