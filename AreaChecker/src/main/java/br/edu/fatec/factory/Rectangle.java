package br.edu.fatec.factory;

final  class Rectangle implements Calculable{
    private double lado1;
    private double lado2;

    Rectangle(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }
}
