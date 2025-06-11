public class Lexicographic{
    public static void main(String[] args) {
        String[] strs = {"banana" , "orange" , "apple"};

        sort(strs);

        for(int i=0;i<strs.length;i++){
            System.out.print(strs[i] + " ");
        }
    }

    static void sort(String[] strs){
        int n = strs.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(compare(strs[j],strs[j+1])>0){
                    String temp = strs[j];
                    strs[j] = strs[j+1];
                    strs[j+1] = temp;
                }
            }
        }
    }

    static int compare(String a, String b){
        int n = Math.min(a.length(),b.length());

        for(int i=0;i<n;i++){
            if(a.charAt(i)<b.charAt(i)){
                return -1;
            }else if(a.charAt(i)>b.charAt(i)){
                return 1;
            }
        }

        if(a.length()<b.length()){
            return -1;
        }
        else if(a.length()>b.length()){
            return 1;
        }

        return 0;
    }
}