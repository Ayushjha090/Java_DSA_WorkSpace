import java.util.Scanner;
public class App {
    public static boolean checkPrime(int n){
        boolean isPrime = false; // assuming number is not prime initially
        int count = 0;  // to store the count of factors of the number 'n'
        // loop to find the factors of number 'n'
        for(int div = 2; div * div <= n; ++div){
            if(n % div == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            // no factors found hence the number is prime
            isPrime = true;
        }
        return isPrime;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // taking number input
        int n = sc.nextInt();
        boolean isPrime = checkPrime(n); // checking if the input num is prime or not
        if(isPrime){
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
}
