import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class numbers_characteristicsTest {

    private numbers_characteristics numbers_test = new numbers_characteristics();

    @Test
    void incrementTest() {
        int result = numbers_test.increment(2);
        assertEquals(3,result);
    }

    @Test
    public void incrementNegativeNumberTest(){
        int result = numbers_test.increment(-2);
        assertEquals(-1,result);
    }

    @Test
    void multiple_2Test() {
        boolean result = numbers_test.multiple_2(6);
        assertTrue(result);
    }
}