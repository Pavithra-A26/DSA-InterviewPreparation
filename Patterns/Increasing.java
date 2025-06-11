public class Increasing {
    public static void main(String[] args) {
        String str = "PROGRAM";

        int n = str.length();

        StringBuilder current = new StringBuilder();
        int mid = n/2;
        current.append(str.charAt(mid));

        System.out.println(current);

        int left = mid-1;
        int right = mid+1;

       
            while(right<n){
                current.append(str.charAt(right));
                System.out.println(current);
                right++;
            }
            while(left>=0){
                current.append(str.charAt(left));
                System.out.println(current);
                left--;
            }
        
    }
}
