import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int val : arr) {
            System.out.print(val +" ");
        }
        int sum=0;
        for (int a=0;a<n;a++) {
            sum = sum + arr[a];
        }
        System.out.println();
        System.out.println("sum of array is" + sum);
        int mul=1;
        for (int b=0;b<n;b++) {
            mul = mul * arr[b];
        }
        System.out.println();
        System.out.println("mul of array is" + mul);
        int max =0;
        for (int c=0;c<n;c++) {
            if (arr[c] >= max) {max = arr[c];}}
            System.out.println("MAX element is" + max);
    }
}
