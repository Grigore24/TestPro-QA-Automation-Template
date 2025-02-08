package Enums;

public class App {
    public static void main(String[] args) {
        Colors nike = Colors.RED;
        System.out.println(nike);
        Candys uk = Candys.BOUNTY;
        System.out.println(uk);
        Candys ukraine = Candys.TWIX;
        System.out.println("Candy in Ukraine is "+ukraine);
        MusicPlay france = MusicPlay.AKORDEON;
        MusicPlay ireland = MusicPlay.GUITAR;
        System.out.println("In France people play on "+france);
        System.out.println("In Ireland people play on "+ireland);
    }
}
