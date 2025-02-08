package Homeworks;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        int[] ok = {3, 11,56,50,32,12};
        System.out.println(sum(ok));
        int[] yes = {25,75,100,200,2,500,100};
        System.out.println(sum(yes));
        sort(yes);
        sort(ok);
        System.out.println(arrayMin(ok));
        System.out.println(arrayMin(yes));


    }

    public static int sum(int[] arr) {
        int summa = 0;
        for (int v : arr) {
             summa = summa + v;
        }
        return summa;
    }
    public static void sort(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int arrayMin(int[]arr){
        int min = arr[0];
        for(int v : arr){
            if(v < min){
                min = v;
            }
        }
        return min;
    }
}



