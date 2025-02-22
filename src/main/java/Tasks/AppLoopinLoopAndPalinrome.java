package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class AppLoopinLoopAndPalinrome {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int x:numbers){
            for(int y: numbers){
                System.out.printf(x * y +" ");
            }
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
        for(int i = 1;i<=12;i++){
            for(int j = 1;j<=12;j++){
                System.out.print(i * j+" ");
            }
            System.out.println();
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        int[] hundreed = new int[100];
        for(int i = 0; i< hundreed.length;i++){
            hundreed[i]=i;
        }
        System.out.println(Arrays.toString(hundreed));
        System.out.println("+++++++++++++++++++++");
        int [][] number = {{1,66,44,21},{88,67,53,32}};
        int myNumber = number[0][2];
        System.out.println(myNumber);
        System.out.println("__________");
        //проходим по масивам - сколько массиов в number
        for(int i = 0;i < number.length;i++){
            //проходим по числам внутри массива
            for(int j = 0;j < number[i].length;j++){
                System.out.println(number[i][j]);
            }

        }
        //сложение всех данных массива
        ArrayList<Integer>numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(2);
        numbers2.add(67);
        numbers2.add(21);
        numbers2.add(33);
        numbers2.add(3);

        int count = 0;
        for(int i = 0;i < numbers2.size();i++) {
            count = count + numbers2.get(i);
            //if(numbers2.get(i) % 2 == 0){
           //       numbers2.remove(numbers2.get(i));
            // }
        }
        System.out.println(count);
        System.out.println("=================");


     //   removeThree(numbers2);
        System.out.println(isPalindrome("aaaaaad"));


    }
//    public static void removeThree(ArrayList<Integer>numbers2){
//        for(int i = 0; i < numbers2.size();i++){
//            if(numbers2.get(i) == 3){
//                numbers2.remove(numbers2.get(i));
//            }
//            System.out.println(numbers2.get(i));
//        }
//    }
    public static boolean isPalindrome(String str){
        String reverseString = "";
        int strLength = str.length();
        for(int i = strLength - 1;i >= 0;i--){
            reverseString = reverseString + str.charAt(i);
        }
        return str.equals(reverseString);
    }

}
