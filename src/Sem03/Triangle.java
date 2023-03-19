package Sem03;

import java.util.Arrays;

public class Triangle extends Polygon {
    public Triangle(int[] sides) {
        super(sides);
        if (sides.length != 3) {
            throw new IllegalArgumentException("У треугольника должно быть три значения!");
        }
    }
    @Override
    public void area() {
            double p = (double) Arrays.stream(sides).sum() / 2;
            double s = Math.sqrt((p * ((p - sides[0]) * (p - sides[1]) * (p - sides[2]))));
            System.out.printf("Площадь треугольника %.1f\n", s);
        }

    @Override
    public void perimetre() {
        double p = Arrays.stream(sides).sum();
        System.out.printf("Периметр треугольника %.1f\n", p);
    }

    @Override
    public String toString() {
        return "Треугольник{" +
                "Стороны=" + Arrays.toString(sides) +
                '}';
    }
}

