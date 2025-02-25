package Homeworks.Arraylist13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        Person david = new Person("David");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Violet");
        System.out.println(colors);

        colors.add(2, "Pink");
        System.out.println(colors);

        System.out.println(colors.get(4));

        String oldValue = colors.set(4, "Orange");
        System.out.println(colors);
        System.out.println("Old value " + oldValue);

        System.out.println(colors.size());
        oldValue = colors.remove(1);
        System.out.println(colors);
        System.out.println(colors.size());

        colors.remove("Grey");
        //return false
        System.out.println(colors);
        //if 2 same elements - will remove first element

        System.out.println(colors.contains("Orange"));
        //return true

        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(99);
        System.out.println(numbers);

        List<Person> team = new ArrayList<>();
        team.add(new Person("Anna"));
        team.add(new Person("David"));
        System.out.println(team.get(1).getName());

        for(String color: colors){
            System.out.println(color);
        }
        for(int i = 0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        colors.forEach(System.out::println);
        System.out.println("<<<<<<<<<<<------");

        colors.forEach(x-> System.out.println(x));
    }
}
