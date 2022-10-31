import java.util.Scanner;
public class App {
    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // taking input number
        int numOfDigits = countDigits(n);  // function to find number of digits
        System.out.println(numOfDigits);
        sc.close();
    }
}
