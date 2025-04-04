//This code for find the duplicate elements in unordered list of elements


import java.util.HashMap;
import java.util.Scanner;

class FindDuplicate{
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

    public  static void findDuplicate(int[] arr ,int n){
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int num:arr){
            frequency.put(num,frequency.getOrDefault(num, 0)+1);
        }

        System.out.println("Repeating.....");

        for(int key:frequency.keySet()){
            if(frequency.get(key)>1){
                System.out.print(key + " ");
            }
        }
    }
}