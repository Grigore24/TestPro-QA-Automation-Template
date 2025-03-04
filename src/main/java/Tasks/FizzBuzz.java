package Tasks;

public class FizzBuzz {
    public static void main(String[] args) {
        fizbuzz(100);
    }

    public static void fizbuzz(int bound) {
        for(int i =1; i<= bound;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if(i%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
