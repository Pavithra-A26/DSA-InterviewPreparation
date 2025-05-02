public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=2*n-1;i++){
            int star =i;
            if(i>=n) star = 2*n-i;

            for(int j=0;j<star;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
