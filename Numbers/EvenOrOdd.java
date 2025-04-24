import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        System.out.println(findEvenOrOdd(num));

        sc.close();
    }

    public static String findEvenOrOdd(int num){
        if(num%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
