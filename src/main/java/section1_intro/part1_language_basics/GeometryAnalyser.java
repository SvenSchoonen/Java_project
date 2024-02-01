package section1_intro.part1_language_basics;

import java.text.NumberFormat;

public class GeometryAnalyser {
    public static void main(String[] args) {
        //YOUR CODE HERE
        if(args.length != 5) {
            System.err.println("You should provide two Points and a geometry to calculate, e.g. 2 5 6 2 surf");
        }
        Point upperLeft = new Point();
        upperLeft.x = Integer.parseInt(args[0]);
        upperLeft.y = Integer.parseInt(args[1]);

        Point lowerRight = new Point();
        lowerRight.x = Integer.parseInt(args[2]);
        lowerRight.y = Integer.parseInt(args[3]);

        String geomType = args[4];
        if(geomType.equals("surf")) {
            Rectangle rect = new Rectangle();
            rect.upperLeft = upperLeft;
            rect.lowerRight = lowerRight;
            int surface = rect.getSurface();
            System.out.println(surface);
        } else if (geomType.equals("dist")) {
            double dist = upperLeft.euclideanDistanceTo(lowerRight);
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            numberFormat.setMaximumFractionDigits(1);
            System.out.println(numberFormat.format(dist));
        }
    }
}
