package br.edu.fatec.factory;

final class Parallelogram implements Calculable {
    private double base;
    private double altura;

    Parallelogram(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
