package Homeworks11Composition;

public class App {
    public static void main(String[] args) {
        String str = new String("Hi");
        System.out.println(str);

        Address annaAddress = new Address("Gagarina str", "San Francisko city","SN4 0QZ",State.LA);
        String name = new String("Anna");
        Person anna = new Person(name,"Smith",25,annaAddress);

        Person david = new Person("David","ONeil", 26,
                new Address("Kutusova","New York","TY1 54X",State.NY));

       // Address da = david.getAddress();
       // String city = da.getCity();
        String city = david.getAddress().getCity();

        Team dinamo = new Team(anna,david);
        String annaStreet = dinamo.getLeader().getAddress().getStreet();
        System.out.println(annaStreet);

        System.out.println(annaAddress);

        System.out.println(anna);

        System.out.println(dinamo);

    }
}
