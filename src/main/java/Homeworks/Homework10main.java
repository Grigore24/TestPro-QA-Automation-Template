package Homeworks;

public class Homework10main {
    public static void main(String[] args) {
        Fridge10 myFridge = new Fridge10("DNEPR",1988);
        System.out.println(myFridge.getName());

        Guitar10 myGuitar = new Guitar10("BERTONI","ACUSTIC",2022);
        System.out.println(myGuitar.getSort());
        //Override
        myFridge.printAbout();
        myGuitar.printAbout();


    }
}
