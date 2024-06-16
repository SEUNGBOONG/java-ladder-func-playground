package view.dto;

import model.Ladder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LadderResponseTest {

    @Test
    void 사다리_작동_테스트() {

        // given
        Ladder ladder = Ladder.of(5,3);
        LadderResponse response = new LadderResponse(ladder);

        // when&then
        assertEquals(5, response.getLines().size());
    }
}