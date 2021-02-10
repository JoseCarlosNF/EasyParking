import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Veiculo {
    private Motorista motorista;
    private String placa;
    private String categoria;
    private String marca;
    private String name;
    private String preco;
    private Date horarioEntrada;
    private Date horarioSaida;

    public Veiculo(String placa,
                   Veiculo modelo,
                   String categoria,
                   Motorista motorista){
        this.placa = placa;
        this.categoria = categoria;
        this.marca = modelo.marca;
        this.name = modelo.name;
        this.preco = modelo.preco;
        this.motorista = motorista;
    }

    public void entrar(){
        horarioEntrada = Calendar.getInstance().getTime();
    }

    public void sair(){
        horarioSaida = Calendar.getInstance().getTime();
    }

    public String getMarca() {
        return marca;
    }

    public String getName() {
        return name;
    }

    public String getPreco() {
        return preco;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public Date getHorarioEntrada() {
        return horarioEntrada;
    }

    public Date getHorarioSaida() {
        return horarioSaida;
    }
}
