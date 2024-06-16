package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WinningLadderTest {

    @Test
    void 오른쪽_이동테스트() {

        // given
        boolean isTrue = true;
        WinningLadder winningLadder = new WinningLadder(isTrue);

        // when
        int count = winningLadder.getRightPoint();
        // then
        assertEquals(count, 1);
    }

    @Test
    void 왼쪽으로_이동테스트() {

        // given
        boolean isFalse = false;
        WinningLadder winningLadder = new WinningLadder(isFalse);

        // when
        int count = winningLadder.getLeftPoint();
        // then
//        assertEquals(count,);
    }
}