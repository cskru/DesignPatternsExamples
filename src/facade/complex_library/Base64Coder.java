package facade.complex_library;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Coder {
    public String encode(String plainStr) {
        return Base64.getEncoder().encodeToString(plainStr.getBytes(StandardCharsets.UTF_8));
    }

    public String decode(String encodedStr) {
        return new String(Base64.getDecoder().decode(encodedStr.getBytes(StandardCharsets.UTF_8)));
    }
}
