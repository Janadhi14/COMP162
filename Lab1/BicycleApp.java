public class BicycleApp{
    public static void main(String[] args){
        Bicycle [] Bikes = {new Bicycle(610, false),
            new Bicycle(697,true),
            new Bicycle(660,false)};
        for(Bicycle bike: Bikes){
            System.out.println(bike);
        }
            
    }
    // write a second method 
    //The method should use a loop to determine the bicycle with the largest wheel, then display its data. 


}