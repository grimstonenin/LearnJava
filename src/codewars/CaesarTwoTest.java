package codewars;



import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CaesarTwoTest {

    @Test
    public void testDecodeString(String codedMessage){

        List<String> v = Arrays.asList("ijJ tipvme ibw", "f lopxo uibu z", "pv xpvme ibwf ", "b qfsgfdu botx", "fs gps nf!!!");

        String u = "I should have known that you would have a perfect answer for me!!!";


        assertEquals(u, CaesarTwo.decode(v));


    }

    @Test
    public void testEncodeString(String message){

        List<String> v = Arrays.asList("ijJ tipvme ibw", "f lopxo uibu z", "pv xpvme ibwf ", "b qfsgfdu botx", "fs gps nf!!!");

        String u = "I should have known that you would have a perfect answer for me!!!";

        assertEquals(v, CaesarTwo.encodeStr(u, 1));
    }
}
