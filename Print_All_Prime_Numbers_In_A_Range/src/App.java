import java.util.Scanner;
public class App {
    public static boolean isPrime(int num){
        boolean isPrime = false; // assuming number is not prime
        int count = 0; // variable to store the count of factors of num
        for(int div = 2; div * div <= num; ++div){
            // findig factors in this loop
            if(num % div == 0){
                count++;
                break; // if there is one factor present, then it is not prime hence not checking further
            }
        }
        if(count == 0){
            // no factor possible then,
            isPrime = true;
        }
        return isPrime;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // taking input starting and ending point of the range
        int low = sc.nextInt();
        int high = sc.nextInt();
        // loop to print all prime nos. in the given range
        for(int num = low; num <= high; ++num){
            // edge case because 1 is not a prime number
            if(num == 1){
                continue;
            }
            // in this loop we will check if the num is prime or not
            // if prime we will print the number
            if(isPrime(num)){
                System.out.print(num + " ");
            }
            // else we will skip the num
        }

        // TC - O(N*(N)^(1/2)) SC - O(1)
        sc.close();
    }
}
