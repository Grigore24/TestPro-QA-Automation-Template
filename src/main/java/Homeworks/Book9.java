package Homeworks;

public class Book9 {
    private String writer;
    private String country;
    private int year;

    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getWriter(){
        return writer;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    public void setYear(int year){
        if (year>2025 || year < 1925){
            throw new IllegalArgumentException("Wrong Year");
        }
        this.year = year;
    }
    public int getYear(){
        return year;
    }
}
