import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Cnh {
    public String nome;
    public String categoria;
    public String numero;

    public Cnh(String nome, String categoria, String numero){
        this.nome = nome;
        this.categoria = categoria;
        if (validarNumero(numero))
            { this.numero = numero; }
        else
            { this.numero = null; }
    }

    private boolean validarNumero( String numero)
    {
        Pattern padrao = Pattern.compile("[0-9]{11}");
        return padrao.matcher(numero).matches();
    }
}
