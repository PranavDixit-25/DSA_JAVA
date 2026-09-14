import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strings");
        String a = sc.nextLine();
        System.out.println("your string length is :"+ a.length());
        String name = a.trim();
        System.out.println(name);
        System.out.println("length after trim:"+ name.length());
    }
    
}