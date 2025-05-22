public class OddEven {
    public static void main (String args[]){
        int[] arr = {1, 2, 3, 5, 4, 7, 10};

        int n = arr.length;

        int index =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }


        for(int i=0;i<index;i++){
            for(int j=i+1;j<index;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=index;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
