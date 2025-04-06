package Numbers;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        System.out.println(findamstrong(num));

        sc.close();
    }

    public static boolean findamstrong(int num){
        int original = num;
        int sum=0;
        int n = String.valueOf(num).length();

        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit, n);
            num/=10;
        }

        return original==sum;
    }
}
