package model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LadderTest {
    
    @Test
    void 사다리_정상_생성_테스트() {

        // given
        int heightValue = 4;
        int width = 3;
        Ladder ladder = Ladder.of(heightValue, width);
        List<Lines> rowLines = ladder.getRowLines();

        // when&then
        assertEquals(heightValue, ladder.getHeight().getHeight());
        assertEquals(heightValue, rowLines.size());
        for (Lines lines : rowLines) {
            assertEquals(width, lines.
                    getLines().size());
        }
    }
}