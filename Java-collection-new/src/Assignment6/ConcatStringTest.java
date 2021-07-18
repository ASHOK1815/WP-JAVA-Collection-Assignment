package Assignment6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class ConcatStringTest {


    @Test
    public void testingConcat() {
        ConcatString join=new ConcatString();
        assertEquals("Result", "HelloWorld", join.ConCatination("Hello", "World"));;
    }

}
