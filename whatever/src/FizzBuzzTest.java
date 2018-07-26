import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นหนึ่ง      ()     {
        FizzBuzz fz = new FizzBuzz();
        
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
        
        
      
    }
    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นสอง  ()     {
        FizzBuzz2 fz = new FizzBuzz2();
        
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }

}
