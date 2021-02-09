public class FuncionarioHabilitado extends Funcionario{
    private Cnh cnh;

    public FuncionarioHabilitado(String nome,
                                 String cep,
                                 String numeroEndereco,
                                 String categoriaCNH,
                                 String numeroCNH,
                                 Boolean isVallet) throws Exception {
        super(nome, cep, numeroEndereco);
        this.isHabilitado = true;
        this.isVallet = isVallet;
        this.cnh = new Cnh(nome, categoriaCNH, numeroCNH);
    }

    public Cnh getCnh(){
        return cnh;
    }
}
