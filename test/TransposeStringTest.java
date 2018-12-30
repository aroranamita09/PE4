import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    @Test
    public void testtranspose() throws Exception{
        TransposeString obj=new TransposeString();
        assertEquals("a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god",obj.transpose("a quick brown fox jumps over the lazy dog"));
    }
}