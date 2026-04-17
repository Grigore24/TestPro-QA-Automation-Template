package HomeworksTestPro;

public class HWL4Loops {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 4) {
            System.out.println("Value of x: " + x);
            x++;
        }
        int y = 1;
        int sum = 0;
        while (y <= 100) {
            sum = sum + y;
            y = y + 1;
        }
        System.out.println(sum);

        //int u = 1;
        int summ = 0;
        for (int u = 1; u <= 100; u++) {
            summ = summ + u;
        }
        System.out.println(summ);

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        int count = 0;
        while (count < 150) {
            System.out.print("a");
            count++;
        }
        //Fibonachi
        int n = 10;
        int first = 0;
        int second = 1;
        int third = 0;
        System.out.println(first);
        System.out.println(second);
        for (int mount = 0; mount < n; mount++) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
        // Loop do while
        int c = 1;
        do {
            System.out.println("a");
            c++;
        } while (c < 10);

        //for each Loop
        String[] daysOfWeek = {"Mon", "Tue","Wedn"};
        for (String dayWeek : daysOfWeek){
            System.out.println(dayWeek);
        }
    }
    //перезапуск

}
// git pull
