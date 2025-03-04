package Tasks;

public class PrimeNumbers {
    public static void main(String[] args) {
        primeNumbers(10000);
    }

    public static void primeNumbers(int bound) {
        for(int i = 2; i<=bound; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number){
       // for(int i = 2; i < number; i++){
        for(int i = 2; i <=Math.sqrt(number);i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
