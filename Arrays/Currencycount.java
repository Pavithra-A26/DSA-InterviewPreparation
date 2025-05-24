public class Currencycount {
    public static void main(String[] args) {
        int amount = 800;
        int[] notes = {2000,500,200,100,50, 20 ,10,5,1};

        for(int i=0;i<notes.length;i++){
            if(amount>=notes[i]){
                int count = amount/notes[i];
                amount = amount%notes[i];
                System.out.println(notes[i] + ":" + count);
            }
        }
    }
}
