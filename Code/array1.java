import java.util.*;
public class array1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        // int[] arr = {10, 20, 30, 40, 50};

        //System.out.println("Array elements are:");

        //for (int i = 0; i < arr.length; i++) {
          //  System.out.println(arr[i]);
    
          int[] arr = new int[6];
          for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
          }
          for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
          }
        }
    }
