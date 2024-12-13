import Models.Automovel;
import Models.Aviao;
import Models.Carro;
import Models.Moto;

public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel("azul",40,6 ,"fiat", "FRD203",4);
        automovel.mover();
        automovel.abastecer(5);
        automovel.abastecer("Gasolina");

        Aviao aviao = new Aviao("Cinza", 850, 12000, "PR-ABC");
        aviao.mover();
        aviao.acelerar();
        aviao.decolar();
        aviao.ligar();


        Carro carro = new Carro("branco",70, 4,"fiat", "RSD345",4);
        Carro carro2 = new Carro("preto",60, 4,"fiat", "YTJ678",4, 2);
        carro2.mover();
        carro2.acelerar();
        carro2.ligar();
        carro2.bozinar();
        carro2.abastecer(20);
        carro2.abastecer("Etanol");

        Moto moto = new Moto("Vermelha", 100, 2, "hondoa", "HSD23", 2, "eletrica");
        moto.mover();

    }
}