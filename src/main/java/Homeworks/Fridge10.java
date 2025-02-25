package Homeworks;

public class Fridge10 {
    protected String name;
    protected String country;
    protected int year;

    public Fridge10(String name, int year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }
    public void printAbout(){
        System.out.println("I Am good "+name);
    }
}
