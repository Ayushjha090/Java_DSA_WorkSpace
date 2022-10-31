import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        // loop to find prime factors
        for(int div = 2; div * div <= num; ++div){
            while(num % div == 0){
                // we will print this factor till it is able to divide the num
                num = num / div;
                System.out.print(div + " ");
            }
        }

        // above loop runs only till sqrt(num)
        // there might be a situation when we were not able to find all the prime factors from the above loop
        // then the remaining number is the last prime factor
        if(num != 1){
            System.out.println(num);
        }
        sc.close();
    }
}
