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
        this.antId = id; // this is the name of the ant
        // need to create an array of coordinates
        Point[] journeyData = new Point[1];
        // now we need to try read a file
        try {
            // want to create a scanner

            Scanner san = new Scanner(new Flie("AntJourneys.txt"));
            // creating a string for each line
            // we need to run a while loop
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // now we want to scan through the line
                Scanner Linescan = new Scanner(line);
                // need to use a delimiter
                Linescan.useDelimiter(":");
                // we first need to set the first portion of the string as the id
                journeyData[0] = new Point[numOfToken(line) + 1];

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("there is some error in the format of the file");

        }
        {

        }
    }

    public String getId() {
        return antId;
    }

    public void setId(String id) {
        this.antId = id;
    }

    public double getDistanceTravelled() {
        double distance = 0; // initilizing a variable called distance
        // now we want to go through the coordinates and calculate the distance between
        // each
        return distance;
    }

    public double getShortestleg(){
        double shortest = 0.0; // initilizing a length equal to 0.0
        // we want to go thorugh every ant in here and for every ant in this array we want to return the shortest distance 

        for( : ){ 
            if(ant.distanceToOtherPoint()< shortest);
            shortest = ant.distanceToOtherPoint();
        }
        return shortest;
    }

    public double getLongestDistance(){
        int longest = 0; // initilizing the longest variable 
        // we want to run a for loop and 
        for(int i = 0; i.length(), i++){
            // we want to use the distance bewteentwopoints method and compare the distance between
            // n[i] and n[i+1] adn set this to a varible as current 
            // we want to set this to longest and then 
            // need to pass in 2 polint variables 
        }

    }
    //

    return longest;

    }

    // we need a toString method aswell
    public String toString(){
        return (andId + );
    }


}
