package Models;

public class Automovel extends Veiculo {

    protected int quantidadeRodas;
    protected int capacidadeMaxima;
    protected String marca;
    protected String placa;

    public Automovel(String cor, int velocidade, int capacidadeMaxima, String marca, String placa, int quantidadeRodas) {
        super(cor, velocidade);
        this.capacidadeMaxima = capacidadeMaxima;
        this.marca = marca;
        this.placa = placa;
        this.quantidadeRodas = quantidadeRodas;
    }

    @Override
    public void mover() {
        System.out.println("Movendo...");
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
}
