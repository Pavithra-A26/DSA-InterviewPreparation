import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(findFactorial(n));

        sc.close();
    }

    public static int findFactorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact *= i;
        }

        return fact;
    }
}