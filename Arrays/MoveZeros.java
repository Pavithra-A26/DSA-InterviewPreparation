public class MoveZeros {
    public static void main (String args[]){
        int[] arr ={0,1,0,10,9,0,0,2 };
        move(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void move(int[] arr){
        int n= arr.length;
        int j=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] !=0){
                arr[j] = arr[i];
                j--;
            }
        }

        while(j>=0){
            arr[j--] =0;
        }
    }
}
