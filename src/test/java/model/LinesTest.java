package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinesTest {

    @Test
    void 너비_테스트() {

        // given
        Lines lines = Lines.from(3);
        int expected = 3;

        // when&then
        assertEquals(expected, lines.getLines().size());
    }

    @Test
    void 높이_너비_테스트() {

        // given
        int width = 5;
        RowLines rowLines = RowLines.of(5, 3);

        // when&then
        assertEquals(width, rowLines.getRowLines().size());
    }
}