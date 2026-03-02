import java.util.*;
public class arr_negtiveelementsonly {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements for your array");
        for(int i=0;i<=n-1;i++) {
            arr[i] = sc.nextInt();
        }
       
        for (int i=0;i<=arr.length-1;i++) {
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }

    }
}
