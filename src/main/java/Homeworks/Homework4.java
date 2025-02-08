package Homeworks;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int[] yes = {33, 11, 22, 55, 873, 942, 559, 4};
        for (int v : yes) {
            System.out.println(v);
        }
        System.out.println(Arrays.toString(yes));
        for (int v : yes) {
            if (v % 2 == 0) {
                System.out.println(v);
            }

        }
        for (int v : yes) {
            if (v % 3 == 0) {
                System.out.println(v);
            }
        }
        int max = yes[0];
        for (int v : yes) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println("Max value is " + max);
        int min = yes[0];
        for (int v : yes) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println("Min value is " + min);
        for (int v : yes) {
            if (v % 2 != 0) {
                System.out.println("Odd " + v);
            }
        }
    }
}


