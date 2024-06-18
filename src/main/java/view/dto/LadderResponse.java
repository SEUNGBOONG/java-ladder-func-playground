package view.dto;

import model.Ladder;
import model.LadderElement;
import model.Line;
import model.Lines;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LadderResponse {

    public static final String BLANK_SPACE = " ";

    private final List<String> lines;
    private final List<String> names;
    private final List<String> results;
    private final Map<String, String> personResults = new HashMap<>();

    public List<String> getLines() {
        return lines;
    }

    public List<String> getNames() {
        return names;
    }

    public List<String> getResults() {
        return results;
    }

    public LadderResponse(final Ladder ladder, final List<String> names, final List<String> results) {
        this.lines = ladder.getRowLines().stream()
                .map(this::convertLine)
                .collect(Collectors.toList());
        this.names = names;
        this.results = results;
        calculateResults();
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


    private void calculateResults() {
        for (int i = 0; i < names.size(); i++) {
            int position = i;
            for (String line : lines) {
                position = move(position, line);
            }
            personResults.put(names.get(i), results.get(position));
        }
    }

    private int move(int position, String line) {
        if (position > 0 && line.charAt(position - 1) == '-') {
            return position - 1;
        } else if (position < line.length() && line.charAt(position) == '-') {
            return position + 1;
        }
        return position;
    }

    public String getResultForPerson(String name) {
        return personResults.get(name);
    }
}
