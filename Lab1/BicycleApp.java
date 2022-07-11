public class BicycleApp{
    public static void main(String[] args){
        Bicycle [] Bikes = {new Bicycle("red",610, true),
            new Bicycle("blue",660,false),
            new Bicycle("pink",610,false)};
        for(Bicycle bike: Bikes){
            System.out.println(bike);
        }
        
            
    }
    // write a second method 
    //The method should use a loop to determine the bicycle with the largest wheel, then display its data. 


}