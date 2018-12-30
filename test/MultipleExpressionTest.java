import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleExpressionTest {
    @Test
    public void TestMultipleExpressions() throws Exception{
     MultipleExpression test=new MultipleExpression();
     assertEquals("This is what I want","Found at: 4 - 6" +"Found at: 10 - 12" +"Found at: 27 - 29",test.occurence("She sells seashells by the seashore","se"));
    }
}