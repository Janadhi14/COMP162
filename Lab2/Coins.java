
/**
 * A class to represent a series of coin tosses and
 * provide methods to supply information about them.
 * 
 * @author Nick Meek
 */
public class Coins {

    public static final boolean HEADS = true;
    public static final boolean TAILS = false;

    private boolean[] coins;

    public Coins(boolean[] coins) {
        this.coins = coins;
    }

    // need to write a for loop which will go through the array and use a counter
    // variable and if statement to increment
    public int countHeads(boolean[] coins) {
        int counter = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == true) {
                counter += 1; // incrementing
            }

        }
        return counter; // retruns the counter variable that has been incremented
    }

    // now we need to write a toString that turns the true to H and false to T and
    // retuns a string
    public String toString() { // toString shouldn't have a parameter
        String s = ""; // creating an empty string
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == true) {
                s += 'H'; // adds an H to the string s
            } else {
                s += 'T'; // adds a T to the string s
            }

        }
        return (s); // returns a string

    }

    /*
     * creates a Coins object from a String consisting entirely of the characters H
     * and T
     */
    public Coins(String c) {
        // first lets create an array that is the same length as the string adn of type
        // we need toiterate through a string an enterthe char into the char array
        coins = new boolean[c.length()]; // creating a boolean array and setting it to the elngth of the string
        for (int x = 0; x < c.length(); x++) {
            if (c.charAt(x) == 'H') {
                coins[x] = true;
            } else {
                coins[x] = false;
            }

        }
    }

    /* Constructs a Coins object consisting of a series of length coins */
    public int countruns() {
        int counter = 0;
        for (int g = 0; g < (coins.length - 1); g++) {
            // we want to now compare the current
            if (coins[g] != coins[g + 1]) {
                counter++; // we want to increment the counter by 1 if there is a switch
            }
        }
        return counter;

        // this constructor should create a coins object consisiting of a series of
        // length coins

    }

    // first we would need a counter variable
    // there should be another string method that can be used on this

    /*
     * countRuns() Returns an int which is the number of runs in this sequence of
     * coins (a run is a block of coins all showing the same face, so for example in
     * HHTHHHTTT there are four runs namely HH, T, HHH, and TTT.
     */

}
