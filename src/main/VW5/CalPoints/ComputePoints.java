package main.VW5.CalPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComputePoints {

    static float computePoints(int... points) {
        return average(discardValue(points, minimum(points)));
    }

    static int[] discardValue(int[] points, int minimum) {
        boolean found = false;
        int[] newPoints = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            if (points[i] == minimum && !found) {
                found = true;
                newPoints = Arrays.copyOf(newPoints, newPoints.length-1);
                continue;
            }

            if (found) {
                newPoints[i - 1] = points[i];
            } else {
                newPoints[i] = points[i];
            }
        }

        return newPoints;
    }

    static float average(int... points) {
        float sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum = sum + points[i];
        }

        return sum / points.length;
    }

    static int minimum(int... points) {
        assert points.length > 0;
        int minimum = points[0];
        for (int i = 0; i < points.length; i++) {
            if (points[i] < minimum) {
                minimum = points[i];
            }
        }

        return minimum;
    }
}
