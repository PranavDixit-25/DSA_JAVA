public class pyr {
    public static void main(String[] args){
        int n = 5;
        for(int row=1;row<=n;row++) {
            for(int spc=n-row;spc>0;spc--) {
                System.out.print("  ");
            }
            for(int col=1;col<=2*row-1;col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
