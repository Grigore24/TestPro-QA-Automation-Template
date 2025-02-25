package Homeworks.Homeworks12Interfaces.shapes12;

public class Rectangle implements IShape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("I drow rectangle with width "+width+" and length "+length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 *(width + length);
    }
}
