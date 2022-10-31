import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int countOfDigits = 0;
        int temp = n;
        while(temp != 0){
            countOfDigits++;
            temp = temp / 10;
        }

        k = k % countOfDigits;
        if(k < 0){
            k = k + countOfDigits;
        }

        int divisor = 1, multi = 1;
        for(int i = 1; i <= countOfDigits; ++i){
            if(i <= k){
                divisor = divisor * 10;
            }else{
                multi = multi * 10;
            }
        }

        int q = n / divisor;
        int r = n % divisor;

        int rotatedNum = r * multi + q;
        System.out.println(rotatedNum);
        sc.close();
    }
}
