import java.util.*;
public class pattern_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if (i==3 || j==3) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }


    }
}
