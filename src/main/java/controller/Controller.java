package controller;

import model.GenerateLadders;
import model.Ladder;
import view.InputView;
import view.OutputView;
import view.dto.LadderResponse;

import java.util.List;
import java.util.Scanner;

public class Controller {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        InputView inputView = new InputView(scanner);
        OutputView outputView = new OutputView();

        List<String> names = inputView.personName();
        List<String> results = inputView.winningResult();
        int width = names.size() - 1;
        int height = inputView.heightLadder();

        GenerateLadders generateLadders = new GenerateLadders();
        Ladder ladder = generateLadders.generate(height, width);

        LadderResponse ladderResponse = new LadderResponse(ladder, names, results);
        outputView.printLadder(ladderResponse);

        while (true) {
            String name = inputView.askResultPerson();
            if (name.equals("all")) {
                outputView.printAllResults(ladderResponse);
                break;
            } else {
                outputView.printResult(ladderResponse, name);
            }
        }
    }
}
