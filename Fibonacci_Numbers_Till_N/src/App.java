import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0; // first fibonaaci number
        int b = 1; // second fibonacci number
        int c; // to store next fibonacci numbers
        for(int i = 0; i < n; ++i){
            System.out.print(a + " "); // printing fibonacci nums
            c = a + b; // fib(n) = fib(n-1) + fib(n-2)
            a = b;
            b = c;
        }
        sc.close();
    }
}
