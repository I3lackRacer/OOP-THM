package main.VW6.Pixel;

public class RGB {
    byte red, green, blue;

    static int encodeColor(int red, int green, int blue) {
        return ((red & 0xFF) << 16) | ((green & 0xFF) << 8) | (blue & 0xFF);
    }
    static int decodeRed(int colorCode) {
        return (colorCode & 0b11111111_00000000_00000000) >> 16;
    }
    static int decodeGreen(int colorCode) {
        return (colorCode & 0b11111111_00000000) >> 8;
    }
    static int decodeBlue(int colorCode) {
        return colorCode & 0b11111111;
    }

    RGB(int colorCode) {
        red = (byte)decodeRed(colorCode);
        green = (byte)decodeGreen(colorCode);
        blue = (byte)decodeBlue(colorCode);
    }
    void setColor(int colorCode) {
        red = (byte)decodeRed(colorCode);
        green = (byte)decodeGreen(colorCode);
        blue = (byte)decodeBlue(colorCode);
    }
    int getColor() {
        return encodeColor(red, green, blue);
    }
    @Override
    public String toString() {
        return String.format("0x%06X", encodeColor(red, green, blue));
    }
}