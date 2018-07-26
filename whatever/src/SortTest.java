import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

    @Test
    public void test() {
       Sort sort = new Sort();
       int[] input = {1};
       int[] sorted = sort.of(input);
       assertArrayEquals(new int[] {1}, sorted);
        
       
    }

}
