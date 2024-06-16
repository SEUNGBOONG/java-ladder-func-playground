package view;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputViewTest {

    @Test
    void 입력_테스트() {

        // given
        Scanner scanner = new Scanner("3\n5\n");

        // when
        InputView inputView = new InputView(scanner);

        // then
        assertEquals(3, inputView.widthLadder());
        assertEquals(5, inputView.heightLadder());
    }

    @Test
    void 사람이름_출력테스트() {

        // given
        Scanner scanner = new Scanner("done,skr,add,e");

        // when
        InputView inputView = new InputView(scanner);
        List<String> expectName = List.of("done", "skr", "add", "e");

        // then
        assertEquals(inputView.personName(), expectName);
    }

    @Test
    void 실행결과_테스트() {

        // given

        Scanner scanner = new Scanner("꽝,5000,4000,꽝");

        // when
        InputView inputView = new InputView(scanner);
        List<String> expectResult = List.of("꽝", "5000", "4000", "꽝");

        // then
        assertEquals(expectResult, inputView.winningResult());
    }

}