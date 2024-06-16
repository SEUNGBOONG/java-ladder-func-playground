package model;

import java.util.List;

public class Ladder {

    private final List<Lines> rowLines;
    private final Height height;

    public Ladder(final List<Lines> rowLines, final Height height) {
        this.rowLines = rowLines;
        this.height = height;
    }

    public static Ladder of(final int heightValue, final int width) {
        Height height = Height.from(heightValue);
        RowLines rowLines = RowLines.of(height.getHeight(), width);
        return new Ladder(rowLines.getRowLines(), height);
    }

    public List<Lines> getRowLines() {
        return rowLines;
    }

    public Height getHeight() {
        return height;
    }
}
