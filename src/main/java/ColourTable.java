import javax.naming.SizeLimitExceededException;
import java.util.List;
import java.util.ArrayList;

public class ColourTable {
    private final int paletteSize;
    private final List<Integer> colourList = new ArrayList<>();

    public ColourTable(int paletteSize) {
        // check that value is greater than 0 and bitwise AND to check power of 2
        if (paletteSize < 1 || (paletteSize & (paletteSize-1)) != 0) {
            throw new IllegalArgumentException("Palette size must be greater than 0 and a power of 2");
        }
        this.paletteSize = paletteSize;
    }

    public int getPaletteSize() {
        return this.paletteSize;
    }
    public void add(Integer RGBValue) {
        if (RGBValue > 0xFFFFFF) {
            throw new IllegalArgumentException("RGB value cannot exceed 24 bits");
        } else if (RGBValue < 0) {
            throw new IllegalArgumentException("RGB value must be positive");
        } else if (colourList.size() == paletteSize) {
            throw new IllegalStateException("Colour table is full");
        }
        colourList.add(RGBValue);
    }
}
