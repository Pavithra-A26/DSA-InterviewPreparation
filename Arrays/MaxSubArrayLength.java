public class MaxSubArrayLength {
    public static void main(String args[]){
        int arr[] = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int length = findlength(arr);
        System.out.println("Max Len : "+length);
    }

    public static int findlength(int[] arr){
        int n= arr.length;
        int maxsum= Integer.MIN_VALUE;
        int curentsum =0;
        int strat=0;
        int tempstart =0;
        int maxlen=0;

        for(int i=0;i<n;i++){
            curentsum += arr[i];

            if(curentsum>maxsum){
                maxsum = curentsum;
                strat= tempstart;
                maxlen = i-tempstart+1;
            }

            if(curentsum<0){
                curentsum =0;
                tempstart = i+1;
            }
        }

        System.out.println("Max Sum: " + maxsum);

        return maxlen;
    }
}
