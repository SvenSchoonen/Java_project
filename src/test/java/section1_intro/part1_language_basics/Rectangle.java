package section1_intro.part1_language_basics;

public class Rectangle {
    public Point upperLeft;
    public Point lowerRight;

    public int getSurface() {
        int width = Math.abs(lowerRight.x - upperLeft.x);
        int height = Math.abs(upperLeft.y - lowerRight.y);
        return width * height;
    }
}