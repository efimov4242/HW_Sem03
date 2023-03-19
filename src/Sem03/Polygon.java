package Sem03;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Polygon extends Figure implements Perimetre {
    int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] <= 0) {
                throw new IllegalArgumentException("Значения должны быть больше нуля!");
            }
        }
    }

}
