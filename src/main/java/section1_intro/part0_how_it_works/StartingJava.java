package section1_intro.part0_how_it_works;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
// createDuck;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartingJava {

    public static void main(String[] args) {
        new StartingJava().printHelloUser();
    }

    public void printHelloWorld() {
        System.out.print("Hello, World");
    }

    public void printHelloUser() {
        String user = System.getProperty("user.name");
        String foo = String.format("Hello, %s!", user);
        System.out.print(foo);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

        String[] tmp = {"Hemn", "karel"};
        sb = new StringBuilder();
        for (String a : tmp) {
            sb.append(a);
        }
        System.out.println(sb.toString());
    }

    public int addInts(int x, int y) {
        return x + y;
    }

    public double calculateSpeed(int meters, int seconds) {
        double speed_ms = (double) meters / seconds;
        System.out.println("Speed in meters per second: " + speed_ms);
        double speed_kmh = speed_ms * 3.6;
        return speed_kmh;
    }

    public int divideAndRound(double x, double y) {
        return (int) Math.round(x / y);
    }

    public String getGreeting(int greetingType) {
        switch (greetingType) {
            case 1:
                return "hoi";
            case 2:
                return "Wazzup";
            case 3:
                return "Yo!";
            default:
                return "Hello";
        }
    }
//    public class CreateDuck {
//
//        public static Duck createDuck(int swimSpeed, String name) {
//            return new Duck(swimSpeed, name);
//        }
//    }

}
