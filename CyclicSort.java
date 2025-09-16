import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]={3,6,4,5,1,2};
        int i=0;
        while(i<arr.length){
            int correctindex = arr[i]-1;
            if(arr[i]==arr[correctindex]){
                i++;
            }else{
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            } 
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
