package main.VW6.Pixel;

public class Pixel {
    Coordinate position;
    RGB color;

    Pixel(Coordinate pos, RGB color) {
        position = pos;
        this.color = color;
    }
    Pixel(Coordinate pos) {
        this(pos, new RGB(0));
    }
    Pixel() {
        this(new Coordinate(0, 0));
    }

    float distance(Pixel other) {
        return position.distance(other.position);
    }

    @Override
    public String toString() {
        return position + "[" + color + "]";
    }
}
