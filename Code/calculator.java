import java.util.*; 
public class calculator {
    public static void main(String[] args) {
        System.out.println("enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter 1 for addtion \nenter 2 for sub \nenter 3 for mult \nenter 4 for div \nenter 5 for modulo " );
        int n = sc.nextInt();
        switch(n) {
           case 1 :
            int add = a + b; 
           System.out.println("sum is:" + add);
           break;
           case 2 :
            int sub = a - b; 
           System.out.println("sub is:" + sub);
           break;
           case 3 :
            int mult = a * b; 
           System.out.println("mult is:" + mult);
           break;
           case 4 :
            int div = a / b; 
           System.out.println("div is:" + div);
           break;
           case 5 :
            int modu = a % b; 
           System.out.println("modulo is:" + modu);
           break;
        }

    }
}
