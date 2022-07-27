import java.io.File;
import java.util.ArrayList; // importing arraylist class
import java.util.Scanner;// importing scanner 

public class AntJourney {
    private Point[] journey;
    private String antId;

    // default constructor
    AntJourney() {
    }

    // main constructor
    AntJourney(String id, Point[] journey) {
        // what we need this method to do is to take in the string and then convert the first item into the id  
        this.antId = id;
        this.journey =  journey;
    }

    public String getId() {
        return antId;
    }

    public void setId(String id) {
        this.antId = id; // setting the antid to a string called id 
    }

    public double getDistanceTravelled(){
        double distance = 0; // initilizing a variable called distance
        // now we want to go through the coordinates and calculate the distance between
        // we need to return the distance variable after using teh point 
        distance += Math.sqrt(((0 - journey[0].getX()) * 2) + ((0 - journey[0].getY()) * 2)); // adding the distance from 0,0 to the first point 
        for(int p = 0; p < journey.length - 1; p++){
            distance += journey[p].distanceToOtherPoint(journey[p+1]);

            } 

            //now we need to add the distance form p-1 (0,0) to p1
            
            //we also need to add the distance to the end point 

        // takes in 2 points 
        return distance;
    }

    public double getShortestleg(){
        double shortest = 0.0; // initilizing a length equal to 0.0
        // we want to go thorugh every ant in here and for every ant in this array we want to return the shortest distance 

        for()  { 
            if(ant.distanceToOtherPoint() < shortest);
            shortest = ant.distanceToOtherPoint();
        }
        return shortest;
    }

    public double getLongestDistance(){
        int longest = 0; // initilizing the longest variable 
        // we want to run a for loop and initially set the longest distance to one of the distances form point 0,0 to point n1
        return longest;

    }

    // we need a toString method aswell
    public String toString(){
        return (andId + );
    }
        
        
}
