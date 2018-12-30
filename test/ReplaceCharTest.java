import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    @Test
            public void TestreplaceChar() throws Exception
    {
        ReplaceChar obj=new ReplaceChar();
        assertEquals("faity fry",obj.replaceChar("daily fry"));
        assertEquals("tttt fff",obj.replaceChar("llll ddd"));
    }
}