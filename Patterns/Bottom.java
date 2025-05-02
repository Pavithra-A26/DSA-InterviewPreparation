public class Bottom {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
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
