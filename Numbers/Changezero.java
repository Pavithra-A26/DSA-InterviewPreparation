import java.util.Scanner;

public class Changezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        System.out.println(changing(num));

        sc.close();
    }

    public static int changing(int num){
        String number = String.valueOf(num).replace('0', '1');

        return Integer.parseInt(number);
    }
}
