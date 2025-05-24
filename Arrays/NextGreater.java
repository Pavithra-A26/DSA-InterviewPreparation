import java.util.Stack;

public class NextGreater {
    public static void main (String args[]){
        int[] arr ={1, 3, 2, 4};
        int[] result = findnextGreater(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }

    public static int[] findnextGreater(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        Stack <Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            result[i] = st.isEmpty()?-1:st.peek();

            st.push(arr[i]);
        }

        return result;
    }
}
