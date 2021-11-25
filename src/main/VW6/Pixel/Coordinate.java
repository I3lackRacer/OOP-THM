package main.VW6.Pixel;

public class Coordinate {
    final int x;
    final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    float distance(Coordinate other) {
        return (float) Math.sqrt((other.x -x) * (other.x - x) + (other.y - y) * (other.y - y));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
