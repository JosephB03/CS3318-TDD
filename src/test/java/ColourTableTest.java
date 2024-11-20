import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    void testConstructorInput() {
        ColourTable table = new ColourTable(4);
        assertEquals(4, table.getPaletteSize(), "Should match input in declaration");
    }
}
