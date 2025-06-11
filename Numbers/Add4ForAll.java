public class Add4ForAll {
    public static void main(String[] args) {
        int num = 2872;
        int digit = 4;

        long result = addDigit(4,2875);

        System.out.println(result);
    }

    static long addDigit(int digit , int num){
        // String str  = Integer.toString(num);
        // StringBuilder result = new StringBuilder();

        // for(char ch: str.toCharArray()){
        //     int digits = ch-'0' ;
        //     int sum = digits + digit;
        //     result.append(sum);
        // }

        // return result.toString();



        //Without changing as a string


        long result =0;
        long multiplier = 1;

        while(num>0){
            int digits = num%10;
            int sum = digit+digits;

            result += sum*multiplier;

            int temp = sum;

            while(temp>0){
                multiplier *=10;
                temp /= 10;
            }

            num/=10;
        }

        return result; 
    }
}
