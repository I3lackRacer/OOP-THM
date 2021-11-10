package main.VW5.CalPoints;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static main.VW5.CalPoints.ComputePoints.*;
import static org.junit.jupiter.api.Assertions.*;

class ComputePointsTest {

    @Test
    void TestComputePoints() {
        assert minimum(new int[]{1}) == 1;
        assert minimum(new int[]{1, 2}) == 1;
        assert minimum(new int[]{2, 1}) == 1;
        assert minimum(new int[]{1, 2, 3}) == 1;
        assert minimum(new int[]{3, 2, 1}) == 1;
        assert minimum(new int[]{2, 1, 3}) == 1;

        assert Arrays.equals(discardValue(new int[]{1}, 1), new int[]{});
        assert Arrays.equals(discardValue(new int[]{1}, 0), new int[]{1});
        assert Arrays.equals(discardValue(new int[]{1, 2, 3}, 1), new int[]{2, 3});
        assert Arrays.equals(discardValue(new int[]{1, 2, 3}, 2), new int[]{1, 3});
        assert Arrays.equals(discardValue(new int[]{1, 2, 3}, 3), new int[]{1, 2});
        assert Arrays.equals(discardValue(new int[]{1, 2, 3}, 0), new int[]{1, 2, 3});
        assert Arrays.equals(discardValue(new int[]{1, 2, 3, 1}, 1), new int[]{2, 3, 1});
        assert Arrays.equals(discardValue(new int[]{1, 2, 3, 1}, 2), new int[]{1, 3, 1});
        int[] test = {1, 2, 3};
        assert discardValue(test, 0) != test : "Never return given array";
        assert Arrays.equals(discardValue(new int[]{}, 1), new int[]{});

        assert average(1, 2, 3, 4, 5) == 3.0f;

        assert computePoints(1, 2, 3, 4, 5) == (2 + 3 + 4 + 5) / 4.0;

    }
}