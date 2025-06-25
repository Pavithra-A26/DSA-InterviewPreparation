public class SelectionSort{
    public static void main(String args[]){
        int[] arr = {5,2,3,1,4};

        findSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void findSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int mini = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
}