import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortByFrequency {
    public static void main (String args[]){
        int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};

        List<Integer> result = sortByFrequencyelement(arr);

        System.out.println(result);
    }

    static List<Integer> sortByFrequencyelement(int[] arr){
        int n= arr.length;


        HashMap<Integer,Integer> freqmap = new HashMap<>();
        HashMap<Integer,Integer> firstIndex = new HashMap<>();
        for(int i=0;i<n;i++){
            freqmap.put(arr[i], freqmap.getOrDefault(arr[i], 0)+1);
            firstIndex.putIfAbsent(arr[i], i);
        }

        ArrayList<Integer> list = new ArrayList<>(freqmap.keySet());

        list.sort((a,b) ->{
            int freqCompare = Integer.compare(freqmap.get(b), freqmap.get(a));

            if(freqCompare != 0){
                return freqCompare;
            }else{
                return Integer.compare(firstIndex.get(a), firstIndex.get(b));
            }
        }
        );


        List<Integer> result = new ArrayList<>();

        for(int i=0;i<Math.min(3,list.size());i++){
            result.add(list.get(i));
        }

        return result;
    }
}
