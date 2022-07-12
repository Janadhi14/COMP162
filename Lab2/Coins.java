import java.util.Scanner;
/**
* A class to represent a series of coin tosses and 
* provide methods to supply information about them.
* @author Nick Meek
*/
public class Coins{

    public static final boolean HEADS = true;
    public static final boolean TAILS = false;

    private boolean[] coins;

    public Coins(boolean[] coins) {
        this.coins = coins;
    }
    // need to write a for loop which will go through the array and use a counter variable and if statement to increment 
    public int countHeads(boolean [] coins){
        int counter = 0;
        for(int i = 0; i<coins.length; i++){
            if(coins[i] == true){
                counter+=1; // incrementing 
            }
            
        }
        return counter; //retruns the counter variable that has been incremented 
    }
    // now we need to write a toString that turns the true to H and false to T and retuns a string
    public String toString(boolean [] coins){
        String s= ""; // creating an empty string
        for(int i = 0; i < coins.length ; i++){
            if(coins[i] == true){
                s += 'H'; // adds an H to the string s
            }else{
                s += "T"; // adds a T to the string s 
            }
            
        }return(s); // returns a string 

    }


    /*creates a Coins object from a String consisting entirely of the characters H and T  */
    public boolean [] Coins(String c){
        // we need to use a scanner to go through the line and ever character in the line,
        // create a new array that will turn the char 
        Scanner sc = new Scanner(c); // scanning thorugh the string
        // need to create an array that will be the lenght of the string 
        char[] n = new char[c.length()];
        for (int j = 0; j <= c.length() - 1; j++) 
        { char c1 = c.charAt(j);
           n[j] = c1;
        }

        // now we want to go through the char array and make a new boolarr that contains the heats and tails that correspond 
        //creating boolarr
        boolean [] boolarr = new boolean[c.length()]; // same length as the string 
        // now we need a for loop with if statements 
        for(int i = 0; i < c.length(); i++){
            if(n[i] =='H'){
                boolarr[i] = true; //if heads the posiiton will be heads 
            }
            if(n[i] == 'T'){
                boolarr[i] = false;
            } else{
              System.out.println("please enter H or T only");  
            }
        }

        return boolarr;
        
        // now we need to create a loop which will go through that array and create a new array that/ that is of the same length and corresponds to the 

    }

    
    /*Constructs a Coins object consisting of a series of length coins */
    public Coins(int length){

    }

    /*countRuns() Returns an int which is the number of runs in this sequence of coins (a run is a block of coins all showing the same face, so for example in HHTHHHTTT there are four runs namely HH, T, HHH, and TTT. */

}