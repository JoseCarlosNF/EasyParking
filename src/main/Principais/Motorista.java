public class Motorista {
    private Cnh cnh;

    public Motorista(String nome, String categoriaCNH, String numeroCNH)
    {
        this.cnh = new Cnh(nome, categoriaCNH, numeroCNH);
    }

    String getNome(){
        return this.cnh.nome;
    }

    String getCategoria(){
        return this.cnh.categoria;
    }

    String getNumeroCNH(){
        return this.cnh.numero;
    }
}
