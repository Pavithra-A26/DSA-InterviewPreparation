package Numbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        System.out.println(findprime(num));

        sc.close();
    }

    public static boolean findprime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
