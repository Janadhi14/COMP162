public class BicycleApp{
    public static void main(String[] args){
        Bicycle [] Bikes = {new Bicycle("red",610, true),
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
               System.out.println("largest bike: " + largestbike.toString()); 
        }
        
        // retruns the string that displays the infomration about the last bike 
    }

    }
}


// based on the largest item in an array loop function 
/*Box largestBox = boxes[0]; // decalrinign a vairable of type box that keeps track of the largest box, similar to the temps , whre we set the largest box to a size of 0
        for (Box box: boxes){
            if (box.getVolume() > largestBox.getVolume()){ // calling the getvolum method adn check against teh current box that is being run 
                // so that if the current box is larger than the previous largest box it becomes the alrgest box 
                largestBox =  box; */