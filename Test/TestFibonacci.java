import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {

    @Test
    public void testFibonacci0() {
        Fibonacci fibo = new Fibonacci(); // Actor
        int res = fibo.compute(0); // Action
        assertEquals(0, res); // Assertion
    }

    @Test
    public void testFibonacci1() {
        Fibonacci fibo = new Fibonacci(); // Actor
        int res = fibo.compute(1); // Action
        assertEquals(1, res); // Assertion
    }

    @Test
    public void testFibonacci_N() {
        Fibonacci fibo = new Fibonacci(); // Actor
        assertEquals(0,fibo.compute(0)); // Action + Assertion
        assertEquals(1,fibo.compute(1)); // Action + Assertion
        assertEquals(1,fibo.compute(2)); // Action + Assertion
        assertEquals(2,fibo.compute(3)); // Action + Assertion
        assertEquals(3,fibo.compute(4)); // Action + Assertion
        assertEquals(5,fibo.compute(5)); // Action + Assertion
        assertEquals(8,fibo.compute(6)); // Action + Assertion
    }
}
