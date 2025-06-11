public class Numbers {
    public static void main (String args[]){
        int n=4;

        int num =1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            int count = num+i-1;
            for(int j=0;j<i;j++){
                System.out.print(count-- + " ");
            }

            num +=i;

            System.out.println();
        }

    }
}
