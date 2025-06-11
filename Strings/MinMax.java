// Given two strings, find the first occurrence of all characters of second string in the first 
// string and print the characters between the least and the highest index

public class MinMax{
    public static void main(String args[]){
        String str1 = "hellotheregeneral";
        String str2 = "hero";

        String result = findSubString(str1,str2);

        System.out.println(result);
    }

    static String findSubString(String str1 , String str2){
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (char ch : str2.toCharArray()) {
            boolean found = false;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ch) {
                    minIndex = Math.min(minIndex, i);
                    maxIndex = Math.max(maxIndex, i);
                    found = true;
                }
            }

        }

        //  for (char ch : str2.toCharArray()) {
        //     int index = str1.indexOf(ch);
        //     if (index != -1) {
        //         minIndex = Math.min(minIndex, index);
        //         maxIndex = Math.max(maxIndex, index);
        //         foundChars.add(ch);
        //     }
        // }

        return str1.substring(minIndex+1, maxIndex+1);
    }
}
