import java.util.Scanner;
public class App {
    public static int convertToDecimal(int num, int base){
        int decimalNum = 0;
        int power = 1;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            decimalNum += rem * power;
            power = power * base;
        }
        return decimalNum;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();

        int decimalNum = convertToDecimal(num, base);
        System.out.println("(" + num + ")" + base + " --> (" + decimalNum + ")10");
        scn.close();
    }
}
