import java.util.Random;

public class PandaCipher {

    private final String ALPHA_LIST = "abcdefghijklmnopqrstuvwxyz";
    public String[] randomAlpha;
    private String plaintext;
    private int pTextLength;
    public PandaCipher(String plaintext){
        this.plaintext = plaintext;
        this.pTextLength = plaintext.length();
        this.randomAlpha = this.generateRandomAlpha();
    }


    public String getKey(String key){
        // vigenere key 
        int index = 0;
        while(key.length()!=this.pTextLength){
            if(this.pTextLength == index) index = 0;
            key+=key.charAt(index);
            index++;
        }
        return key;
    }

    public String encrypt(String key){
        String cipherKey = this.getKey(key);
        String cipher_text="";
 
        for (int i = 0; i < this.pTextLength; i++)
        {
            // converting in range 0-25
            int x = this.getIndex(this.plaintext.charAt(i)) + this.getIndex(cipherKey.charAt(i)) ;
            x = x>=26? x-26: x;
            System.out.print(x+ " ");
            cipher_text+=this.randomAlpha[x];
        }
        return cipher_text;
    }

    public String[] generateRandomAlpha(){

        // fisher-yates shuffle
        String[] alphaListArr = this.ALPHA_LIST.split("");
        int alphaListLength = this.ALPHA_LIST.length();
        Random rand = new Random();
        for(int index = alphaListLength - 1; index > 0; index--){
            int randInt = rand.nextInt(index + 1);
            String temp = alphaListArr[randInt];
            alphaListArr[randInt] = alphaListArr[index];
            alphaListArr[index] = temp;
        }
        return alphaListArr;
    }

    private int getIndex(char letter){
        String str = "" + letter;
        int index;
        index = String.join("", this.randomAlpha).indexOf(str);
        return index;
    }

}
