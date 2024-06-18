package view;

import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String SPLIT_COMMA = ",";

    private final Scanner scanner;

    public InputView(final Scanner scanner) {
        this.scanner = scanner;
    }

    public int widthLadder() {
        System.out.println("사다리 넓이는 몇 개인가요? ");
        return scanner.nextInt();
    }

    public int heightLadder() {
        System.out.println("사다리 높이는 몇 개인가요?");
        return scanner.nextInt();
    }

    public List<String> personName() {
        System.out.println("참여할 사람이름을 입력하세요(쉼표로 구분):");
        return List.of(scanner.next().split(SPLIT_COMMA));
    }

    public List<String> winningResult() {
        System.out.println("실행 결과를 입력하세요 (쉼표로구분)");
        return List.of(scanner.next().split(SPLIT_COMMA));
    }

    public String askResultPerson() {
        System.out.println("결과를 보고 싶은 사람은?");
        return scanner.next();
    }
}