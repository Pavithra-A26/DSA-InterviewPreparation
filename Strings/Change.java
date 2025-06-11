public class Change {

    public static void main(String args[]){
        // String s1 = "kitten";
        // String s2 = "sitting";

        String s1 = "flaw";
        String s2 = "lawn";
    
        int count = findchangingChars(s1,s2);
        System.out.println(count);

    }

    public static int findchangingChars(String s1 , String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            dp[i][0] = i;
        }

        for(int j=0;j<=n;j++){
            dp[0][j] = j;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] =1 + Math.min(dp[i-1][j-1], 
                        Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }

        return dp[m][n];
    }
}