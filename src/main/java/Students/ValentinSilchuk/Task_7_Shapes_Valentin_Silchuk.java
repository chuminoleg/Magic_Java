package HomeTask;

import javax.sound.midi.Soundbank;
import java.util.Objects;

/**
 * Задача 7. Фигуры
 * Создайте супер класс Shape и его наследников Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек.
 * Создать массив содержащий эти фигуры.
 * В цикле "нарисовать" их (вызвать метод draw).
 * Добавить метод equals() для классов Shape, Circle, Rectangle.
 */
public class Task_7_Shapes_Valentin_Silchuk {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (Shape shape:shapes
             ) {shape.draw();
        }
    }
}

abstract class Shape {
    String color;

    abstract void draw();
}
class Circle extends Shape {
    int xCenter;
    int yCenter;
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public boolean equals(Object o) { //что это и зачем?
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return xCenter == circle.xCenter && yCenter == circle.yCenter;
    }

    @Override
    public int hashCode() { //что это и зачем?
        return Objects.hash(xCenter, yCenter);
    }
}
class Rectangle extends Shape {
    int xTop;
    int yTop;
    int xLeft;
    int yLeft;
    int xRight;
    int yRight;
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return xTop == rectangle.xTop && yTop == rectangle.yTop && xLeft == rectangle.xLeft && yLeft == rectangle.yLeft && xRight == rectangle.xRight && yRight == rectangle.yRight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xTop, yTop, xLeft, yLeft, xRight, yRight);
    }
}