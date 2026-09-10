public class returntype {
    public static int pranav() {
        System.out.println("my self pranav");
        return 5; //khatam 
    }
    public static void main(String[] args) {
        System.out.println(pranav()); // pranav() is a function with return type 5 therfore also works as a valur holding 5
        pranav();
        System.out.println(2+pranav());
    }
}
