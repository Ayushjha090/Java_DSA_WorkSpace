import java.util.Scanner;
public class App {
    public static int convertNumToDecimal(int num, int base){
        int power = 1;
        int decimalNum = 0;
        while(num > 0){
            int rem = num % 10;
            decimalNum += rem*power;
            power *= base;
            num /= 10;
        }
        return decimalNum;
    }
    public static int convertDecimalNum(int num, int base){
        int power = 1;
        int convertedNum = 0;
        while(num > 0){
            int rem = num % base;
            convertedNum += rem*power;
            power *= 10;
            num /= base;
        }
        return convertedNum;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // inputing num
        int n = sc.nextInt();
        //inputting base b1
        int b1 = sc.nextInt();
        //inputting base b2
        int b2 = sc.nextInt();

        //converting num from base b1 to decimal
        int decimalNum = convertNumToDecimal(n, b1);
        
        //converting decimalNum to num with base b2
        int convertedNum = convertDecimalNum(decimalNum, b2);

        System.out.println("(" + n + ")" + b1 + " --> (" + convertedNum + ")" + b2);
        sc.close();
    }
}
