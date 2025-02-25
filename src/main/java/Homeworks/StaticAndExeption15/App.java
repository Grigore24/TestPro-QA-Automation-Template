package Homeworks.StaticAndExeption15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Smith");
        Person.setCount(4);
        //вызов статик переменной
        System.out.println(Person.getCount());
        //если переменная паблик
        System.out.println("<<<<<<");
        System.out.println(Person.count);

//вызов статик метода
        Person.hi();

        //вызов из обьекта не статического метода в  котором  находиться в статический метод hi
        anna.xx();
    }
}
