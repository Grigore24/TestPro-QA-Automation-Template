package Homeworks;

public class Homework8main {
    public static void main(String[] args) {
        IPhone anna = new IPhone();
        anna.color = Colors.RED;
        anna.model = 13;
        anna.PhoneName = "Iphone";
        System.out.println("Anna have " + anna.PhoneName + " model " + anna.model + " color " + anna.color);
        anna.callIphone();
        anna.sentSms();
    }
}
