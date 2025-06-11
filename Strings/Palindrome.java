public class Palindrome {
    public static void main(String[] args) {
        String str = "amma malayalam for the goog";

        int count = findcount(str);
        
        System.out.println(count);

    }

    static int findcount(String str){
        int n = str.length();

        int count =0;
        String word = "";

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                word += ch;
            }else{
                if(!word.isEmpty() && ispalindrome(word)){
                    count++;
                }

                word = "";
            }
        }

        if(!word.isEmpty() && ispalindrome(word)){
                    count++;
                }

                
        return count;
    }


    static boolean ispalindrome(String word){
        int i=0;
        int j = word.length()-1;

        while(i<j){
            if(word.charAt(i++)!=word.charAt(j--)){
                return false;
            }
        }

        return true;
    }
}
