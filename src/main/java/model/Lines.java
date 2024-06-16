package model;

import java.util.ArrayList;
import java.util.List;

public class Lines {

    private static final double RANDOM_TRUE_FALSE = 0.5;

    private final List<Line> lines;

    private Lines(List<Line> lines) {
        this.lines = lines;
    }

    public static Lines from(int width) {
        List<Line> lines = new ArrayList<>();

        boolean beforePoint = false;
        for (int i = 0; i < width; i++) {
            boolean nowPoint = Math.random() < RANDOM_TRUE_FALSE;
            beforePoint = isBeforePoint(beforePoint, nowPoint, lines);
        }

        return new Lines(lines);
    }

    private static boolean isBeforePoint(boolean beforePoint, boolean nowPoint, final List<Line> lines) {
        if (beforePoint && nowPoint) {
            nowPoint = false;
        }

        lines.add(Line.of(nowPoint));
        beforePoint = nowPoint;
        return beforePoint;
    }

    public List<Line> getLines() {
        return lines;
    }
}
