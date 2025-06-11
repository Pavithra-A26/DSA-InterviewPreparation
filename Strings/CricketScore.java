// Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras
// W – Wide N – No Ball . – Dot Ball

public class CricketScore {
    public static void main(String[] args) {
        String timeline = "1.2W4N1.3.6.2";

        int n = timeline.length();
        int extras =0;
        int p1 =0,p2=0;
        boolean isP1onStrike = true;
        int legal = 0;

        for(int i=0;i<n;i++){
            char ch = timeline.charAt(i);

            if(ch == 'W' || ch == 'N'){
                extras++;
                continue;
            }

            if(ch == '.'){
                legal++;
            }else if(Character.isDigit(ch)){
                int run = ch - '0';
                if(isP1onStrike){
                    p1 += run;
                }else{
                    p2 += run;
                }

                legal++;

                if(run%2 !=0){
                    isP1onStrike = !isP1onStrike;
                }
            }

            if(legal>0 && legal%6 == 0){
                isP1onStrike = !isP1onStrike;
            }
        }

        System.out.println("P1 : " + p1);
        System.out.println("P2 : " + p2);
        System.out.println("Extrs : " + extras);
    }
}
