package Tasks;

import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        boolean isPrime = false;

        int number = 9;
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 2;i < number;i++){
            if(number % i == 0){
              results.add(i);
            }
            if(results.isEmpty()){
                isPrime = true;
            }
        }
        System.out.println(isPrime);
    }
}
