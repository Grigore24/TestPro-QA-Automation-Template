package Homeworks;

public class Homework5 {
    public static void main(String[] args) {
        hello(3,6);
        hello(5,5);
        hello(25,3);
        int res = sum(7,10);
        int res1 = sum(25,35);
        int res3 = sum(44,66);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res3);
        boolean res5 = isEven(5);
        boolean res6 = isEven(44);
        System.out.println(res5);
        System.out.println(res6);
    };
    public static void hello(int a, int b){
        System.out.println( a * b);
    }
    public static int sum(int c,int d){
        return c + d;
    }
    public static boolean isEven(int a){
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}
