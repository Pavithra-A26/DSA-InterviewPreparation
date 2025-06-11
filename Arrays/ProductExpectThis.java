public class ProductExpectThis {
    public static void main (String args[]){
        int[] arr ={1, 2, 3, 4};
        int[] result = productExpceptThis(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }

    public static int[] productExpceptThis(int[] arr){
        int n= arr.length;
        int[] result = new int[n];

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = arr[i-1] * left[i-1];
        }

        right[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            right[i] = arr[i+1] * right[i+1];
        }

        for(int i=0;i<n;i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
