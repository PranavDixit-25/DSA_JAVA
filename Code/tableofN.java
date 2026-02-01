import java.util.*;
public class tableofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the number you want to print the table");
    int a = sc.nextInt();
    for(int i = 1 ; i <= 10 ; i++) {
        int b = a * i;
        System.out.println(b); 
    }
    }

}
