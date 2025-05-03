import java.util.Scanner;

class MaxProduct{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxProduct(arr,n));
    }

    public static int findMaxProduct(int[] arr,int n){
        int maxi = 1;

        for(int i=0;i<n;i++){
            int product = Math.max(maxi*arr[i],arr[i]);
            maxi = Math.max(maxi,product);
        }

        return maxi;
    }
}