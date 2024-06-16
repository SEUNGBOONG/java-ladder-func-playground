package model;

import java.util.ArrayList;
import java.util.List;

public class RowLines {
    private static final int INITIAL_NUMBER = 0;

    private final List<Lines> rowLines;

    public List<Lines> getRowLines() {
        return rowLines;
    }

    public static RowLines of(int height, int width) {
        List<Lines> rowLines = new ArrayList<>();
        setLadder(height, width, rowLines);
        return new RowLines(rowLines);
    }

    private RowLines(List<Lines> rowLines) {
        this.rowLines = rowLines;
    }

    private static void setLadder(final int height, final int width, final List<Lines> rowLines) {
        for (int i = INITIAL_NUMBER; i < height; i++) {
            rowLines.add(Lines.from(width));
        }
    }
}
