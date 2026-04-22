package HomeworksTestPro;

public class CatL7Methods {
    //static atribute
    static int  legs = 4;
    //static metod
    public static void skreem () {
        System.out.println(legs);
    }

    //Konstruktor method
    String name;
    String breed;
    String color;
    int age;

    public CatL7Methods(String name,String breed,String color,int age){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
}
