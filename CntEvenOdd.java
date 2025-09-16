public class CntEvenOdd {
    public static void main(String[] args) {
        int arr[]={23,45,56,78,89,88,44};
        int n = arr.length-1;
        int cntEvn=0;
        int cntOdd=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                cntEvn++;
            }else{
                cntOdd++;
            
        }
    }
    System.out.println(cntEvn);
    System.out.println(cntOdd);
    
}
}
