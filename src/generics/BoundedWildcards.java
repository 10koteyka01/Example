package generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildcards {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.addRectangle(new ArrayList<>(), new Circle());
    }
}


class Canvas {
    public void draw (Shape s) {s.draw(this);}

    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }

    public <T extends Shape> void addRectangle(List<T> shapes, T shape) {
        shapes.add(shape);
    }
}


abstract class Shape {
    public abstract void draw (Canvas c);
}

class Circle extends Shape {
    private int x, y, rad;

    @Override
    public void draw(Canvas c) {

    }
}

class Rectangle extends Shape {

    @Override
    public void draw(Canvas c) {

    }
}