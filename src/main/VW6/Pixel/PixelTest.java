package main.VW6.Pixel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PixelTest {


    @Test
    public void TestToString() {
        Assertions.assertEquals("(2, 3)[0xFF2211]", new Pixel(new Coordinate(2, 3), new RGB(0xFF2211)).toString());
        Assertions.assertEquals("(2, 3)[0x000000]", new Pixel(new Coordinate(2, 3)).toString());
        Assertions.assertEquals("(0, 0)[0x000000]", new Pixel().toString());
    }

    @Test
    public void TestDistance() {
        Assertions.assertEquals(0, new Pixel(new Coordinate(2, 3)).distance(new Pixel(new Coordinate(2, 3))));
    }

}