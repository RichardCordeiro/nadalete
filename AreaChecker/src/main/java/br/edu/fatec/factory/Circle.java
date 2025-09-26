package br.edu.fatec.factory;

final class Circle implements Calculable{
    private double raio;

    Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
