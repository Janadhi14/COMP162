/**
* An application class to test the Coins class
* @author Nick Meek
*/
public class CoinsApp{

   public static void main(String[] args){
      boolean[] coinTosses = {true, false, true, false, true, true, false, false, false, true};
      
     Coins c = new Coins(coinTosses);
     System.out.println(c.countHeads(coinTosses));
     System.out.println(c);
  }
  
  
}