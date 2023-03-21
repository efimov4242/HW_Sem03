package Sem03;

public abstract class Figure implements Area, Comparable<Figure> {
    public int area;

    public int compareTo(Figure figure) {
        if (this.area == figure.area) return 0;
        else if (this.area < figure.area) return -1;
        else return 1;
    }
}
