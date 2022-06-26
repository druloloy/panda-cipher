class Main {
    public static void main(String[] args){
        String plaintext = "rageagainstthemachine";
        String key = "lmao";
        PandaCipher cipher = new PandaCipher(plaintext);
        System.out.println("Alpha list: "+ String.join("",cipher.randomAlpha));
        System.out.println("Plaintext: "+ plaintext);
        System.out.println("cipherkey: "+ cipher.getKey(key));
        System.out.println("\nCiphered "+cipher.encrypt(key));
        System.out.println("Plot:");
        Plotter.plot(String.join("",cipher.randomAlpha));
    }
}