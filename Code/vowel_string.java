import java.util.*;
public class vowel_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++) {
             if (s.charAt(i) == 'a'||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

               
                count++;
            }
    }
    System.out.println("TOTAL VOVOLS:"+count);
}
}