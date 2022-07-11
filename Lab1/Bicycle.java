import java.util.Scanner;
    

public class Bicycle{
    private int wheelDia;
    private boolean electric;
    private String colour;

        
    
    Bicycle(){}

    Bicycle(int wheelDia, boolean electric ){
        this.wheelDia = wheelDia; // setting the wheel diameter
        this.electric = electric; // setting the parameters
    }

    public void setColour(){
        System.out.println("what colour is the bicycle?:");
        try (Scanner sc = new Scanner(System.in)) {
            colour = sc.next(); // setting the new colour equal to teh input from the scanner.
            // setting the colour to the new scanner 
        }
    }
    public boolean isElectric(){
        return electric;   
    }

    public double getImperial(){
        return (wheelDia/25.4); // wheel diameter returning
    }
    public int getMetric(){
        return wheelDia; // returning the wheel diameter
    }
    public static String isElectric2(boolean electric){
        if(electric == true){ // checking if the parameter is electric 
            return "Electric"; // returns a string if it's electric 
        }else{
            return "Push-Bike"; // returning pushbike if its not true 
        }
    }
    
    public String toString(){
        return ("Bicycle is " + colour + ". Wheel size is " + getMetric() +  "inches. " + isElectric2(isElectric()));
    }
    
    



}