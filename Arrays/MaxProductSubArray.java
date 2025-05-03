import java.util.Scanner;

public class MaxProductSubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxProductSubArray(arr,n));
    }

    public static int findMaxProductSubArray(int[] arr,int n){
        int result = Integer.MIN_VALUE;
        int pre=1;
        int suf =1;

        for(int i=0;i<n;i++){
            if(pre==0){
                pre =1;
            }
            if(suf ==0){
                suf=1;
            }
            pre *= arr[i];
            suf *= arr[n-i-1];

            result = Math.max(result,Math.max(pre,suf));
        }

        return result;
    }
}
