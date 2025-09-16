public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 78, 85, 6, 67, 89 };
        int FirstLargest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;
        
        //finding first largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > FirstLargest) {
                FirstLargest = arr[i];

            }
        }
        System.out.println(FirstLargest);

        //comparing first largest element to find second
        for(int i=0;i<arr.length;i++){
            if(arr[i]>SecondLargest && arr[i]<FirstLargest){
                SecondLargest=arr[i];
            }
        }
        System.out.println(SecondLargest);

    }
}
