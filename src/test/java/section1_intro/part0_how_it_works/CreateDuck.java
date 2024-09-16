package section1_intro.part1_language_basics;

import section1_intro.part0_how_it_works.Duck;

public class CreateDuck {
    // Factory method to create a Duck
    public static Duck createDuck(int swimSpeed, String name) {
        return new Duck(swimSpeed, name);
    }
}