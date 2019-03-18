package ListDecorator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestClass {

    @Test
    public void testNull(){
        List<Long> list = new SmartList<>(new ArrayList<>());
        System.out.println(list.get(5));
        System.out.println(list);

        assertEquals(5,list.size());
        assertTrue(list.get(5)==null);
    }
}
