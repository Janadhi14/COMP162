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
        return counter;
    }
    // now we need to write a toString that turns the true to H and false to T and retuns a string
    public void toString(boolean [] coins){
        String s = "";
        for(boolean i : coins){
            if(i == true){
                s += 'H';
            }else{
                s += 'T';
            }
            
        }System.out.println(s);

    }
    

}