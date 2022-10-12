import java.util.Scanner;
public class App {
    public static int getDigitFreq(int n, int d){
        int count = 0;
        while(n != 0){
            int rem = n % 10;
            if(rem == d) count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int freq = getDigitFreq(n, d);
        System.out.println(freq);
        sc.close();
    }
}
