import java.util.ArrayList;
import java.util.List;

class PrintDiagonal{
    public static void main(String args[]){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        List<Integer> result = printElements(arr);

        System.out.print(result);
    }

    public static List<Integer> printElements(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        List<Integer> result = new ArrayList<>();

        for(int col=c-1;col>=0;col--){
            int i = r-1;
            int j = col;
            while(i>=0 && j<c){
                result.add(arr[i][j]);
                i--;
                j++;
            }
        }


        for(int row = r-2; row>=0;row--){
            int i=row;
            int j=0;

            while(i>=0 && j<c){
                result.add(arr[i][j]);
                i--;
                j++;
            }
        }

        return result;
    }
}