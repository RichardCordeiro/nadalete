package br.edu.fatec.factory;

final class Hexagon implements Calculable {
    private double lado;

    Hexagon(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 3 * (Math.sqrt(3) * lado * lado) / 2;
    }
}
