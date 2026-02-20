import java.util.Scanner;

public class calculator_fun {
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void diff(int a,int b){
        System.out.println(a-b);
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enyter the integers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("enter 1 for addation \n 2for diff \n 3 for mul \n 4 for div");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                add(x,y);
                break;
            case 2:
                diff(x,y);
                break;
            case 3:
                mul(x,y);
                break;
            case 4:
                div(x,y);
                break;
        
            default:
                System.out.println("enter valid input");
                break;
        }
    }
}
