package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GenerateLaddersTest {

    @Test
    void 사다리_생성_테스트() {

        // given
        GenerateLadders generateLadders = new GenerateLadders();

        // when
        Ladder ladder = generateLadders.generate(5, 3);

        // then
        assertAll(
                () -> assertNotNull(ladder,"ladder는 널값이 아니다."),
                () -> assertEquals(5, ladder.getHeight(),"사다리 높이는 5이다.")
        );
    }

    @Test
    void 사다리_작동_테스트() {

        // given
        Ladder ladder = Ladder.of(3, 5);

        // when&then
        assertEquals(3, ladder.getRowLines().size());
    }
}