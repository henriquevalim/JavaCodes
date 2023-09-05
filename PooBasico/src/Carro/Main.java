package Carro;

public class Main {
    public static void main(String[] args) {
        Veículo carro = new Veículo("Toyota", " Corolla", 2022);
        Veículo moto = new Veículo("Honda", " CBR600RR", 2021);

        carro.ligar();
        carro.desligar();

        moto.ligar();
        moto.desligar();
    }
}
