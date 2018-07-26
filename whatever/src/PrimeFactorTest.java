import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void testPrimeFactor2() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(2);
       assertEquals("2", result);
    }
    
    @Test
    public void testPrimeFactor3() {
       PrimeFactor p = new PrimeFactor();
       String result = p.of(3);
       assertEquals("3", result);
    }

}
