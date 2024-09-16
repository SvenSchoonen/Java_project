package section1_intro.part1_language_basics;

public class Point {
    public int x;
    public int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point createInversePoint() {
        return new Point(-this.x, -this.y);
    }

    public double euclideanDistanceTo(Point other) {
        int disx = this.x - other.x;
        int disy = this.y - other.y;
        return Math.sqrt(disx * disx + disy * disy);
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}
