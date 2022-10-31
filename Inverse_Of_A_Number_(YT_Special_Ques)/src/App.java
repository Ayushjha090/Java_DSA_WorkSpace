import java.util.Scanner;
public class App {
    public static int findInverse(int num){
        int outputNum = 0;
        int originalPos = 1;
        while(num != 0){
            int originalDigit = num % 10;
            int invertedPos = originalDigit;
            int invertedDigit = originalPos;

            outputNum += invertedDigit * (int)Math.pow(10, invertedPos - 1);
            originalPos++;
            num = num / 10;
        }
        return outputNum;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // taking input
        int num = sc.nextInt();
        int inverseNum = findInverse(num);
        System.out.println(inverseNum);
        sc.close();
    }
}
