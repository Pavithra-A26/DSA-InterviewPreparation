import java.util.ArrayList;

public class InserOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 1, 1, 4};
        int k=2;

        ArrayList<Integer> result = insertAfter(arr,k);

        System.out.println(result);
    }

    static ArrayList<Integer> insertAfter(int[] arr, int k){
        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();
        int count =0;
        for(int i=0;i<n;i++){
            int num = arr[i];

            if(num != 1){
                result.add(num);
                count =0;
            }else{
                count ++;
                result.add(num);
                if(count==k){
                    result.add(0);
                    count =0;
                }
            }
        }

        return result;
    }
}
