package Homeworks.HashSet14;

import java.util.ArrayList;
import java.util.Iterator;

public class App2ITTERATOR {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Violet");
        System.out.println(colors);
        Iterator<String>iterator = colors.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
