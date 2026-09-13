import java .util.*;
public class twoDarray {
    public static void main(String[] args) {
    //declaration
    int[][] arr;
    //allocation
    arr = new int[3][4]; //3 row 4 coloumb
   //arr = { {1,2,3,4},{5,6,7,8},{1,2,3,4}};
   //initialtion
    int brr[][] = {
        {1,2,3},{4,5,6},{7,8,9},{7,4,8}
    };
    System.out.println(brr[0][2]);
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++){
            System.out.print(brr[i][j] +" ");
        }
        System.out.println(" ");
    }
    int crr[][] = {
        {1,2},{3,4,5,6,},{7,8,9,},{0}
    };
    for(int row=0;row<crr.length;row++) {
        for(int col=0;col<crr[row].length;col++) {
            System.out.print(crr[row][col]+" ");        }
        System.out.println(" ");
    }
}
}