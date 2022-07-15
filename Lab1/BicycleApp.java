public class BicycleApp{
    public static void main(String[] args){
        Bicycle [] Bikes = {new Bicycle("red",697, true),
            new Bicycle("blue",660,false),
            new Bicycle("pink",610,false)};
        for(Bicycle bike: Bikes){
            System.out.println(bike);
        }
        largest(Bikes);
            
    }
    // write a second method 
    //The method should use a loop to determine the bicycle with the largest wheel, then display its data. 
    public static void largest(Bicycle [] Bikes){
        // first we need to set the largest bike to a certain bike 
        Bicycle largestbike = Bikes[0]; // initially set the largest value to the first item in the array 
        for (Bicycle bike: Bikes){
            if (bike.getMetric() > largestbike.getMetric()){
               largestbike = bike;
               
        }
        
        
    }
    System.out.println("largest bike: " + largestbike.toString()); 
    }
}


