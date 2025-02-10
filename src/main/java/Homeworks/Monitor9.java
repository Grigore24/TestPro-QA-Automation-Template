package Homeworks;

public class Monitor9 {
    private String name;
    private int diagonal;
    private int year;

    public Monitor9(String name, int diagonal, int year){
        this.name = name;
        this.diagonal = diagonal;
        this. year = year;
    }
    public String getName(){
        return name;
    }
    public  int getDiagonal(){
        return diagonal;
    }

    public int getYear() {
        return year;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(diagonal);
        System.out.println(year);
    }
}

