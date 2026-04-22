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
//        CatL7Methods firstCat = new CatL7Methods();
//        CatL7Methods.skreem();
//        firstCat.skreem();
//        firstCat.legs = 8;
//        firstCat.skreem();
        // Konstruktor
        CatL7Methods brownCat = new CatL7Methods("Hipe","Briton","Red",7);
        System.out.println(brownCat.color);

        //Getters & Setters
        L8Getters firstLion = new L8Getters();
        firstLion.setName("Simba");
        System.out.println(firstLion.getName());

    }
}
