package controller;

import model.GenerateLadders;
import model.Ladder;
import view.InputView;
import view.OutputView;
import view.dto.LadderResponse;

import java.util.Scanner;

public class Controller {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        InputView inputView = new InputView(scanner);
        OutputView outputView = new OutputView();

        int width = inputView.widthLadder();
        int height = inputView.heightLadder();

        GenerateLadders generateLadders = new GenerateLadders();
        Ladder ladder = generateLadders.generate(height, width);

        LadderResponse ladderResponse = new LadderResponse(ladder);
        outputView.printLadder(ladderResponse);
    }
}
