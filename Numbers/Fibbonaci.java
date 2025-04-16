package Numbers;
import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        FindFibbonaci(n);

        sc.close();
    }

    public static void FindFibbonaci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+ " ");

        for(int i=1 ;i<n;i++){
            System.out.print(b + " ");
            int next = a+b;
            a = b;
            b= next;
        }

        System.out.println();
    }

}
