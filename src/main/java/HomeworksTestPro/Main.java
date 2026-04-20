package HomeworksTestPro;

public class Main {
    public static void main(String[] args) {
Dog firstDog = new Dog();
Dog secondDog = new Dog();
Dog thirdDog = new Dog();


firstDog.bark();
firstDog.age = 4;
        System.out.println(firstDog.age);
secondDog.run();
thirdDog.age = 5;
thirdDog.getingOlder();
        System.out.println(thirdDog.age);
firstDog.name = "Bobik" ;
firstDog.printName(firstDog.name);

firstDog.isDogNameBobik();
        System.out.println(firstDog.isDogNameBobik());
        //comment


    }
}
