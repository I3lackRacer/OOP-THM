package main.VW6.Pixel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    public void TestDistance() {
        Assertions.assertEquals(2, new Coordinate(1,0).distance(new Coordinate(3,0)));
        Assertions.assertEquals(2, new Coordinate(0,1).distance(new Coordinate(0,3)));
        Assertions.assertEquals((float)Math.sqrt(2), new Coordinate(0,0).distance(new Coordinate(1,1)));
    }

    @Test
    public void TestToString() {
        Assertions.assertEquals("(2, 3)", new Coordinate(2,3).toString());
    }
}