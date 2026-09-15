public class second_largest {
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if(max<arr[i]) { 
                second_max = max;
                max = arr[i];
            }
            else if(second_max<arr[i] && arr[i]!=second_max) {
                second_max = arr[i];
             }
        }
        System.out.println("max:"+max+ "second max:"+second_max);
    }
    
}
