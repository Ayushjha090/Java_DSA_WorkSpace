import java.util.Scanner;
public class App {
    public static void printReversedNum(int num){
        // special case when n is 0
        if(num == 0){
            System.out.println(0);
            return;
        }

        // loop to print num in reverse fashion
        while(num > 0){
            int digit = num % 10; // getting right most digit of the number num
            num = num / 10;
            System.out.println(digit);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReversedNum(n);
        sc.close();
    }
}
