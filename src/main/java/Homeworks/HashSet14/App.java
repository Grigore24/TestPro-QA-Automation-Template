package Homeworks.HashSet14;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors) ;

        System.out.println(colors.contains("Green"));

        Map<String,String> capitals = new HashMap<>();
        capitals.put("Canada","Ottava");
        capitals.put("Madagaskar","Antananarivu");
        capitals.put("Great Britain","London");
        capitals.put("England","London");
        capitals.put("China","Beijing");
        capitals.put("Germany","Bonn");
        capitals.put("Germany","Berlin");
        System.out.println(capitals);
        System.out.println(capitals.size());
        System.out.println(capitals.replace("China","Pekin"));

        System.out.println(capitals.get("China"));

        Map<Integer,String>colors1 = new HashMap<>();
        colors1.put(0,"Red");
        colors1.put(1,"Blue");
        colors1.put(2,"Green");
        colors1.put(3,"Red");
        System.out.println(colors1);
        System.out.println(">>>>>>>>>>");
        System.out.println(colors1.get(2));
        //Itteration по ключам
        for(String country : capitals.keySet()){
            System.out.println(country);
        }
        System.out.println(">>>>>>>>>>");

        Set<String>countries = capitals.keySet();
        for(String country: countries){
            System.out.println(country);
        }
        System.out.println(">>>>>>>>>>2222");
        countries.forEach(x-> System.out.println(x));

        //ітерація по значенням
        System.out.println(">>>>>>>>>>555");
        for(String city: capitals.values()){
            System.out.println(city);
        }

        System.out.println(">>>>>>>>>>3333");
        Collection<String>cities = capitals.values();
        for (String city : cities){
            System.out.println(city);
        }
        //через геттер вытаскиваем значения
        System.out.println(">>>>>>>>>>99999");

        Set<String>countries1 = capitals.keySet();
        for(String country: countries){
            System.out.println(capitals.get(country));
        }
        //иттерация энтри сет по парам
        System.out.println(">>>>>>>>>>0000");
        for(Map.Entry<String,String>pair : capitals.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

    }
}
