package Tasks;

public class AppFibonachi {
    public static void main(String[] args)  {
        //fibonachi
        int n = 10;//how many numbers we show on the screen
        int first = 0;
        int second = 1;
        int third = 0;

        System.out.println(first);
        System.out.println(second);
        for(int count = 0;count < n;count++){
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
