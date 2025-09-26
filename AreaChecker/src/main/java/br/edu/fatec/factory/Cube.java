package br.edu.fatec.factory;

final class Cube implements Calculable{
    private double lado;

    Cube(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6*lado*lado;
    }
}
