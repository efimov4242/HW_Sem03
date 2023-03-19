package Sem03;

public class Circle extends Figure implements Length {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
        if(radius <= 0) {
            throw new IllegalArgumentException("Значение должно быть больше 0!");
        }
    }

    @Override
    public void area() {
        double s = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площадь круга %.1f \n", s);
    }

    @Override
    public void length() {
        double p = 2*Math.PI*radius;
        System.out.printf("Периметр круга %.1f \n", p);
    }

    @Override
    public String toString() {
        return "Круг{" +
                "Радиус=" + radius +
                '}';
    }
}
