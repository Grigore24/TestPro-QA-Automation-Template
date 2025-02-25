package Homeworks.Homeworks12Interfaces.shapes12;

public class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }
    @Override
    public void draw(){
        System.out.println("I draw Square with side "+getWidth());
    }
}
