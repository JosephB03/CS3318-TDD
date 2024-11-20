public class ColourTable {
    private final int paletteSize;

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
}
