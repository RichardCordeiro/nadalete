package br.edu.fatec.factory;

public interface ShapeFactory {
    public Calculable getShape(ShapeType type, Double[] values);
}
