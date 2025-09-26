package br.edu.fatec.factory;

final class Square implements Calculable {
    private double lado;

    Square(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
