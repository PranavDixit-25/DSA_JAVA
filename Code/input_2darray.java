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
    int sum=0;
    int mul=1;
    int max=-999999;
    int min=999999;
    for(int r=0;r<arr.length;r++) {
        for(int c=0;c<arr[r].length;c++) {
            sum=sum+arr[r][c];
            mul*=arr[r][c];
            if(max<=arr[r][c]) {max=arr[r][c];}
            if(min>=arr[r][c]) {min=arr[r][c];}
        }
    }
            System.out.println("sum:"+sum+"product:"+mul+"max:"+max+"min:"+min);

    }

}
