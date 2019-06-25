import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void encrypt() {
        Cipher cipher = new Cipher(12);
        String str = "The quick brown fox Jumped over the lazy Dog";
        String expected = "Ftq cguow ndaiz raj Vgybqp ahqd ftq xmlk Pas";
        String actual = cipher.encrypt(str, 12);
        assertEquals(expected, actual);
    }

    @Test
    public void decrypt() {
        Cipher cipher = new Cipher(12);
        String str = "Ftq cguow ndaiz raj Vgybqp ahqd ftq xmlk Pas";
        String expected = "The quick brown fox Jumped over the lazy Dog";
        String actual = cipher.decrypt(str, 12);
        assertEquals(expected, actual);
    }

}