import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiagonalSort {
    public static void main(String[] args) {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};

        sorting(mat);
        // int r = mat.length;
        // int c = mat[0].length;

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(mat[i][j] + " ");
        //     }
        // }

        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] sorting(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;

        for(int i=0;i<r;i++){
            sort(mat,i,0);
        }

        for(int j=0;j<c;j++){
            sort(mat,0,j);
        }

        return mat;
    }

    public static void sort(int[][] mat , int row ,int col){
        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> result = new ArrayList<>();

        int r= row;
        int c= col;

        while (r<m && c<n) {
            result.add(mat[r][c]);
            r++;
            c++;
        }

        for(int i=1;i<result.size();i++){
            int j=i-1;
            int key = result.get(i);

            while(j>=0 && result.get(j)>key){
                result.set(j+1,result.get(j));
                j--;
            }

            result.set(j+1,key);
        }
        // Collections.sort(result);

         r=row;
         c = col;
        int index =0;

        while(r<m && c<n){
            mat[r][c] = result.get(index);
            index++;
            r++;
            c++;
        }
    }
}
