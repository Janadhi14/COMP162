<<<<<<< HEAD
import java.io.File;
import java.util.ArrayList; // importing arraylist class
=======
>>>>>>> e191aa2 (slow)
import java.util.Scanner;// importing scanner 

public class AntJourney {
    private Point[] journey;
    private String antId;

    // default constructor
    AntJourney() {
    }

    // main constructor
    AntJourney(String id, Point[] journey) {
<<<<<<< HEAD
        // what we need this method to do is to take in the string and then convert the first item into the id  
        this.antId = id;
        this.journey =  journey;
=======
        String id =""; 
        Point[] journeyData = new Point[1];
        try{
           Scanner scan = new Scanner(new File("AntJourneys.txt"));
           while(scan.hasNextLine()){
              String line = scan.nextLine();
              Scanner lineScan = new Scanner(line);
              lineScan.useDelimiter(": ");
              id = lineScan.next();
              journeyData = new Point[numOfToken(line)+1];
              int i=1;
              journeyData[0] = new Point(0,0);
              journeyData[numOfToken(line)] = new Point(0,0); // for a given point 
              while(lineScan.hasNext()){
                 Scanner numScan = new Scanner(lineScan.next());
                 numScan.useDelimiter(",");
                 journeyData[i] = new Point(numScan.nextInt(), numScan.nextInt());
                 i++;
              }
              AntJourney ant = new AntJourney(id, journeyData);
              System.out.println("Details for: "+ ant.getId()); // printing out the details
              System.out.println("Shortest leg: "+ ant.getShortestLeg()); //now printing out the shortest leg 
              System.out.println("Longest leg: "+ ant.getLongestLeg()); // now printing out the longest leg 
              System.out.println("Total Distance: "+ ant.getDistanceTravelled());
              System.out.println("--- --- --- --- --- --- --- ---");
           }
        } catch(IOException e){
           System.out.println("File not found");
        }
        } catch (Exception e) {
            // prints out the exception message 
            System.out.println("there is some error in the format of the file");

        }

>>>>>>> e191aa2 (slow)
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
