import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,1,9,67,89};
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
