package HomeworksTestPro;

public class Dog {

    int age;
    String name;
    String color;
    String breed;

    public void bark(){
        System.out.println("gav-gav");
    }
    public void run() {
        System.out.println("Fast");
    }
    public void getingOlder() {
        age = age + 1;
    }
    public void printName(String name){
        System.out.println(name);
    }
    public boolean isDogNameBobik(){
        return true;
    }
}

