import java.util.Scanner;
public class App {
    public static int findCount(int num){
        int count = 0;      //variable to store count of digits in a number
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
        // TC - O(num of digits)
    }
    public static void printDigitsOfNum(int num){
        // this function print digits of number from left to right
        int numOfDigits = findCount(num);  // finding number of digits in the number
        
        // finding the divisor
        int divisor = (int)Math.pow(10, numOfDigits - 1);

        // loop to print digits of number separately from left to right
        while(divisor > 0){
            int digit = num / divisor;
            num = num % divisor;
            System.out.println(digit);
            divisor = divisor / 10;
        }
        
        // TC - O(num of digits)
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // taking input
        printDigitsOfNum(n);
        sc.close();
    }
}
