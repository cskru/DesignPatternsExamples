package facade;

public class Run {
    public static void main(String[] args) {
        CryptoFacade facade = new CryptoFacade();

        String inputText = "LearningDesignPatternsIsFun";
        String cipherText = facade.encrypt(inputText);

        System.out.println("Encryption results:");
        System.out.println("Input Plain Text: "+inputText);
        System.out.println("Cipher Text: "+cipherText);

        System.out.println("\n===============================\n");

        String decryptedText = facade.decrypt(cipherText);

        System.out.println("Decryption results:");
        System.out.println("Input Cipher Text: "+cipherText);
        System.out.println("Decrypted Text: "+decryptedText);
    }
}
