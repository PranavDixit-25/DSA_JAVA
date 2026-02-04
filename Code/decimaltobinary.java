import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the decimal");
        int n = sc.nextInt();
        int binary = 0;
        int place = 1;
        while (n > 0) {
            int rmdr = n % 2;
            binary += rmdr * place;
            place *= 10;
            n /= 2;
        }

        System.out.println(binary);
    }
}
