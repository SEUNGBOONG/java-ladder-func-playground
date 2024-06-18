package view;

import view.dto.LadderResponse;

public class OutputView {

    public void printLadder(final LadderResponse ladderResponse) {
        StringBuilder response = new StringBuilder();

        response.append("사다리 결과\n\n");
        for (String name : ladderResponse.getNames()) {
            response.append(name).append(" ");
        }
        response.append("\n");

        for (String line : ladderResponse.getLines()) {
            response.append("|")
                    .append(line)
                    .append("|")
                    .append(System.lineSeparator());
        }

        for (String result : ladderResponse.getResults()) {
            response.append(result).append(" ");
        }
        response.append("\n");

        System.out.println(response.toString());
    }

    public void printResult(final LadderResponse ladderResponse, String name) {
        System.out.println("실행 결과");
        System.out.println(ladderResponse.getResultForPerson(name));
    }

    public void printAllResults(final LadderResponse ladderResponse) {
        System.out.println("실행 결과");
        for (String allName : ladderResponse.getNames()) {
            System.out.println(allName + " : " + ladderResponse.getResultForPerson(allName));
        }
    }
}
