package Sem03;

import java.util.Arrays;

public class Rectangle extends Polygon {
    public Rectangle(int[] sides) {
        super(sides);
        for (int i = 0; i < sides.length - 1; i++) {
            if(sides.length != 2 || sides[0] == sides[1]) {
                throw new IllegalArgumentException("У прямоугольника должно быть 2 различных значения!");
            }
        }
    }

    @Override
    public void area() {
        double s = sides[0] * sides[1];
        System.out.println("Площадь прямоугольника " + s);
    }

    @Override
    public void perimetre() {
        double p = Arrays.stream(sides).sum();
        System.out.printf("Периметр прямоугольника %.1f\n", p);
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "Стороны=" + Arrays.toString(sides) +
                '}';
    }
}
