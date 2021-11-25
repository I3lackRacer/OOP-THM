package main.VW6.ThousandDots;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThousandDotsTest {

    @Test
    void testToStringWithDots() {
        Assertions.assertEquals("12.345", ThousandDots.toStringWithDots(12345));
        Assertions.assertEquals("12.345.678", ThousandDots.toStringWithDots(12345678));
    }
}