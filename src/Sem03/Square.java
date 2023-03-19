package Sem03;

import java.util.Arrays;

public class Square extends Polygon {

    public Square(int[] sides) {
        super(sides);
        if(sides.length != 1) {
            throw new IllegalArgumentException("У квадрата должно быть 1 значение!");
        }
    }

    @Override
    public void area() {
        System.out.println("Площадь квадрата " + Math.pow(sides[0], 2));
    }

    @Override
    public void perimetre() {
        double p = Arrays.stream(sides).sum();
        System.out.printf("Периметр квадрата %.1f\n", p);
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "Стороны=" + Arrays.toString(sides) +
                '}';
    }
}
