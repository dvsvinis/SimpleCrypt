import java.util.LinkedList;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class Cipher {
    Integer shift = null;



    public Cipher(Integer shift) {
        this.shift = shift;
    }

    public Integer getShift() {
        return shift;
    }

    public String encrypt(String enc, Integer shift) {
        shift = shift % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + shift) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + shift) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public String decrypt(String encoded, Integer shift) {
        return encrypt(encoded, 26 - shift);
    }

}
