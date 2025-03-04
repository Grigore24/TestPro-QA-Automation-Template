package Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Integer[]numbers = {1,2,12,34,56,78,45,78,34,55,98,78,89,90,67,2,6,8,11};
        //Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));
        Set<Integer> set = new HashSet<>();
        for (int v : numbers){
            set.add(v);
        }

        for(Integer number : set){
            int count = 0;
            for(Integer x: numbers){
                if(x == number){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(number+" x "+ count);
            }
        }
    }
}
