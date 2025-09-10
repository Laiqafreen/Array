import java.util.Arrays;
import java.util.Scanner;

public class InOutput{
    public static void main(String[] args) {
       // Input to 1D array
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); 
        }
        System.out.println(Arrays.toString(arr));

        // Input to 2D array
        int arr2[][] = new int[3][2];
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[row].length;col++){
                arr2[row][col]=sc.nextInt();
            }
        }
        // for(int row=0;row<arr2.length;row++){
        //      System.out.println(Arrays.toString(arr2[row]));
        // }
        System.out.println(Arrays.deepToString(arr2));
      
            

        }
        
        
       
    }
    