import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    @Test
    public void testPresent() throws Exception{
     RegularExpression regex=new RegularExpression();
     assertEquals("Is Harry here ? true",regex.checkHarry("This is Harry."));
        assertEquals("Is Harry here ? false",regex.checkHarry("This is Henry."));
}}