package Carro;

class Veículo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Veículo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // O veículo começa desligado por padrão
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O veículo" + modelo + " foi ligado.");
        } else {
            System.out.println("O veículo"+ modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O veículo" + modelo + " foi desligado.");
        } else {
            System.out.println("O veículo" + modelo +  " já está desligado.");
        }
    }
}

