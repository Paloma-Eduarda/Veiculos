package Models;

import Interfaces.IVeiculo;

public class Carro extends Automovel implements IVeiculo {

    private int qtdPortas;

    public Carro(String cor, int velocidade, int capacidadeMaxima, String marca, String placa, int quantidadeRodas, int qtdPortas) {
        super(cor, velocidade, capacidadeMaxima, marca, placa, quantidadeRodas);
        this.qtdPortas = qtdPortas;
    }

    public Carro(String cor, int velocidade, int capacidadeMaxima, String marca, String placa, int quantidadeRodas) {
        super(cor, velocidade, capacidadeMaxima, marca, placa, quantidadeRodas);

    }
    public void bozinar(){
        System.out.println("piiiipiti");
    }
    @Override
    public void mover() {
        System.out.println("Movendo carro...");
    }

    @Override
    public void acelerar() {

        this.velocidade = this.velocidade+1;
        System.out.println("Velocidade do carro: " + velocidade);
    }

    @Override
    public boolean ligar() {
        System.out.println("Ligando carro...");
        return true;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}
