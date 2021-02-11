import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {
    private Endereco endereco;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private Integer quantidadeVagas;
    private Integer vagasOcupadas = 0;
    private List<Veiculo> veiculosEstacinados = new ArrayList<Veiculo>();

    public Estabelecimento(String cep, String numeroEndereco, Integer quantidadeVagas) throws Exception {
        this.endereco = BuscarCEP.buscaEnderecoPeloCEP(cep);
        this.endereco.setNumero(numeroEndereco);
        this.quantidadeVagas = quantidadeVagas;
    }

    public boolean ocuparVaga(Veiculo veiculo){
        if (getVagasDisponiveis() == 0) {
            return false;
        }
        veiculosEstacinados.add(veiculo);
        vagasOcupadas++;
        return true;
    }

    public boolean desocuparVaga(Veiculo veiculo){
        if (getVagasDisponiveis() == this.quantidadeVagas){
            return false;
        }
        veiculosEstacinados.remove(veiculo);
        vagasOcupadas--;
        return true;
    }

    public Integer getVagasDisponiveis(){
        return quantidadeVagas - vagasOcupadas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public Integer getQtdeFuncionarios(){
        return funcionarios.size();
    }

    public Integer getQtdeVallets(){
        return getVallets().size();
    }

    public List<Funcionario> getVallets(){
        List<Funcionario> vallets = new ArrayList<Funcionario>();
        for(Funcionario funcionario: funcionarios){
            if (funcionario.isVallet)
                vallets.add(funcionario);
        }
        return vallets;
    }
}
