public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={45,67,89,87,9,34};
        int target=89;
        for(int i=0;i<arr.length;i++){
            //if equal to target
            if(arr[i]==target){
                System.err.println("Found "+ target +" at index "+i);
            }
        }
        
    }
    
}
