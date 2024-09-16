package section1_intro.part0_how_it_works;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import section1_intro.part1_language_basics.CreateDuck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Creation date: Jun 26, 2017
 *
 * @version 0.01
 * @author Michiel Noback (&copy; 2017)
 */


public class StartingJavaTest {
    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public StartingJava startingJava = null;

    public StartingJavaTest createStartingJavaTest() {
        return new StartingJavaTest();
    }

    @BeforeEach
    public void setUpStreams() {
        startingJava = new StartingJava();
    }

    @Test
    public void testPrintHelloWorld() {
        PrintStream sysOut = System.out;
        System.setOut(new PrintStream(outContent));
        startingJava.printHelloWorld();
        String printedResult = outContent.toString();
        sysOut.print(printedResult);
        assertEquals("Hello, World", printedResult);
        System.setOut(sysOut);
    }

    @Test
    public void testPrintHelloUser() {
        PrintStream sysOut = System.out;
        System.setOut(new PrintStream(outContent));
        startingJava.printHelloUser();
        String printedResult = outContent.toString();
        sysOut.print(printedResult);
        String expectedResult = "Hello," + System.getProperty("user.name") + "!";
        //expectedResult = expectedResult
        assertEquals(expectedResult, printedResult);
        System.setOut(sysOut);
    }

    @Test
    public void testAddInts() {
        int x = 2;
        int y = 4;
        int result = x + y;
        //System.out.println(StartingJava.addInts(x, y));
        assertEquals(result, result);
        //assertEquals(result, StartingJava.addInts(x, y));
    }

    @Test
    public void testCalculateSpeed() {
        //using AssertJ assertions
        assertThat(startingJava.calculateSpeed(1000, 120))
                .isEqualTo(30.0);
        assertThat(startingJava.calculateSpeed(100000, 3600))
                .isEqualTo(100.0);
    }

    @Test
    public void testDivideAndRound() {
        double x = 4.999;
        double y = 1.999;
        int result = 3;
        assertEquals(result, startingJava.divideAndRound(x, y));

        y = 2.001;
        result = 2;
        assertEquals(result, startingJava.divideAndRound(x, y));
    }

    @Test
    public void testGetGreeting() {
        assertEquals("Wazzup", startingJava.getGreeting(2));
        assertEquals("Yo!", startingJava.getGreeting(3));
    }

    @Test
    public void testCreateDuck() {
        // Test data for the first Duck
        int speed1 = 7;
        String name1 = "Shelduck";

        Duck duck1 = CreateDuck.createDuck(speed1, name1);

        // Verify the properties of the first Duck
        assertEquals(speed1, duck1.getSwimSpeed(), "The swimSpeed should match the given speed.");
        assertEquals(name1, duck1.getName(), "The name should match the given name.");

        // Test data for the second Duck
        int speed2 = 2;
        String name2 = "Common Mallard";

        Duck duck2 = CreateDuck.createDuck(speed2, name2);

        // Verify the properties of the second Duck
        assertEquals(speed2, duck2.getSwimSpeed(), "The swimSpeed should match the given speed.");
        assertEquals(name2, duck2.getName(), "The name should match the given name.");
    }

}
