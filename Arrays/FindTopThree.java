import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindTopThree {
    public static void main(String[] args) {
        int[] arr= {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        int[] result = findtopthree(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }

    public static int[] findtopthree(int[] arr){
        LinkedHashMap <Integer,Integer> map = new LinkedHashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> entrylist = new ArrayList<>(map.entrySet());
        entrylist.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[3];
        int count=0;

        for(Map.Entry<Integer,Integer> entry : entrylist){
            
            result[count] = entry.getKey();
            count++;
            if(count==3){
                break;
            }
        }
    return result;
    }
}
