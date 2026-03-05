import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void testFactorial() {
        Factorial obj = new Factorial();
        
        assertEquals(1, obj.fact(0), "Factorial of 0 should be 1");
        assertEquals(1, obj.fact(1), "Factorial of 1 should be 1");
        assertEquals(120, obj.fact(5), "Factorial of 5 should be 120");
        assertEquals(720, obj.fact(6), "Factorial of 6 should be 720");
    }
}
