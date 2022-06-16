package facade;

import facade.complex_library.Base64Coder;
import facade.complex_library.CaesarCipher;

public class CryptoFacade {
    // All configurations can go here, determining algorithm, encoder, etc
    private final Base64Coder base64Coder;
    private final CaesarCipher caesarCipher;

    public CryptoFacade() {
        base64Coder = new Base64Coder();
        caesarCipher = new CaesarCipher();
    }

    // Here, there are 2 steps to encryption -
    // It can be complex set of operations, different clients trying to use different algorithms etc.
    // But face is the same
    public String encrypt(String input) {
        // Encrypt
        String cipherStr = caesarCipher.encrypt(input);

        // Base64 encode
        String encodedStr = base64Coder.encode(cipherStr);

        return encodedStr;
    }

    public String decrypt(String encryptedInput) {
        // Base64 decode
        String decodedStr = base64Coder.decode(encryptedInput);

        // Decrypt
        String plainStr = caesarCipher.decrypt(decodedStr);

        return plainStr;
    }
}
