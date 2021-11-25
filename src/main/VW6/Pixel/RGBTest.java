package main.VW6.Pixel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RGBTest {

    @Test
    public void TestDecode() {
        Assertions.assertEquals(0xff2311, RGB.encodeColor(0xff, 0x23, 0x11));
        Assertions.assertEquals(0xff,RGB.decodeRed(0xff2311));
        Assertions.assertEquals(0x23, RGB.decodeGreen(0xff2311));
        Assertions.assertEquals(0x11, RGB.decodeBlue(0xff2311));
    }

    @Test
    public void TestToString() {
        Assertions.assertEquals("0xFF2311", new RGB(0xff2311).toString());
        Assertions.assertEquals("0x002311", new RGB(0x2311).toString());
        Assertions.assertEquals("0x000000", new RGB(0).toString());
    }
}