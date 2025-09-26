package br.edu.fatec;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();

        Calculable quadrado = shapeFactory.getShape(ShapeType.SQUARE, new Double[] {2.0});
        Calculable circulo = shapeFactory.getShape(ShapeType.CIRCLE, new Double[] {2.0});
        Calculable cubo = shapeFactory.getShape(ShapeType.CUBE, new Double[] {2.0});
        Calculable triangulo = shapeFactory.getShape(ShapeType.TRIANGLE, new Double[] {2.0, 3.0});
        Calculable retangulo = shapeFactory.getShape(ShapeType.RECTANGLE, new Double[] {2.0, 3.0});
        Calculable trapezio = shapeFactory.getShape(ShapeType.TRAPEZO, new Double[] {2.0, 3.0, 4.0});
        Calculable paralelograma =  shapeFactory.getShape(ShapeType.PARALLELOGRAM, new Double[] {2.0, 3.0});
        Calculable hexagono = shapeFactory.getShape(ShapeType.HEXAGON, new Double[] {2.0});
        Calculable diamante = shapeFactory.getShape(ShapeType.DIAMOND, new Double[] {2.0, 3.0});




        System.out.printf("a area do quadrado é %.2f%n", quadrado.calcularArea());
        System.out.printf("a area do circulo é %.2f%n", circulo.calcularArea());
        System.out.printf("a area do cubo é %.2f%n", cubo.calcularArea());
        System.out.printf("a area do triângulo é %.2f%n", triangulo.calcularArea());
        System.out.printf("a area do retângulo é %.2f%n", retangulo.calcularArea());
        System.out.printf("a area do trapézio é %.2f%n", trapezio.calcularArea());
        System.out.printf("a area do paralelograma é %.2f%n", paralelograma.calcularArea());
        System.out.printf("a area do hexágono é %.2f%n", hexagono.calcularArea());
        System.out.printf("a area do diamante é %.2f%n", diamante.calcularArea());

    }
}