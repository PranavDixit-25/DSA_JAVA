import java.util.*;
public class maxof3_builtin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 integers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //int d = Math.max(a,b);
        //int e = Math.max(d,c);
       // System.out.println("largest integer is:" + e);
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
