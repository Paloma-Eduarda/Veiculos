package Models;

public abstract class Veiculo{
    protected String cor;
    protected int velocidade;

    public Veiculo(String cor, int velocidade) {
        this.cor = cor;
        this.velocidade = velocidade;
    }

    //Sobreposição de métodos.
    public void mover(){
        System.out.println("Mover do veiculo");
    };

    //sobrecarga de métodos
    public void abastecer(int litros) {
        System.out.println("Abastecendo o veiculo com " + litros + " litros");
    }
    //sobrecarga de métodos
    public void abastecer(String tipoCombustivel) {
        System.out.println("Abastecendo o veiculo com " + tipoCombustivel);
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
