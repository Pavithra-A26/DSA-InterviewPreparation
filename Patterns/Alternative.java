public class Alternative {
    public static void main(String[] args) {
        int n=3;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j%2);
            }

            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=2*i-1;j++){
                 System.out.print(j%2);
            }
             System.out.println();
        }

    }
}



// 1
// 101  
// 10101
// 101  
// 1 
