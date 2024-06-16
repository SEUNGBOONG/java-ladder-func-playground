package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HeightTest {

    @Test
    void 높이_테스트() {

        //given
        Height height = Height.from(5);

        //when &then
        assertThrows(IllegalArgumentException.class, () -> Height.from(0));
        assertEquals(5, height.getHeight());
    }

    @Test
    void 예외처리_테스트() {

        // given
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            Height.from(0);
        });

        // when&then
        assertEquals("예외 처리",exception.getMessage());
    }
}