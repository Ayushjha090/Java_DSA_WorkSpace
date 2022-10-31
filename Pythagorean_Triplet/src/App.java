import java.util.Scanner;
public class App {
    public static boolean isPythagoreanTriplet(final int a, final int b, final int c){
        boolean ans = false;  // initially assuming our ans is false
        if(a > b && a > c){
            if((b*b) + (c*c) == (a*a)){
                ans = true;
            }
        }else if(b > a && b > c){
            if((a*a) + (c*c) == (b*b)){
                ans = true;
            }
        }else{
            if((a*a) + (b*b) == (c*c)){
                ans = true;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean ans = isPythagoreanTriplet(a, b, c);
        System.out.println(ans);

        sc.close();
    }
}
