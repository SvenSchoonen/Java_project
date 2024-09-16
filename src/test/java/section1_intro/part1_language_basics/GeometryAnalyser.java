package section1_intro.part1_language_basics;

public class GeometryAnalyser {

    public static void main(String[] args) {
        if (args.length >= 5) {
            if ("surf".equals(args[4])) {
                try {
                    int a = Integer.parseInt(args[0]);
                    int b = Integer.parseInt(args[1]);
                    int c = Integer.parseInt(args[2]);
                    int d = Integer.parseInt(args[3]);

                    int result = performCalculation(a, b, c, d);
                    System.out.println(result);

                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in arguments.");
                }
            }
            else if ("dist".equals(args[4])) {
                try {
                    int x1 = Integer.parseInt(args[0]);
                    int y1 = Integer.parseInt(args[1]);
                    int x2 = Integer.parseInt(args[2]);
                    int y2 = Integer.parseInt(args[3]);

                    int distance = calculateDistance(x1, y1, x2, y2);
                    String distanceString = String.format("%d", distance);
                    System.out.println(distanceString);

                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in arguments.");
                }
            }
            else {
                System.err.println("Invalid or missing argument.");
            }
        } else {
            System.err.println("Insufficient number of arguments.");
        }
    }

    private static int performCalculation(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    private static int calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}
