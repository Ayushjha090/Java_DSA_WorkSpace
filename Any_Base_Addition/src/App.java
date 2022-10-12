import java.util.Scanner;
public class App {
    public static int findSum(int x, int y, int base){
        int sum = 0, carry = 0, power = 1;
        while(x > 0 && y > 0){
            int op1 = x % 10;
            int op2 = y % 10;
            int currSum = op1 + op2 + carry;
            if(currSum >= base){
                sum += (currSum % base) * power;
                carry = currSum / base;
            }else{
                sum += currSum * power;
                carry = 0;
            }
            power *= 10;
            x /= 10;
            y /= 10;
        }
        while(x > 0){
            int op = x % 10;
            int currSum = op + carry;
            if(currSum >= base){
                sum += (currSum % base) * power;
                carry = currSum / base;
            }else{
                sum += currSum * power;
                carry = 0;
            }
            power *= 10;
            x /= 10;
        }
        while(y > 0){
            int op = y % 10;
            int currSum = op + carry;
            if(currSum >= base){
                sum += (currSum % base) * power;
                carry = currSum / base;
            }else{
                sum += currSum * power;
                carry = 0;
            }
            power *= 10;
            y /= 10;
        }
        if(carry != 0){
            sum += carry * power;
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //inputting base b
        int b = sc.nextInt();
        //inputting operand 1
        int n1 = sc.nextInt();
        //inputting operand 2
        int n2 = sc.nextInt();

        //finding sum
        int sum = findSum(n1, n2, b);
        System.out.println(sum);
        sc.close();
    }
}
