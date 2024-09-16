package section1_intro.part1_language_basics;

public class LanguageBasics {

    public boolean isMultiple(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero.");
        }
        return a % b == 0;
    }

    public double getDistanceInMeters(double distanceInUnit, double conversionFactor) {// km/u, minutes
        double distanceInMeter = distanceInUnit * 1000;
        double timeInMinutes = conversionFactor/60;
        return distanceInMeter * timeInMinutes;

    }



    public int getCumulativeSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        return n * (n + 1) / 2;
    }


    public double getTheAbsolutePower(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("Base: " + base + ", Exponent: " + exponent + ", Result: " + result);
        return result;
    }
    public String returnCorrectlyNamedVariable_1() {
        return "Louis XIV, le Roi Soleil";
    }
    public String returnCorrectlyNamedVariable_2() {
        return "D";
    }
  public String returnCorrectlyNamedVariable_3() {
      return "B";
  }


}



