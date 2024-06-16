package view;

import view.dto.LadderResponse;

public class OutputView {

    public void printLadder(final LadderResponse ladderResponse) {
        StringBuilder response = new StringBuilder();

        for (String line : ladderResponse.getLines()) {
            response.append("|")
                    .append(line)
                    .append("|")
                    .append(System.lineSeparator());
        }
        System.out.println(response.toString());
    }
}
