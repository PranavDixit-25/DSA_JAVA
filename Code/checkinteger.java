import java.util.*;
public class checkinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        double a = sc.nextDouble();
        double b = (int)a;
        if (a-b == 0) System.out.println("is integer");
        else System.out.println("not an integer");
    }
}