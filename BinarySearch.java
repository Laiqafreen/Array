import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,9,8,7};
        Arrays.sort(arr);
        int target=7;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                System.out.println("Found element at index "+ mid);
                break;
            }else if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
    }
    
}
