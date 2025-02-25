package Homeworks.StaticAndExeption15;

public class AppExeption {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[]xx = {10,12};
       // int b = 10;
        System.out.println("Begeining");

        try{
            System.out.println("Before pro");
            xx[4] = 12;
            System.out.println(a/b);
            System.out.println( xx[3] = 12);
            System.out.println("After pro");
        }
        catch(ArithmeticException err){
            System.out.println("In catch block");
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Second block");
        }
        finally {
            System.out.println("ANY CASE");
        }
        System.out.println("END");


    }
}
