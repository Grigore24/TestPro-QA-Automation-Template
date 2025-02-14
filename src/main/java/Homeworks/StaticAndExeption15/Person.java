package Homeworks.StaticAndExeption15;

public class Person {
    private String name;
    private String lastName;
    public static int count;

    public void xx(){
        hi();
    }

    public static void hi(){
        System.out.println("Hi");
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
}
