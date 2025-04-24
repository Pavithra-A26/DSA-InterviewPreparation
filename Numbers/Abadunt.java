//An abundant number is a positive integer for which the sum of its 
//proper divisors (excluding the number itself) is greater than the number.

import java.util.Scanner;

public class Abadunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        System.out.println(IsAbadunt(num));

        sc.close();
    }

    public static int FindSumOfDivisors(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static boolean IsAbadunt(int num){
        if(num<FindSumOfDivisors(num)){
            return true;
        }
        return false;
    }
}

// Let’s take 12:

// Proper divisors of 12: 1, 2, 3, 4, 6

// Sum of divisors = 1 + 2 + 3 + 4 + 6 = 16

// Since 16 > 12 → 12 is an abundant number

// Formula (for checking):
// Let n be a number.
// If sum of proper divisors of n > n, then n is abundant.

// First few abundant numbers:
// 12, 18, 20, 24, 30, 36, 40, 42, 48...
