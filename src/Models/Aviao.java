package Models;

import Interfaces.IAviao;
import Interfaces.IVeiculo;

public class Aviao extends Veiculo implements IVeiculo, IAviao {

    private double altitudeMaxima;
    private String prefixoRegistro;

    public Aviao(String cor, int velocidade, double altitudeMaxima, String prefixoRegistro) {
        super(cor, velocidade);
        this.altitudeMaxima = altitudeMaxima;
        this.prefixoRegistro = prefixoRegistro;
    }

    @Override
    public void mover() {
        System.out.println("Voando...");
    }

    @Override
    public void acelerar() {

        this.velocidade = this.velocidade + 1;
        System.out.println("Velocidade do avião: "+velocidade);
    }

    @Override
    public boolean ligar() {
        System.out.println("Avião ligado");
        return true;
    }

    @Override
    public void decolar() {
        System.out.println("Decolando...");
    }

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public String getPrefixoRegistro() {
        return prefixoRegistro;
    }

    public void setPrefixoRegistro(String prefixoRegistro) {
        this.prefixoRegistro = prefixoRegistro;
    }
}
