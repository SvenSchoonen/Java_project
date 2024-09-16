package section1_intro.part0_how_it_works;

public class Duck {
    private int swimSpeed;
    private String name;
    // Constructor

    public Duck(int swimSpeed, String name) {
        this.swimSpeed = swimSpeed;
        this.name = name;
    }

    // swimSpeed
    public int getSwimSpeed() {
        return swimSpeed;
    }

    //name
    public String getName() {
        return name;
    }
}
