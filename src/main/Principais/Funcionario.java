
class Funcionario{
    private String nome;
    private Endereco endereco;
    private String numero;

    public Funcionario(String nome, String cep, String numero) throws Exception {
        this.nome = nome;
        this.endereco = BuscarCEP.buscaEnderecoPeloCEP(cep);
        this.endereco.setNumero(numero);
        this.numero = numero;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String cep, String numero) throws Exception {
        this.endereco = BuscarCEP.buscaEnderecoPeloCEP(cep);
        this.endereco.setNumero(numero);
    }

    public String getNome() {
        return nome;
    }
}
