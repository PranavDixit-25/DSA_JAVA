import java.util.*;
public class array {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println(arr[0] + arr[1]);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//for each loop
        for(int val : arr) {
            System.out.println(val);
        }
    }
}
