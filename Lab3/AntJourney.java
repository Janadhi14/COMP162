public class AntJourney{
    private Point[] journey;
    private String antId;

    AntJourney(){}

    AntJourney(String id, Point[] journey){
        this.antId = id; // this is the name of the ant
        
    }
    public String getId(){
        return antId;
    }
    public void setId(String id){
    this.antId = id;
    }
    public double getDistanceTravelled(){
        double distance= 0; // initilizing a variable called distance 
        // now we want to go through the coordinates and calculate the distance between each 
        return distance;
    }
    public double getShortestleg(){
        double shortest = 0.0; // initilizing a length equal to 0.0
        // we want to go thorugh every ant in here and for every ant in this array we want to return the shortest distance 

        for(ant : ){ 
            if(ant.distanceToOtherPoint()< shortest);
            shortest = ant.distanceToOtherPoint();
        }
        return shortest;
    }
    public double getLongestDistance(){
        int longest = 0; // initilizing the longest variable 
        for(ant : )
        
        
        return longest;
    }

    // we need a toString method aswell 
    public String toString(){
        return (andId + );
    }
}