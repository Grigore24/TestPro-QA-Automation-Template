package Tasks;

public class Remainder {
    public static void main(String[] args) {
        int res = remainder(12,2);
        System.out.println("expected res to be 0 "+ res);
    }
    private static int remainder(int a,int b){
        while(a>=b){
            a = a - b;
        }
        return a;
    }
}
