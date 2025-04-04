//Finding Duplicates in ordered list of lements

import java.util.Scanner;

public class Duplicates {
     public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        findDuplicate(arr,n);

        sc.close();
    }

    public static void findDuplicate(int[] arr,int n){
        int i=0;

        System.out.println("Duplicate elements:");
        for(int j=0;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}
