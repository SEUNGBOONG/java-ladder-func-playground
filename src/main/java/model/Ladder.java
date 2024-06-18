package model;

import java.util.List;

public class Ladder {

    private final RowLines rowLines;

    private Ladder(final RowLines rowLines) {
        this.rowLines = rowLines;
    }

    public static Ladder of(final int heightValue, final int width) {
        RowLines rowLines = RowLines.of(heightValue, width);
        return new Ladder(rowLines);
    }

    public List<Lines> getRowLines() {
        return rowLines.getRowLines();
    }

    public Height getHeight() {
        return rowLines.getHeight();
    }
}
