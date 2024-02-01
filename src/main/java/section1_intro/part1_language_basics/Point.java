package section1_intro.part1_language_basics;


public class Point {
    int x;
    int y;

    /**
     * Create an instance of class point that is located at the same coordinates as the current object, but in the
     * diagonally opposing quadrant of coordinate space.
     * So, when the current point is at (4, 4), this method will return Point(-4, -4)
     * and when the current point is at (2, -5) it will return Point(-2, 5).
     * @return inverse Point
     */
    Point createInversePoint() {
        Point inversePoint = new Point();
        inversePoint.x = this.x * -1;
        inversePoint.y = this.y * -1;

        return inversePoint;
    }

    /**
     * This method returns the Euclidean distance of the current point (this) to the given point (otherPoint).
     * GIYF if you forgot what Euclidean distance is and how it is calculated.
     * @param otherPoint
     * @return euclidean distance
     */
    double euclideanDistanceTo(Point otherPoint) {
        //YOUR CODE HERE
        double distance = Math.sqrt(Math.pow((this.x - otherPoint.x), 2) +
                Math.pow((this.y - otherPoint.y), 2));
        return distance;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 4;
        p1.y = 6;

        Point p3 = p1.createInversePoint();
        System.out.println("inverse of p1: [" + p3.x + ":" + p3.y + "]");

        Point p2 = new Point();
        p2.x = 5;
        p2.y = 2;

        System.out.println("distance of p1 to p2: " + p1.euclideanDistanceTo(p2));

    }
}
