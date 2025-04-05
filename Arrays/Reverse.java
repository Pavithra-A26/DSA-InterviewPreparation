//Reverse an array

import java.util.Scanner;

public class Reverse {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr,n);

        System.out.println("Reversed Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static int[] reverse (int[] arr,int n){
        int right =n-1;
        int left = 0;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }

        return arr;
    }
}
