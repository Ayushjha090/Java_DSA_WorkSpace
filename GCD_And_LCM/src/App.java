import java.util.Scanner;
public class App {
    public static int findGCD(int num1, int num2){
        // using division method to find gcd of two numbers
        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }
    public static int findLCM(int num1, int num2){
        int lcm = (num1 * num2) / findGCD(num1, num2);
        return lcm;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println(gcd);
        System.out.println(lcm);
        sc.close();
    }
}
