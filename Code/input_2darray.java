import java.util.*;
public class input_2darray {
   static int row ; static int col ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows in 2d array");
        row=sc.nextInt();
        System.out.println("enter no of cols in 2d array");
        col=sc.nextInt();
        int arr[][];
        arr = new int[row][col];
        for (row=0;row<arr.length;row++) {
            for(col=0;col<arr[row].length;col++) {
                System.out.println("enter elemt with ROW:"+row+"COL:"+col);
                arr[row][col] = sc.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++) {
        for(int col=0;col<arr[row].length;col++) {
            System.out.print(arr[row][col]+" ");}
        System.out.println(" ");
    }
    }

}
