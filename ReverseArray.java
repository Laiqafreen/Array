import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Reverse Array In-place 
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        
        //Reverse Array using new Array
        int arrr[]={6,7,8,9,10};
        int newarr[] = new int[arrr.length];
        for (int i = 0; i < arrr.length; i++) {
            newarr[i] = arrr[arrr.length - 1 - i];

        }
        System.out.println(Arrays.toString(newarr));
    }

}
