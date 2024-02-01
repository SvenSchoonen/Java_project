package section2_syntax.part5_zoo;

import java.util.List;

public class ZooApp {

    public static void main(String[] args) {
        ZooApp zooApp = new ZooApp();
        zooApp.processZooData(args);
        zooApp.printZooSummary();
    }

    /**
     * Processes the command line data.
     * @param args
     */
    void processZooData(String[] args) {
        //YOUR CODE HERE; pass zoo animals to ZooSpecies
        for(String sp : args) {
            //calling a static method does not require
            ZooSpecies.registerSpeciesFromString(sp);
        }
    }

    /**
     * Prints a summary of the zoo.
     */
    void printZooSummary() {
        //again a static method call
        final List<ZooSpecies> allSpecies = ZooSpecies.getAllSpecies();
        System.out.println("The zoo has " + allSpecies.size() + " species.");
        System.out.println("These are the species counts:");

        for (ZooSpecies species : allSpecies) {
            System.out.println("\t" + species.getSpeciesName() + ": " + species.getIndividualCount());
        }
    }
}
