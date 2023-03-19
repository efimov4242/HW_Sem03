package Sem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFigure extends Figure{
    ArrayList<Figure> arrayList;

    public ArrayFigure(ArrayList<Figure> arrayList) {
        this.arrayList = arrayList;
    }

    public static ArrayList addFigure(Figure figure) {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(figure);
        return figures;
    }

    @Override
    public String toString() {
        return "ArrayFigure{" +
                "arrayList=" + arrayList +
                '}';
    }
}
