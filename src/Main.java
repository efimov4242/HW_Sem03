import Sem03.*;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        printMenu();
        menuFigure();

    }

    public static ArrayList<Figure> figures = new ArrayList<>();


    public static Triangle getTriangleSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tВведите три числа");
        int[] sides = new int[3];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = scanner.nextInt();
        }
        return new Triangle(sides);
    }

    public static Square getSquareSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tВведите длину ребра квадрата");
        int[] sides = new int[1];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = scanner.nextInt();
        }
        return new Square(sides);
    }

    public static Rectangle getRectangleSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tВведите два значения");
        int[] sides = new int[2];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = scanner.nextInt();
        }
        return new Rectangle(sides);
    }

    public static Circle getCircleSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tВведите длину окружности");
        int length = scanner.nextInt();
        return new Circle(length);
    }

    static void printMenu() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "Добавить новую фигуру");
        menu.put(2, "Посчитать периметр у всех фигур");
        menu.put(3, "Посчитать площадь у всех фигур");
        menu.put(4, "Вывести информацию о всех периметах, площадях и длиннах окружности всех фигур, где это возможно");
        menu.put(5, "Удалить фигуру");
        menu.put(6, "Изменить фигуру по индексу");
        menu.put(7, "Сортировать фигуры по площади");
        menu.put(8, "Выход");
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        for (Map.Entry entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        choiceMenu();
    }

    static void choiceMenu() {
        Scanner iScanner = new Scanner(System.in);
        int menuNum = iScanner.nextInt();

        while (true) {
            if (menuNum == 1) {
                menuFigure();
            }
            else if (menuNum == 2) {
                getAllFigurePerimetre();
            } else if (menuNum == 3) {
                getAllFigureArea();
            } else if (menuNum == 4) {
                getAllFigureAreaAndPerimetre();
            } else if (menuNum == 5) {
                removeFigure();
            } else if (menuNum == 6) {
                changeFigure();
            } else if (menuNum == 7) {
                getSortFigure();
            } else if (menuNum == 7) {
                System.out.println("Программа завершена!");
                System.exit(0);
            }
            System.out.println();
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            menuNum = iScanner.nextInt();
        }
    }

    public static void getSortFigure() {

    }

    public static void changeFigure() {
        System.out.println("Введите номер фигуры, чтобы изменить:");
        printAllFigures();
        if (figures.isEmpty()) {
            System.out.println("Нет фигур для изменения");
        } else {
            Scanner removeScanner = new Scanner(System.in);
            int index = removeScanner.nextInt();
            for (int j = 0; j < figures.size(); j++) {
                if (j == index) {
                    if (figures.get(j) instanceof Triangle) {
                        figures.add(getTriangleSides());
                    }
                    if (figures.get(j) instanceof Square) {
                        figures.add(getSquareSides());
                    }
                    if (figures.get(j) instanceof Rectangle) {
                        figures.add(getRectangleSides());
                    }
                    if (figures.get(j) instanceof Circle) {
                        figures.add(getCircleSides());
                    }
                }
            }
            figures.remove(index);
            printAllFigures();
        }
    }




        public static void getAllFigurePerimetre() {
        for (Figure figure : figures) {
            if(figure instanceof Polygon) {
                ((Polygon) figure).perimetre();
            }
        }
    }

    public static void getAllFigureArea() {
        for (Figure figure : figures) {
            if(figure instanceof Polygon) {
                ((Polygon) figure).area();
            }
        }
    }

    public static void getAllFigureAreaAndPerimetre() {
        for (Figure figure : figures) {
            if(figure instanceof Polygon) {
                ((Polygon) figure).area();
                ((Polygon) figure).perimetre();
            }
            if (figure instanceof Circle) {
                ((Circle) figure).area();
                ((Circle) figure).length();
            }
            }
        }

    public static void printAllFigures() {
        int i = 0;
        for (Figure figure : figures) {
            System.out.println(i + " - " + figure);
            i++;
        }
    }

    public static void removeFigure() {
    while (true) {
        System.out.println("Введите номер фигуры, чтобы удалить:");
        printAllFigures();
        if (figures.isEmpty()) {
            System.out.println("Все фигуры удалены!");
        } else {
            Scanner removeScanner = new Scanner(System.in);
            int index = removeScanner.nextInt();
            for (int j = 0; j < figures.size(); j++) {
                if (j == index) {
                    figures.remove(j);
                }
                index = removeScanner.nextInt();
            }
        }
        printMenu();
    }
    }

    public static void menuFigure() {
        Map<Integer, String> menuFigure = new HashMap<>();
        menuFigure.put(1, "Треугольник");
        menuFigure.put(2, "Квадрат");
        menuFigure.put(3, "Прямоугольник");
        menuFigure.put(4, "Круг");
        menuFigure.put(5, "Переход в главное меню");
        menuFigure.put(6, "Выход");
        System.out.println("\tВведите цифру фигуры, которую хотите создать: ");
        for (Map.Entry entry : menuFigure.entrySet()) {
            System.out.println("\t" + entry.getKey() + " - " + entry.getValue());
        }
        choiceMenuFigure();
    }

        public static void choiceMenuFigure () {
            Scanner iScanner = new Scanner(System.in);
            int figureNum = iScanner.nextInt();

            while (true) {
                if (figureNum == 1) {
                    figures.add(getTriangleSides());
                } else if (figureNum == 2) {
                    figures.add(getSquareSides());
                } else if (figureNum == 3) {
                    figures.add(getRectangleSides());
                } else if (figureNum == 4) {
                    figures.add(getCircleSides());
                } else if (figureNum == 5) {
                    printMenu();
                } else if (figureNum == 6) {
                    System.out.println("Программа завершена!");
                    System.exit(0);
                }
                System.out.println();
                System.out.println("Введите фигуру, соответствующую необходимому критерию:");
                figureNum = iScanner.nextInt();
            }
        }
    }