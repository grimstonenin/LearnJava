package codewars;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
