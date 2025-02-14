package Homeworks.Homeworks12Interfaces.shapes12;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        IShape c2 = new Circle(8);

        Rectangle r1 = new Rectangle(8,6);
        IShape r2 = new Rectangle(4,5);

        Square s1 = new Square(5);
        Rectangle s2 = new Square(9);
        IShape s3 = new Square(8);

        IShape[] shapes = {c1,c2,r1,r2,s1,s2,s3};
        for( IShape shape: shapes){
            shape.draw();
        }
        double totalArea = 0;
        for(IShape shape : shapes){
            totalArea = totalArea + shape.getArea();
        }
        System.out.println("Total Area = "+totalArea);
    }
}
