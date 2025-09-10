public class MaxMin {
    public static void main(String[] args) {
        int arr[] ={123,34,155,9,189,5};
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println(min);
        System.out.println(max);
    }
    
}
