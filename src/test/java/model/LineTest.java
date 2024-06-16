package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LineTest {
    @Test
    void 동작_테스트() {

        // given
        Line lineTruePedal = Line.of(true);
        Line lineFalsePedal = Line.of(false);

        // when&then
        assertTrue(lineTruePedal.hasPedal());
        assertFalse(lineFalsePedal.hasPedal());
    }
}