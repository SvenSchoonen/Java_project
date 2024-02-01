package section2_syntax.part1_datatypes;

/**
 * Creation date: May 28, 2018
 *
 * @author Michiel Noback (&copy; 2018)
 * @version 0.01
 */
public class Datatypes {
    /*
    * For the following couple of methods, simply return the name of the datatype that best supports
    * the given usage.
    * Choose from
    *   - boolean
    *   - char
    *   - byte
    *   - short
    *   - int
    *   - long
    *   - double
    *   - float
    *   - String
    *
    * The first one has already been implemented as example.
    */

    String correctDataType0() {
        //USAGE: the number of days within a year
        return "short";
    }

    String correctDataType1() {
        //USAGE: the age of the universe in whole years. Change the return value -null- to a correct value
        //- the name of the data type that is correct here
        return null;
    }

    String correctDataType2() {
        //USAGE: the turnover of ATP in a cell, in Molar per minute
        return null;
    }

    String correctDataType3() {
        //USAßGE: the molecular weight of a protein, in Daltons
        return null;
    }

    String correctDataType4() {
        //USAGE: the alive/death status of a test animal
        return null;
    }

    String correctDataType5() {
        //USAGE: the name of an app user
        return null;
    }

    String correctDataType6() {
        //USAGE: encoding of human gender (Male, Female, Undefined)
        return null;
    }

    /* NEW SECTION OF ASSIGNMENTS */

    /**
     * The method below is supposed to calculate the G+C fraction of a DNA sequence.
     * It should do so case insensitive - have a look at the methods in class `String`.
     * Start by uncommenting the method body (select the block and press "Ctrl + /").
     * Identify and solve the three problems and one error in this method.
     * Only then the test with the same name will pass (in class DatatypesTest)
     */
    double determineGCfraction(String theDNA) {
//        int gcCount;
//        for (int i = 0; i < theDNA.length(); i++) {
//            char nucleotide = theDNA.charAt(i);
//            if (nucleotide == 'C' || nucleotide == 'G') {
//                gcCount++;
//            }
//        }
//        double fraction = gcCount/theDNA.length();
        //to uppercase
        theDNA = theDNA.toUpperCase();
        //initialize to 0
        int gcCount = 0;
        for (int i = 0; i < theDNA.length(); i++) {
            char nucleotide = theDNA.charAt(i);
            if (nucleotide == 'C' || nucleotide == 'G') {
                gcCount++;
            }
        }
        //cast to double
        double fraction = (double)gcCount/theDNA.length();
        //return fraction instead of 0
        return fraction;
    }

    /**
     * The method below creates a string and calls another method -replaceWord()- to change it.
     * Something goes wrong - it should return "where can I find the sodamachine in this building?"
     *
     * Can you fix it?
     */
    String modifyString() {
        String input = "where can I find the coffeemachine in this building?";
        replaceWord(input, "coffee", "soda");
        return input;
    }

    /**
     * This method is linked to the method above as a single assignment.
     */
    String replaceWord(String input, String replace, String replaceWith) {
        return input.replace(replace, replaceWith);
    }

    /**
     * This method should return a String array of length 2 with the first and last element
     * of the input array in it, converted to their String representations.
     * For any Java object you can use object.toString() to get this string representation
     */
    String[] getFirstAndLastAsStringRepresentation(Object[] input) {
        String[] firstAndLast = new String[2];
        firstAndLast[0] = input[0].toString();
        firstAndLast[1] = input[input.length - 1].toString();
        return firstAndLast;
    }

    /**
     * This method should return a new int array where all integers from the input have been cubed (power of 3).
     * For convenience, the skeleton of a for loop is already provided.
     * @param input
     * @return cubedInput
     */
    int[] cubeAll(int[] input) {
        int arrayLength = input.length;
        int[] cubed = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            cubed[i] = (int)Math.pow(input[i], 3);
        }
        return cubed;
    }

    /**
     * This method should return the cumulative product of all numbers in the input array.
     * @param input the input number array
     * @return the cumulative product
     */
    int cumulativeProduct(int[] input) {
        int total = 1;
        for (int i : input) {
            total *= i;
        }
        //OR
//        for (int i = 0; i < input.length; i++) {
//            total *= i;
//        }
        return total;
    }

}
