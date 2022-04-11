package generics;

import java.util.List;

public class BoundedWildcards {

    public static void main(String[] args) {

    }



}


class Canvas {
    public void draw(Shape s) {
        s.draw(this);
    }

    public void drawAll(List<Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(this);
        }
    }

    public void addRectangle(List<? extends Shape> shapes) {
        // Compile-time error!
//        shapes.add(0, new Rectangle());
    }
}

abstract class Shape {
    public abstract void draw(Canvas c);
}

class Circle extends Shape {
    private int x, y, radius;
    public void draw(Canvas c) {
    }
}

class Rectangle extends Shape {
    private int x, y, width, height;
    public void draw(Canvas c) {
    }
}