import java.util.ArrayList;

public class Leaders{
    public static void main(String args[]){
        int[] arr = {1, 2, 5, 3, 1, 2};

        System.out.println(findLeaders(arr));
    }

    public static ArrayList<Integer> findLeaders(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;
        int max = arr[n-1];

        result.add(max);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                result.add(arr[i]);
                max= arr[i];
            }
        }

        return result;
    }
}