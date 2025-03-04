package Tasks;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int count = 5;
        int[] dices = rollDices(count);
        for(int dice : dices){
            System.out.println(dice);
        }
        int res = countIt(dices);
        System.out.println("res "+res);
    }

    private static int countIt(int[] dices) {
        int swaps = 0;
        for(int dice : dices){
            if(dice == 1){
                swaps = swaps +2;
                continue;
            }
            if(dice == 6){
                continue;
            }
            swaps++;
        }
        return swaps;
    }

    private static int[] rollDices(int count) {
        Random random = new Random();

        int[]dices = new int[count];
        for(int i = 0; i < count; i++){
                dices[i] = random.nextInt(6)+1;
        }
        return  dices;
    }
}
