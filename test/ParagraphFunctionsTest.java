import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphFunctionsTest {
    @Test
    public void testParaToString() throws Exception{
        ParagraphFunctions obj=new ParagraphFunctions();
        assertEquals("One"+"More"+"Beautiful"+"Life",obj.ParaToString("One more beautiful life"));
    }

}