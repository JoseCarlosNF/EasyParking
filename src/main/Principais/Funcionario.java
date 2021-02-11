
class Funcionario{
    private String nome;
    private Endereco endereco;
    protected Boolean isHabilitado;
    protected Boolean isVallet;

    public Funcionario(String nome, String cep, String numeroEndereco) throws Exception {
        this.nome = nome;
        this.endereco = BuscarCEP.buscaEnderecoPeloCEP(cep);
        this.endereco.setNumero(numeroEndereco);
        this.isHabilitado = false;
        this.isVallet = false;
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

    public Boolean getHabilitado() {
        return isHabilitado;
    }

    public Boolean getVallet() {
        return isVallet;
    }
}
