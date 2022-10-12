import java.util.Scanner;
public class App {
    public static int convertNum(int num, int base){
        int convertedNum = 0;
        int power = 1;
        while(num > 0){
            int rem = num % base;
            convertedNum += rem * power;
            power *= 10;
            num /= base;
        }
        return convertedNum;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();

        int convertedNum = convertNum(num, base);
        System.out.println("(" + num + ")10 --> (" + convertedNum + ")" + base);
        scn.close();
    }
}
