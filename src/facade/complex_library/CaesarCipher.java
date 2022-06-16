package facade.complex_library;

public class CaesarCipher {
    public String encrypt(String plainStr) {
        StringBuilder cipherStr = new StringBuilder();
        for(char c : plainStr.toCharArray()) {
            if(!Character.isAlphabetic(c))
                throw new RuntimeException("Only Alphabetic characters are allowed");
            if(Character.isUpperCase(c))
                cipherStr.append((char) ((((c - 65) + 1) % 26) + 65));
            else if(Character.isLowerCase(c))
                cipherStr.append((char) ((((c - 97) + 1) % 26) + 97));
        }
        return cipherStr.toString();
    }

    public String decrypt(String cipherStr) {
        StringBuilder plainStr = new StringBuilder();
        for(char c : cipherStr.toCharArray()) {
            if(!Character.isAlphabetic(c))
                throw new RuntimeException("Only Alphabetic characters are allowed");
            if(Character.isUpperCase(c))
                plainStr.append((char) ((((c - 65) - 1) % 26) + 65));
            else if(Character.isLowerCase(c))
                plainStr.append((char) ((((c - 97) - 1) % 26) + 97));
        }
        return plainStr.toString();
    }
}
