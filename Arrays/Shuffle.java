import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        shuffleArray(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void shuffleArray(int[] arr){
        int n = arr.length;
        Random rand = new Random();
       

        for(int i=0;i<n;i++){
            int j = rand.nextInt(i+1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
