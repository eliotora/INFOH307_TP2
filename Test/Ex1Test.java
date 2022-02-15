import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {
    static Ex1 item;

    @BeforeAll
    public static void initOui() {
        item = new Ex1();
    }

    @Test
    public void testNull() {
        assertEquals(0,item.divisible(1,2,3));
    }

    @Test
    public void testAB(){
        assertEquals(5,item.divisible(10,5,3));
    }

    @Test
    public void testAC(){
        assertEquals(5,item.divisible(10,3,5));
    }

    @Test
    public void testABC(){
        assertEquals(7,item.divisible(10,5,2));
    }
}