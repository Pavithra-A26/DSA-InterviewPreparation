import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        System.out.println(isPalindrome(num));

        sc.close();
    }

    public static boolean isPalindrome(int n){
        int original = n;
        int reversed =0;
        
        while(n>0){
            int digit = n%10;
            reversed = reversed*10+digit;
            n/=10;
        }
        
        return original==reversed;
    }

}
