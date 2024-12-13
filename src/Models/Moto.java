package Models;

public class Moto extends Automovel {
    private String tipoPartida;

    public Moto(String cor, int velocidade, int capacidadeMaxima, String marca, String placa, int quantidadeRodas, String tipoPartida) {
        super(cor, velocidade, capacidadeMaxima, marca, placa, quantidadeRodas);
        this.tipoPartida = tipoPartida;
    }

    @Override
    public void mover() {
        System.out.println("Movendo Moto...");
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
}
