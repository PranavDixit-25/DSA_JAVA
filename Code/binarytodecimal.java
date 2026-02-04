import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary");
        int n = sc.nextInt();
        int decimal = 0;
        int base = 1; 
        while (n > 0) {
            int ldig = n % 10;
            decimal = decimal + ldig * base;
            base = base * 2;
            n = n / 10;
        }
        System.out.println(decimal);
    }
}
