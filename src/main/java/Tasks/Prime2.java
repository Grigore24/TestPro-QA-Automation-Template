package Tasks;

public class Prime2 {
    public static void main(String[] args) {
        int n = 9;

        boolean prime = true;
        for(int i = 2;i < n; i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        if(n > 2 && prime){
            System.out.println(n + " is prime");
        }else {
            System.out.println(n + " is not prime");
        }
    }
}
