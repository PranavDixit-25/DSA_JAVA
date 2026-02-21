public class passbyvalueandreference {
    public static void change(int a) {
        a = 10;
    }
    public static void main(String[] args) {
        int a =6;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
}
