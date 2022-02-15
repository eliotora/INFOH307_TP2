import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteurTest {
    static Compteur c;

    @BeforeAll
    public static void initGlobal() {
        CompteurTest.c = new Compteur();
    }

    @BeforeEach
    public void resetCounter() {
        c.setValue(0);
    }

    @Test
    void testCount() {
        assertEquals(1, c.count());
    }


    @Test
    void testCountToTen() {
        for (int i = 0; i < 9; i++) {
            c.count();
        }
        assertEquals(10, c.count());
    }
}