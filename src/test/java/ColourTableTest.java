import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    void testConstructorInput() {
        ColourTable table = new ColourTable(4);
        assertEquals(4, table.getPaletteSize(), "Should match input in declaration of 4");
    }
    @Test
    void testPowerOfTwoInput() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1), "Palette size must be greater than 0");
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(3), "Palette size must be a power of 2. 3 is invalid");
    }

}
