package model;

import java.util.ArrayList;
import java.util.List;

public class RowLines {
    private static final int INITIAL_NUMBER = 0;

    private final List<Lines> rowLines;
    private final Height height;

    public List<Lines> getRowLines() {
        return rowLines;
    }

    public Height getHeight() {
        return height;
    }

    public static RowLines of(int heightValue, int width) {
        Height height = Height.from(heightValue);
        List<Lines> rowLines = new ArrayList<>();
        setLadder(height.getHeight(), width, rowLines);
        return new RowLines(rowLines, height);
    }

    private RowLines(List<Lines> rowLines, Height height) {
        this.rowLines = rowLines;
        this.height = height;
    }

    private static void setLadder(final int height, final int width, final List<Lines> rowLines) {
        for (int i = INITIAL_NUMBER; i < height; i++) {
            rowLines.add(Lines.from(width));
        }
    }
}
