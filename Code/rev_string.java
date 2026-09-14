import java.util.*;
public class rev_string {
   public static void main(String[] args) {
    String s = new String("pranav");
    for(int i = s.length()-1;i>=0;i--) {
        System.out.print(s.charAt(i));
    }
   }
}
