package view.dto;

import model.Ladder;
import model.LadderElement;
import model.Line;
import model.Lines;

import java.util.List;
import java.util.stream.Collectors;

public class LadderResponse {

    public static final String BLANK_SPACE = " ";

    private final List<String> lines;

    public LadderResponse(final Ladder ladder) {
        this.lines = ladder.getRowLines().stream()
                .map(this::convertLine)
                .collect(Collectors.toList());
    }

    private String convertLine(final Lines lines) {
        return lines.getLines().stream()
                .map(LadderResponse::getLine)
                .collect(Collectors.joining(LadderElement.COLUMN.getSymbol()));
    }

    private static String getLine(final Line line) {
        if (line.hasPedal()) {
            return LadderElement.ROW.getSymbol();
        }

        return BLANK_SPACE.repeat(LadderElement.ROW.getSymbol().length());
    }

    public List<String> getLines() {
        return lines;
    }
}

