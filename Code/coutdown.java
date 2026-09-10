import java.util.Scanner;

public class coutdown {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >=0) {
            System.out.println(n);
            n--;
        }
    }
}
