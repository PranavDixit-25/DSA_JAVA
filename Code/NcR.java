import java.util.*;
public class NcR {
    public static int factorial(int a) {
        int fact = 1;
        for(int i=1;i<=a;i++) {
            fact = fact * i;
            
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for N and R");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("NcR=" +  factorial(n)/(factorial(r)*factorial((n-r))));
    }
}
