package HomeworksTestPro;

public class HomeworkL3 {
    public static void main(String[] args) {
        int time =25;
        if (time <10) {
            System.out.println("Good morning");
        } else if (time < 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good night");
        }

        int btc = 9;
        if (btc < 10) {
            System.out.println("мало");
        } else if (btc >=10 && btc <=99) {
            System.out.println("среднее");
        } else {
            System.out.println("много");
        }

        char d = 'd';
        String vowels = "aeiouAEIOU";
        if(vowels.contains(Character.toString(d))){
            System.out.println("гласная");
        } else {
            System.out.println("согласная");
        }

        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wednesday");
        }
        int i = 4;
        int r = i%2;
        switch (r){
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
        }
    }
}
